package com.bgamq.sso.service.impl;

import cn.hutool.crypto.digest.MD5;
import com.bgamq.sso.bean.Resp;
import com.bgamq.sso.bean.UserSign;
import com.bgamq.sso.dao.MongoDao;
import com.bgamq.sso.dao.RedisDao;
import com.bgamq.sso.utils.ConstantUtil;
import com.bgamq.sso.vo.UserSignVo;
import com.bgamq.sso.service.SignService;
import com.bgamq.sso.utils.CookieUtil;
import com.bgamq.sso.utils.JwtUtil;
import io.jsonwebtoken.impl.DefaultClaims;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Service
public class SignServiceImpl implements SignService {


    @Resource
    private MongoDao mongoData;

    @Resource
    private RedisDao redisDao;

    /**
     * Cookie失效时间
     */
    @Value("${sso.expiration.time}")
    private int expirationTime;

    @Override
    public UserSign getMongoUserNameAndPasswordById(String account, String password) {
        Map<String, Object> map = new HashMap();
        map.put("mobile", account);
        map.put("password", MD5.create().digestHex16(password));
        map.put("delete", false);
        List<UserSign> list = mongoData.selectByCondition("userSign", map, UserSign.class, 0, 0);
        if (list != null && list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public String getCookieAndRedisById(UserSignVo user, String account, HttpServletResponse response) {
        String tokeUuid = UUID.randomUUID().toString().substring(0, 5);
        HashMap<String, Object> map = new HashMap<>();
        map.put("username", user.getAccount());
        map.put("password", user.getPassword());
        map.put("tokeUuid", tokeUuid);
        DefaultClaims defaultClaims = new DefaultClaims();
        //jwt生成字符串
        String jwt = JwtUtil.buildJwt(map, defaultClaims);
        String LOGIN_USER_PREFIX_JWT = ConstantUtil.LOGIN_USER_PREFIX + jwt;
        //jwt保存到cookie
        CookieUtil.createCookie(response, ConstantUtil.BLOG_JWT_COOKIE, LOGIN_USER_PREFIX_JWT, expirationTime);
        //登录信息保存至redis
        redisDao.set(LOGIN_USER_PREFIX_JWT, account, expirationTime);
        //登陆成功返回
        return String.format("%s?blogCookie=%s", user.getService(), jwt);
    }

    @Override
    public boolean getLoginUserAndRedisById(String jwt) {
        //通过jwt令牌查询redis是否存在
        Object value = redisDao.get(jwt);
        if (!StringUtils.isEmpty(value)) {
            return true;
        }
        return false;
    }

    @Override
    public String getCookie(HttpServletResponse response) {
        String code = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        //指定字符串长度，拼接字符并toString
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            //根据索引值获取对应的字符,获取指定长度的字符串中任意一个字符的索引值
            stringBuffer.append(code.charAt(random.nextInt(code.length())));
        }
        String blogCode = stringBuffer.toString();
        //验证码存入Cookie
        CookieUtil.createCookie(response, ConstantUtil.BLOG_CODE_COOKIE, blogCode, null);
        return blogCode;
    }

}

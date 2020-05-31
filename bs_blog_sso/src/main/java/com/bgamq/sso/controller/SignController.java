package com.bgamq.sso.controller;

import com.bgamq.sso.bean.UserSign;
import com.bgamq.sso.utils.ConstantUtil;
import com.bgamq.sso.bean.Resp;
import com.bgamq.sso.utils.JwtUtil;
import com.bgamq.sso.vo.UserSignVo;
import com.bgamq.sso.service.SignService;
import com.bgamq.sso.utils.CookieUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Api(tags = "用户登录")
@RestController
@RequestMapping("/sso/sign")
public class SignController {

    @Resource
    private SignService signService;

    /**
     * 登录请求
     * @param service
     * @return
     */
    @ApiOperation("登录请求")
    @GetMapping("/login")
    public Resp<Object> login(@RequestParam(value = "service", required = false) String service,
                        HttpServletRequest request) {
        //判断用户是否处于登录状态
        if(this.jwtSignature(request)) {
            return Resp.ok(service);
        }
        return Resp.fail(null);
    }

    /**
     * 登录验证
     * @param user
     * @param response
     * @return
     */
    @ApiOperation("登录验证")
    @PostMapping("/login")
    public Resp<Object> login(UserSignVo user, HttpServletResponse response, HttpServletRequest request) {
        if(this.jwtSignature(request)) {
            //状态已登录返回跳转地址
            return Resp.ok(user.getService());
        }
        //判断用户是否存在
        UserSign userSign = signService.getMongoUserNameAndPasswordById(user.getAccount(), user.getPassword());
        if (userSign != null) {
            //登录成功返回跳转地址
            String service = signService.getCookieAndRedisById(user, userSign.getId(), response);
            return Resp.ok(service);
        }
        return Resp.fail(null);
    }

    /**
     * 生成验证码保存到Cookie
     * @return
     */
    @ApiOperation("获取验证码")
    @GetMapping("/code")
    public Resp<Object> code(HttpServletResponse response) {
        return Resp.ok(signService.getCookie(response));
    }


    /**
     * jwt令牌验签
     * @param request
     * @return
     */
    private boolean jwtSignature(HttpServletRequest request) {
        //cookie获取jwt令牌
        String jwt = CookieUtil.lookupCookie(request, ConstantUtil.BLOG_JWT_COOKIE);
        if(!StringUtils.isEmpty(jwt) && signService.getLoginUserAndRedisById(jwt)) {
            jwt = jwt.replace(ConstantUtil.LOGIN_USER_PREFIX, "");
            try {
                //jwt验签
                JwtUtil.checkJwt(jwt);
            }catch (Exception e) {
                //jwt验签失败
                return false;
            }
            //状态已登录返回跳转地址
            return true;
        }
        return false;
    }
}

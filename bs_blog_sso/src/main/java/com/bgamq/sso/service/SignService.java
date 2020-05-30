package com.bgamq.sso.service;

import com.bgamq.sso.bean.UserSign;
import com.bgamq.sso.vo.UserSignVo;

import javax.servlet.http.HttpServletResponse;

public interface SignService {
    UserSign getMongoUserNameAndPasswordById(String account, String password);

    String getCookieAndRedisById(UserSignVo user, String account, HttpServletResponse response);

    boolean getLoginUserAndRedisById(String jwt);

    String getCookie(HttpServletResponse response);
}

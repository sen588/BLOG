package com.bgamq.sso.vo;

import lombok.Data;

@Data
public class UserSignVo {

    /**
     * 登录用户名
     */
    private String account;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 登录成功后跳转的地址
     */
    private String service;
}

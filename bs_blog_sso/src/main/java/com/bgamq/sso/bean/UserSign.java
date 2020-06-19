package com.bgamq.sso.bean;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@ApiModel
@Data
@Document(collection="userSign")
public class UserSign {

    /**
     * 用户账号 唯一
     */
    private String id;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 电话号码 唯一
     */
    private String mobile;
    /**
     * 电子邮件 唯一
     */
    private String email;
    /**
     * 逻辑删除 false 未删除/true 已删除
     */
    private boolean delete;
    /**
     * 登录密码 MD5 16位加密
     */
    private String password;

    private DateTime dateTime;
}

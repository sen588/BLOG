package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_sys_log")
public class TSysLog {
    /**
     * 唯一uid
     */
    @Id
    private String uid;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 管理员uid
     */
    @Column(name = "admin_uid")
    private String adminUid;

    /**
     * 请求ip地址
     */
    private String ip;

    /**
     * 请求url
     */
    private String url;

    /**
     * 请求方式
     */
    private String type;

    /**
     * 请求类路径
     */
    @Column(name = "class_path")
    private String classPath;

    /**
     * 请求方法名
     */
    private String method;

    /**
     * 描述
     */
    private String operation;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * ip来源
     */
    @Column(name = "ip_source")
    private String ipSource;

    /**
     * 方法请求花费的时间
     */
    @Column(name = "spend_time")
    private Integer spendTime;

    /**
     * 逻辑删除
     */
    @Column(name = "is_del")
    private Byte isDel;

    /**
     * 请求参数
     */
    private String params;

    /**
     * 获取唯一uid
     *
     * @return uid - 唯一uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置唯一uid
     *
     * @param uid 唯一uid
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取管理员uid
     *
     * @return admin_uid - 管理员uid
     */
    public String getAdminUid() {
        return adminUid;
    }

    /**
     * 设置管理员uid
     *
     * @param adminUid 管理员uid
     */
    public void setAdminUid(String adminUid) {
        this.adminUid = adminUid == null ? null : adminUid.trim();
    }

    /**
     * 获取请求ip地址
     *
     * @return ip - 请求ip地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置请求ip地址
     *
     * @param ip 请求ip地址
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 获取请求url
     *
     * @return url - 请求url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置请求url
     *
     * @param url 请求url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取请求方式
     *
     * @return type - 请求方式
     */
    public String getType() {
        return type;
    }

    /**
     * 设置请求方式
     *
     * @param type 请求方式
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取请求类路径
     *
     * @return class_path - 请求类路径
     */
    public String getClassPath() {
        return classPath;
    }

    /**
     * 设置请求类路径
     *
     * @param classPath 请求类路径
     */
    public void setClassPath(String classPath) {
        this.classPath = classPath == null ? null : classPath.trim();
    }

    /**
     * 获取请求方法名
     *
     * @return method - 请求方法名
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置请求方法名
     *
     * @param method 请求方法名
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * 获取描述
     *
     * @return operation - 描述
     */
    public String getOperation() {
        return operation;
    }

    /**
     * 设置描述
     *
     * @param operation 描述
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取ip来源
     *
     * @return ip_source - ip来源
     */
    public String getIpSource() {
        return ipSource;
    }

    /**
     * 设置ip来源
     *
     * @param ipSource ip来源
     */
    public void setIpSource(String ipSource) {
        this.ipSource = ipSource == null ? null : ipSource.trim();
    }

    /**
     * 获取方法请求花费的时间
     *
     * @return spend_time - 方法请求花费的时间
     */
    public Integer getSpendTime() {
        return spendTime;
    }

    /**
     * 设置方法请求花费的时间
     *
     * @param spendTime 方法请求花费的时间
     */
    public void setSpendTime(Integer spendTime) {
        this.spendTime = spendTime;
    }

    /**
     * 获取逻辑删除
     *
     * @return is_del - 逻辑删除
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 设置逻辑删除
     *
     * @param isDel 逻辑删除
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取请求参数
     *
     * @return params - 请求参数
     */
    public String getParams() {
        return params;
    }

    /**
     * 设置请求参数
     *
     * @param params 请求参数
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }
}
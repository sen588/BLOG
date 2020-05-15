package com.bgamq.utils.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_system_config")
public class TSystemConfig {
    /**
     * 主键
     */
    @Id
    private String uid;

    /**
     * 服务器公钥
     */
    @Column(name = "qi_niu_access_key")
    private String qiNiuAccessKey;

    /**
     * 服务器私钥
     */
    @Column(name = "qi_niu_secret_key")
    private String qiNiuSecretKey;

    /**
     * 邮箱账号
     */
    private String email;

    /**
     * 邮箱发件人用户名
     */
    @Column(name = "email_user_name")
    private String emailUserName;

    /**
     * 邮箱密码
     */
    @Column(name = "email_password")
    private String emailPassword;

    /**
     * SMTP地址
     */
    @Column(name = "smtp_address")
    private String smtpAddress;

    /**
     * SMTP端口
     */
    @Column(name = "smtp_port")
    private String smtpPort;

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
     * 服务器上传空间
     */
    @Column(name = "qi_niu_bucket")
    private String qiNiuBucket;

    /**
     * 服务器存储区域 华东（z0）,华北(z1),华南(z2),北美(na0),东南亚(as0)
     */
    @Column(name = "qi_niu_area")
    private String qiNiuArea;

    /**
     * 图片是否上传服务器 (0:否, 1：是)
     */
    @Column(name = "upload_qi_niu")
    private String uploadQiNiu;

    /**
     * 图片是否上传本地存储 (0:否, 1：是)
     */
    @Column(name = "upload_local")
    private String uploadLocal;

    /**
     * 图片显示优先级（ 1 展示 七牛云,  0 本地）
     */
    @Column(name = "picture_priority")
    private String picturePriority;

    /**
     * 服务器域名前缀：http://images.moguit.cn
     */
    @Column(name = "qi_niu_picture_base_url")
    private String qiNiuPictureBaseUrl;

    /**
     * 本地服务器域名前缀：http://localhost:8600
     */
    @Column(name = "local_picture_base_url")
    private String localPictureBaseUrl;

    /**
     * 是否开启邮件通知(0:否, 1:是)
     */
    @Column(name = "start_email_notification")
    private String startEmailNotification;

    /**
     * 逻辑删除
     */
    @Column(name = "is_del")
    private Byte isDel;

    /**
     * 获取主键
     *
     * @return uid - 主键
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置主键
     *
     * @param uid 主键
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * 获取服务器公钥
     *
     * @return qi_niu_access_key - 服务器公钥
     */
    public String getQiNiuAccessKey() {
        return qiNiuAccessKey;
    }

    /**
     * 设置服务器公钥
     *
     * @param qiNiuAccessKey 服务器公钥
     */
    public void setQiNiuAccessKey(String qiNiuAccessKey) {
        this.qiNiuAccessKey = qiNiuAccessKey == null ? null : qiNiuAccessKey.trim();
    }

    /**
     * 获取服务器私钥
     *
     * @return qi_niu_secret_key - 服务器私钥
     */
    public String getQiNiuSecretKey() {
        return qiNiuSecretKey;
    }

    /**
     * 设置服务器私钥
     *
     * @param qiNiuSecretKey 服务器私钥
     */
    public void setQiNiuSecretKey(String qiNiuSecretKey) {
        this.qiNiuSecretKey = qiNiuSecretKey == null ? null : qiNiuSecretKey.trim();
    }

    /**
     * 获取邮箱账号
     *
     * @return email - 邮箱账号
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱账号
     *
     * @param email 邮箱账号
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取邮箱发件人用户名
     *
     * @return email_user_name - 邮箱发件人用户名
     */
    public String getEmailUserName() {
        return emailUserName;
    }

    /**
     * 设置邮箱发件人用户名
     *
     * @param emailUserName 邮箱发件人用户名
     */
    public void setEmailUserName(String emailUserName) {
        this.emailUserName = emailUserName == null ? null : emailUserName.trim();
    }

    /**
     * 获取邮箱密码
     *
     * @return email_password - 邮箱密码
     */
    public String getEmailPassword() {
        return emailPassword;
    }

    /**
     * 设置邮箱密码
     *
     * @param emailPassword 邮箱密码
     */
    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword == null ? null : emailPassword.trim();
    }

    /**
     * 获取SMTP地址
     *
     * @return smtp_address - SMTP地址
     */
    public String getSmtpAddress() {
        return smtpAddress;
    }

    /**
     * 设置SMTP地址
     *
     * @param smtpAddress SMTP地址
     */
    public void setSmtpAddress(String smtpAddress) {
        this.smtpAddress = smtpAddress == null ? null : smtpAddress.trim();
    }

    /**
     * 获取SMTP端口
     *
     * @return smtp_port - SMTP端口
     */
    public String getSmtpPort() {
        return smtpPort;
    }

    /**
     * 设置SMTP端口
     *
     * @param smtpPort SMTP端口
     */
    public void setSmtpPort(String smtpPort) {
        this.smtpPort = smtpPort == null ? null : smtpPort.trim();
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
     * 获取服务器上传空间
     *
     * @return qi_niu_bucket - 服务器上传空间
     */
    public String getQiNiuBucket() {
        return qiNiuBucket;
    }

    /**
     * 设置服务器上传空间
     *
     * @param qiNiuBucket 服务器上传空间
     */
    public void setQiNiuBucket(String qiNiuBucket) {
        this.qiNiuBucket = qiNiuBucket == null ? null : qiNiuBucket.trim();
    }

    /**
     * 获取服务器存储区域 华东（z0）,华北(z1),华南(z2),北美(na0),东南亚(as0)
     *
     * @return qi_niu_area - 服务器存储区域 华东（z0）,华北(z1),华南(z2),北美(na0),东南亚(as0)
     */
    public String getQiNiuArea() {
        return qiNiuArea;
    }

    /**
     * 设置服务器存储区域 华东（z0）,华北(z1),华南(z2),北美(na0),东南亚(as0)
     *
     * @param qiNiuArea 服务器存储区域 华东（z0）,华北(z1),华南(z2),北美(na0),东南亚(as0)
     */
    public void setQiNiuArea(String qiNiuArea) {
        this.qiNiuArea = qiNiuArea == null ? null : qiNiuArea.trim();
    }

    /**
     * 获取图片是否上传服务器 (0:否, 1：是)
     *
     * @return upload_qi_niu - 图片是否上传服务器 (0:否, 1：是)
     */
    public String getUploadQiNiu() {
        return uploadQiNiu;
    }

    /**
     * 设置图片是否上传服务器 (0:否, 1：是)
     *
     * @param uploadQiNiu 图片是否上传服务器 (0:否, 1：是)
     */
    public void setUploadQiNiu(String uploadQiNiu) {
        this.uploadQiNiu = uploadQiNiu == null ? null : uploadQiNiu.trim();
    }

    /**
     * 获取图片是否上传本地存储 (0:否, 1：是)
     *
     * @return upload_local - 图片是否上传本地存储 (0:否, 1：是)
     */
    public String getUploadLocal() {
        return uploadLocal;
    }

    /**
     * 设置图片是否上传本地存储 (0:否, 1：是)
     *
     * @param uploadLocal 图片是否上传本地存储 (0:否, 1：是)
     */
    public void setUploadLocal(String uploadLocal) {
        this.uploadLocal = uploadLocal == null ? null : uploadLocal.trim();
    }

    /**
     * 获取图片显示优先级（ 1 展示 七牛云,  0 本地）
     *
     * @return picture_priority - 图片显示优先级（ 1 展示 七牛云,  0 本地）
     */
    public String getPicturePriority() {
        return picturePriority;
    }

    /**
     * 设置图片显示优先级（ 1 展示 七牛云,  0 本地）
     *
     * @param picturePriority 图片显示优先级（ 1 展示 七牛云,  0 本地）
     */
    public void setPicturePriority(String picturePriority) {
        this.picturePriority = picturePriority == null ? null : picturePriority.trim();
    }

    /**
     * 获取服务器域名前缀：http://images.moguit.cn
     *
     * @return qi_niu_picture_base_url - 服务器域名前缀：http://images.moguit.cn
     */
    public String getQiNiuPictureBaseUrl() {
        return qiNiuPictureBaseUrl;
    }

    /**
     * 设置服务器域名前缀：http://images.moguit.cn
     *
     * @param qiNiuPictureBaseUrl 服务器域名前缀：http://images.moguit.cn
     */
    public void setQiNiuPictureBaseUrl(String qiNiuPictureBaseUrl) {
        this.qiNiuPictureBaseUrl = qiNiuPictureBaseUrl == null ? null : qiNiuPictureBaseUrl.trim();
    }

    /**
     * 获取本地服务器域名前缀：http://localhost:8600
     *
     * @return local_picture_base_url - 本地服务器域名前缀：http://localhost:8600
     */
    public String getLocalPictureBaseUrl() {
        return localPictureBaseUrl;
    }

    /**
     * 设置本地服务器域名前缀：http://localhost:8600
     *
     * @param localPictureBaseUrl 本地服务器域名前缀：http://localhost:8600
     */
    public void setLocalPictureBaseUrl(String localPictureBaseUrl) {
        this.localPictureBaseUrl = localPictureBaseUrl == null ? null : localPictureBaseUrl.trim();
    }

    /**
     * 获取是否开启邮件通知(0:否, 1:是)
     *
     * @return start_email_notification - 是否开启邮件通知(0:否, 1:是)
     */
    public String getStartEmailNotification() {
        return startEmailNotification;
    }

    /**
     * 设置是否开启邮件通知(0:否, 1:是)
     *
     * @param startEmailNotification 是否开启邮件通知(0:否, 1:是)
     */
    public void setStartEmailNotification(String startEmailNotification) {
        this.startEmailNotification = startEmailNotification == null ? null : startEmailNotification.trim();
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
}
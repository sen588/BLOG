package com.bgamq.utils.entity;

import java.io.Serializable;
import java.util.Date;

public class TSystemConfig implements Serializable {
    private String uid;

    private String qiNiuAccessKey;

    private String qiNiuSecretKey;

    private String email;

    private String emailUserName;

    private String emailPassword;

    private String smtpAddress;

    private String smtpPort;

    private Boolean status;

    private Date createTime;

    private Date updateTime;

    private String qiNiuBucket;

    private String qiNiuArea;

    private String uploadQiNiu;

    private String uploadLocal;

    private String picturePriority;

    private String qiNiuPictureBaseUrl;

    private String localPictureBaseUrl;

    private String startEmailNotification;

    private Boolean isDel;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getQiNiuAccessKey() {
        return qiNiuAccessKey;
    }

    public void setQiNiuAccessKey(String qiNiuAccessKey) {
        this.qiNiuAccessKey = qiNiuAccessKey == null ? null : qiNiuAccessKey.trim();
    }

    public String getQiNiuSecretKey() {
        return qiNiuSecretKey;
    }

    public void setQiNiuSecretKey(String qiNiuSecretKey) {
        this.qiNiuSecretKey = qiNiuSecretKey == null ? null : qiNiuSecretKey.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEmailUserName() {
        return emailUserName;
    }

    public void setEmailUserName(String emailUserName) {
        this.emailUserName = emailUserName == null ? null : emailUserName.trim();
    }

    public String getEmailPassword() {
        return emailPassword;
    }

    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword == null ? null : emailPassword.trim();
    }

    public String getSmtpAddress() {
        return smtpAddress;
    }

    public void setSmtpAddress(String smtpAddress) {
        this.smtpAddress = smtpAddress == null ? null : smtpAddress.trim();
    }

    public String getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(String smtpPort) {
        this.smtpPort = smtpPort == null ? null : smtpPort.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getQiNiuBucket() {
        return qiNiuBucket;
    }

    public void setQiNiuBucket(String qiNiuBucket) {
        this.qiNiuBucket = qiNiuBucket == null ? null : qiNiuBucket.trim();
    }

    public String getQiNiuArea() {
        return qiNiuArea;
    }

    public void setQiNiuArea(String qiNiuArea) {
        this.qiNiuArea = qiNiuArea == null ? null : qiNiuArea.trim();
    }

    public String getUploadQiNiu() {
        return uploadQiNiu;
    }

    public void setUploadQiNiu(String uploadQiNiu) {
        this.uploadQiNiu = uploadQiNiu == null ? null : uploadQiNiu.trim();
    }

    public String getUploadLocal() {
        return uploadLocal;
    }

    public void setUploadLocal(String uploadLocal) {
        this.uploadLocal = uploadLocal == null ? null : uploadLocal.trim();
    }

    public String getPicturePriority() {
        return picturePriority;
    }

    public void setPicturePriority(String picturePriority) {
        this.picturePriority = picturePriority == null ? null : picturePriority.trim();
    }

    public String getQiNiuPictureBaseUrl() {
        return qiNiuPictureBaseUrl;
    }

    public void setQiNiuPictureBaseUrl(String qiNiuPictureBaseUrl) {
        this.qiNiuPictureBaseUrl = qiNiuPictureBaseUrl == null ? null : qiNiuPictureBaseUrl.trim();
    }

    public String getLocalPictureBaseUrl() {
        return localPictureBaseUrl;
    }

    public void setLocalPictureBaseUrl(String localPictureBaseUrl) {
        this.localPictureBaseUrl = localPictureBaseUrl == null ? null : localPictureBaseUrl.trim();
    }

    public String getStartEmailNotification() {
        return startEmailNotification;
    }

    public void setStartEmailNotification(String startEmailNotification) {
        this.startEmailNotification = startEmailNotification == null ? null : startEmailNotification.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", qiNiuAccessKey=").append(qiNiuAccessKey);
        sb.append(", qiNiuSecretKey=").append(qiNiuSecretKey);
        sb.append(", email=").append(email);
        sb.append(", emailUserName=").append(emailUserName);
        sb.append(", emailPassword=").append(emailPassword);
        sb.append(", smtpAddress=").append(smtpAddress);
        sb.append(", smtpPort=").append(smtpPort);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", qiNiuBucket=").append(qiNiuBucket);
        sb.append(", qiNiuArea=").append(qiNiuArea);
        sb.append(", uploadQiNiu=").append(uploadQiNiu);
        sb.append(", uploadLocal=").append(uploadLocal);
        sb.append(", picturePriority=").append(picturePriority);
        sb.append(", qiNiuPictureBaseUrl=").append(qiNiuPictureBaseUrl);
        sb.append(", localPictureBaseUrl=").append(localPictureBaseUrl);
        sb.append(", startEmailNotification=").append(startEmailNotification);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
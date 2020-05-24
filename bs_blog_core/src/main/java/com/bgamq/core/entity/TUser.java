package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class TUser {
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
     * 密码
     */
    @Column(name = "pass_word")
    private String passWord;

    /**
     * 性别(1:男2:女)
     */
    private Byte gender;

    /**
     * 个人头像
     */
    private String avatar;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 出生年月日
     */
    private Date birthday;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 邮箱验证码
     */
    @Column(name = "valid_code")
    private String validCode;

    /**
     * 自我简介最多150字
     */
    private String summary;

    /**
     * 登录次数
     */
    @Column(name = "login_count")
    private Integer loginCount;

    /**
     * 最后登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 最后登录IP
     */
    @Column(name = "last_login_ip")
    private String lastLoginIp;

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
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 资料来源
     */
    private String source;

    /**
     * 平台uuid
     */
    private String uuid;

    /**
     * QQ号
     */
    @Column(name = "qq_number")
    private String qqNumber;

    /**
     * 微信号
     */
    @Column(name = "we_chat")
    private String weChat;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 评论状态 1:正常 0:禁言
     */
    @Column(name = "comment_status")
    private Byte commentStatus;

    /**
     * ip来源
     */
    @Column(name = "ip_source")
    private String ipSource;

    /**
     * 浏览器
     */
    private String browser;

    /**
     * 操作系统
     */
    private String os;

    /**
     * 是否开启邮件通知 1:开启 0:关闭
     */
    @Column(name = "start_email_notification")
    private Byte startEmailNotification;

    /**
     * 用户标签：0：普通用户,1：管理员,2：博主 等
     */
    @Column(name = "user_tag")
    private Byte userTag;

    /**
     * 逻辑删除
     */
    @Column(name = "is_del")
    private Byte isDel;

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
     * 获取密码
     *
     * @return pass_word - 密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置密码
     *
     * @param passWord 密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    /**
     * 获取性别(1:男2:女)
     *
     * @return gender - 性别(1:男2:女)
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * 设置性别(1:男2:女)
     *
     * @param gender 性别(1:男2:女)
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * 获取个人头像
     *
     * @return avatar - 个人头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置个人头像
     *
     * @param avatar 个人头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取出生年月日
     *
     * @return birthday - 出生年月日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生年月日
     *
     * @param birthday 出生年月日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取手机
     *
     * @return mobile - 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取邮箱验证码
     *
     * @return valid_code - 邮箱验证码
     */
    public String getValidCode() {
        return validCode;
    }

    /**
     * 设置邮箱验证码
     *
     * @param validCode 邮箱验证码
     */
    public void setValidCode(String validCode) {
        this.validCode = validCode == null ? null : validCode.trim();
    }

    /**
     * 获取自我简介最多150字
     *
     * @return summary - 自我简介最多150字
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置自我简介最多150字
     *
     * @param summary 自我简介最多150字
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * 获取登录次数
     *
     * @return login_count - 登录次数
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * 设置登录次数
     *
     * @param loginCount 登录次数
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * 获取最后登录时间
     *
     * @return last_login_time - 最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取最后登录IP
     *
     * @return last_login_ip - 最后登录IP
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 设置最后登录IP
     *
     * @param lastLoginIp 最后登录IP
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
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
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取资料来源
     *
     * @return source - 资料来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置资料来源
     *
     * @param source 资料来源
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 获取平台uuid
     *
     * @return uuid - 平台uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 设置平台uuid
     *
     * @param uuid 平台uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * 获取QQ号
     *
     * @return qq_number - QQ号
     */
    public String getQqNumber() {
        return qqNumber;
    }

    /**
     * 设置QQ号
     *
     * @param qqNumber QQ号
     */
    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber == null ? null : qqNumber.trim();
    }

    /**
     * 获取微信号
     *
     * @return we_chat - 微信号
     */
    public String getWeChat() {
        return weChat;
    }

    /**
     * 设置微信号
     *
     * @param weChat 微信号
     */
    public void setWeChat(String weChat) {
        this.weChat = weChat == null ? null : weChat.trim();
    }

    /**
     * 获取职业
     *
     * @return occupation - 职业
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * 设置职业
     *
     * @param occupation 职业
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    /**
     * 获取评论状态 1:正常 0:禁言
     *
     * @return comment_status - 评论状态 1:正常 0:禁言
     */
    public Byte getCommentStatus() {
        return commentStatus;
    }

    /**
     * 设置评论状态 1:正常 0:禁言
     *
     * @param commentStatus 评论状态 1:正常 0:禁言
     */
    public void setCommentStatus(Byte commentStatus) {
        this.commentStatus = commentStatus;
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
     * 获取浏览器
     *
     * @return browser - 浏览器
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * 设置浏览器
     *
     * @param browser 浏览器
     */
    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    /**
     * 获取操作系统
     *
     * @return os - 操作系统
     */
    public String getOs() {
        return os;
    }

    /**
     * 设置操作系统
     *
     * @param os 操作系统
     */
    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    /**
     * 获取是否开启邮件通知 1:开启 0:关闭
     *
     * @return start_email_notification - 是否开启邮件通知 1:开启 0:关闭
     */
    public Byte getStartEmailNotification() {
        return startEmailNotification;
    }

    /**
     * 设置是否开启邮件通知 1:开启 0:关闭
     *
     * @param startEmailNotification 是否开启邮件通知 1:开启 0:关闭
     */
    public void setStartEmailNotification(Byte startEmailNotification) {
        this.startEmailNotification = startEmailNotification;
    }

    /**
     * 获取用户标签：0：普通用户,1：管理员,2：博主 等
     *
     * @return user_tag - 用户标签：0：普通用户,1：管理员,2：博主 等
     */
    public Byte getUserTag() {
        return userTag;
    }

    /**
     * 设置用户标签：0：普通用户,1：管理员,2：博主 等
     *
     * @param userTag 用户标签：0：普通用户,1：管理员,2：博主 等
     */
    public void setUserTag(Byte userTag) {
        this.userTag = userTag;
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

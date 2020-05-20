package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_admin")
public class TAdmin {
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
    private String gender;

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
     * github地址
     */
    private String github;

    /**
     * gitee地址
     */
    private String gitee;

    /**
     * 拥有的角色uid
     */
    @Column(name = "role_uid")
    private String roleUid;

    /**
     * 逻辑删除
     */
    @Column(name = "is_del")
    private Byte isDel;

    /**
     * 履历
     */
    @Column(name = "person_resume")
    private String personResume;

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
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别(1:男2:女)
     *
     * @param gender 性别(1:男2:女)
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
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
     * 获取github地址
     *
     * @return github - github地址
     */
    public String getGithub() {
        return github;
    }

    /**
     * 设置github地址
     *
     * @param github github地址
     */
    public void setGithub(String github) {
        this.github = github == null ? null : github.trim();
    }

    /**
     * 获取gitee地址
     *
     * @return gitee - gitee地址
     */
    public String getGitee() {
        return gitee;
    }

    /**
     * 设置gitee地址
     *
     * @param gitee gitee地址
     */
    public void setGitee(String gitee) {
        this.gitee = gitee == null ? null : gitee.trim();
    }

    /**
     * 获取拥有的角色uid
     *
     * @return role_uid - 拥有的角色uid
     */
    public String getRoleUid() {
        return roleUid;
    }

    /**
     * 设置拥有的角色uid
     *
     * @param roleUid 拥有的角色uid
     */
    public void setRoleUid(String roleUid) {
        this.roleUid = roleUid == null ? null : roleUid.trim();
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
     * 获取履历
     *
     * @return person_resume - 履历
     */
    public String getPersonResume() {
        return personResume;
    }

    /**
     * 设置履历
     *
     * @param personResume 履历
     */
    public void setPersonResume(String personResume) {
        this.personResume = personResume == null ? null : personResume.trim();
    }
}
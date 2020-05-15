package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_web_visit")
public class TWebVisit {
    /**
     * 主键
     */
    @Id
    private String uid;

    /**
     * 用户uid
     */
    @Column(name = "user_uid")
    private String userUid;

    /**
     * 访问ip地址
     */
    private String ip;

    /**
     * 用户行为
     */
    private String behavior;

    /**
     * 模块uid（文章uid,标签uid,分类uid）
     */
    @Column(name = "module_uid")
    private String moduleUid;

    /**
     * 附加数据(比如搜索内容)
     */
    @Column(name = "other_data")
    private String otherData;

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
     * 操作系统
     */
    private String os;

    /**
     * 浏览器
     */
    private String browser;

    /**
     * ip来源
     */
    @Column(name = "ip_source")
    private String ipSource;

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
     * 获取用户uid
     *
     * @return user_uid - 用户uid
     */
    public String getUserUid() {
        return userUid;
    }

    /**
     * 设置用户uid
     *
     * @param userUid 用户uid
     */
    public void setUserUid(String userUid) {
        this.userUid = userUid == null ? null : userUid.trim();
    }

    /**
     * 获取访问ip地址
     *
     * @return ip - 访问ip地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置访问ip地址
     *
     * @param ip 访问ip地址
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 获取用户行为
     *
     * @return behavior - 用户行为
     */
    public String getBehavior() {
        return behavior;
    }

    /**
     * 设置用户行为
     *
     * @param behavior 用户行为
     */
    public void setBehavior(String behavior) {
        this.behavior = behavior == null ? null : behavior.trim();
    }

    /**
     * 获取模块uid（文章uid,标签uid,分类uid）
     *
     * @return module_uid - 模块uid（文章uid,标签uid,分类uid）
     */
    public String getModuleUid() {
        return moduleUid;
    }

    /**
     * 设置模块uid（文章uid,标签uid,分类uid）
     *
     * @param moduleUid 模块uid（文章uid,标签uid,分类uid）
     */
    public void setModuleUid(String moduleUid) {
        this.moduleUid = moduleUid == null ? null : moduleUid.trim();
    }

    /**
     * 获取附加数据(比如搜索内容)
     *
     * @return other_data - 附加数据(比如搜索内容)
     */
    public String getOtherData() {
        return otherData;
    }

    /**
     * 设置附加数据(比如搜索内容)
     *
     * @param otherData 附加数据(比如搜索内容)
     */
    public void setOtherData(String otherData) {
        this.otherData = otherData == null ? null : otherData.trim();
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
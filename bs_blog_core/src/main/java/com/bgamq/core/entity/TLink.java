package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_link")
public class TLink {
    /**
     * 唯一uid
     */
    @Id
    private String uid;

    /**
     * 友情链接标题
     */
    private String title;

    /**
     * 友情链接介绍
     */
    private String summary;

    /**
     * 友情链接URL
     */
    private String url;

    /**
     * 点击数
     */
    @Column(name = "click_count")
    private Integer clickCount;

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
     * 状态
     */
    private Byte status;

    /**
     * 排序字段,越大越靠前
     */
    private Integer sort;

    /**
     * 友链状态： 0 申请中, 1：已上线,  2：已下架
     */
    @Column(name = "link_status")
    private Byte linkStatus;

    /**
     * 申请用户UID
     */
    @Column(name = "user_uid")
    private String userUid;

    /**
     * 操作管理员UID
     */
    @Column(name = "admin_uid")
    private String adminUid;

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
     * 获取友情链接标题
     *
     * @return title - 友情链接标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置友情链接标题
     *
     * @param title 友情链接标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取友情链接介绍
     *
     * @return summary - 友情链接介绍
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置友情链接介绍
     *
     * @param summary 友情链接介绍
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * 获取友情链接URL
     *
     * @return url - 友情链接URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置友情链接URL
     *
     * @param url 友情链接URL
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取点击数
     *
     * @return click_count - 点击数
     */
    public Integer getClickCount() {
        return clickCount;
    }

    /**
     * 设置点击数
     *
     * @param clickCount 点击数
     */
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
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
     * 获取排序字段,越大越靠前
     *
     * @return sort - 排序字段,越大越靠前
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序字段,越大越靠前
     *
     * @param sort 排序字段,越大越靠前
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取友链状态： 0 申请中, 1：已上线,  2：已下架
     *
     * @return link_status - 友链状态： 0 申请中, 1：已上线,  2：已下架
     */
    public Byte getLinkStatus() {
        return linkStatus;
    }

    /**
     * 设置友链状态： 0 申请中, 1：已上线,  2：已下架
     *
     * @param linkStatus 友链状态： 0 申请中, 1：已上线,  2：已下架
     */
    public void setLinkStatus(Byte linkStatus) {
        this.linkStatus = linkStatus;
    }

    /**
     * 获取申请用户UID
     *
     * @return user_uid - 申请用户UID
     */
    public String getUserUid() {
        return userUid;
    }

    /**
     * 设置申请用户UID
     *
     * @param userUid 申请用户UID
     */
    public void setUserUid(String userUid) {
        this.userUid = userUid == null ? null : userUid.trim();
    }

    /**
     * 获取操作管理员UID
     *
     * @return admin_uid - 操作管理员UID
     */
    public String getAdminUid() {
        return adminUid;
    }

    /**
     * 设置操作管理员UID
     *
     * @param adminUid 操作管理员UID
     */
    public void setAdminUid(String adminUid) {
        this.adminUid = adminUid == null ? null : adminUid.trim();
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

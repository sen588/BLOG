package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_study_video")
public class TStudyVideo {
    /**
     * 唯一uid
     */
    @Id
    private String uid;

    /**
     * 视频封面图片uid
     */
    @Column(name = "file_uid")
    private String fileUid;

    /**
     * 资源分类UID
     */
    @Column(name = "resource_sort_uid")
    private String resourceSortUid;

    /**
     * 视频名称
     */
    private String name;

    /**
     * 视频简介
     */
    private String summary;

    /**
     * 分类介绍
     */
    private String content;

    /**
     * 百度云完整路径
     */
    @Column(name = "baidu_path")
    private String baiduPath;

    /**
     * 点击数
     */
    @Column(name = "click_count")
    private String clickCount;

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

    @Column(name = "parent_uid")
    private String parentUid;

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
     * 获取视频封面图片uid
     *
     * @return file_uid - 视频封面图片uid
     */
    public String getFileUid() {
        return fileUid;
    }

    /**
     * 设置视频封面图片uid
     *
     * @param fileUid 视频封面图片uid
     */
    public void setFileUid(String fileUid) {
        this.fileUid = fileUid == null ? null : fileUid.trim();
    }

    /**
     * 获取资源分类UID
     *
     * @return resource_sort_uid - 资源分类UID
     */
    public String getResourceSortUid() {
        return resourceSortUid;
    }

    /**
     * 设置资源分类UID
     *
     * @param resourceSortUid 资源分类UID
     */
    public void setResourceSortUid(String resourceSortUid) {
        this.resourceSortUid = resourceSortUid == null ? null : resourceSortUid.trim();
    }

    /**
     * 获取视频名称
     *
     * @return name - 视频名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置视频名称
     *
     * @param name 视频名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取视频简介
     *
     * @return summary - 视频简介
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置视频简介
     *
     * @param summary 视频简介
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * 获取分类介绍
     *
     * @return content - 分类介绍
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置分类介绍
     *
     * @param content 分类介绍
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取百度云完整路径
     *
     * @return baidu_path - 百度云完整路径
     */
    public String getBaiduPath() {
        return baiduPath;
    }

    /**
     * 设置百度云完整路径
     *
     * @param baiduPath 百度云完整路径
     */
    public void setBaiduPath(String baiduPath) {
        this.baiduPath = baiduPath == null ? null : baiduPath.trim();
    }

    /**
     * 获取点击数
     *
     * @return click_count - 点击数
     */
    public String getClickCount() {
        return clickCount;
    }

    /**
     * 设置点击数
     *
     * @param clickCount 点击数
     */
    public void setClickCount(String clickCount) {
        this.clickCount = clickCount == null ? null : clickCount.trim();
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
     * @return parent_uid
     */
    public String getParentUid() {
        return parentUid;
    }

    /**
     * @param parentUid
     */
    public void setParentUid(String parentUid) {
        this.parentUid = parentUid == null ? null : parentUid.trim();
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

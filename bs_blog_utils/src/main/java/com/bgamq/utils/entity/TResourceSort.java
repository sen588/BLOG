package com.bgamq.utils.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_resource_sort")
public class TResourceSort {
    /**
     * 唯一uid
     */
    @Id
    private String uid;

    /**
     * 分类图片uid
     */
    @Column(name = "file_uid")
    private String fileUid;

    /**
     * 分类名
     */
    @Column(name = "sort_name")
    private String sortName;

    /**
     * 分类介绍
     */
    private String content;

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

    /**
     * 父UID
     */
    @Column(name = "parent_uid")
    private String parentUid;

    /**
     * 排序字段
     */
    private Integer sort;

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
     * 获取分类图片uid
     *
     * @return file_uid - 分类图片uid
     */
    public String getFileUid() {
        return fileUid;
    }

    /**
     * 设置分类图片uid
     *
     * @param fileUid 分类图片uid
     */
    public void setFileUid(String fileUid) {
        this.fileUid = fileUid == null ? null : fileUid.trim();
    }

    /**
     * 获取分类名
     *
     * @return sort_name - 分类名
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * 设置分类名
     *
     * @param sortName 分类名
     */
    public void setSortName(String sortName) {
        this.sortName = sortName == null ? null : sortName.trim();
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
     * 获取父UID
     *
     * @return parent_uid - 父UID
     */
    public String getParentUid() {
        return parentUid;
    }

    /**
     * 设置父UID
     *
     * @param parentUid 父UID
     */
    public void setParentUid(String parentUid) {
        this.parentUid = parentUid == null ? null : parentUid.trim();
    }

    /**
     * 获取排序字段
     *
     * @return sort - 排序字段
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序字段
     *
     * @param sort 排序字段
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
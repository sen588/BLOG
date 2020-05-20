package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_picture_sort")
public class TPictureSort {
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
    private String name;

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
     * 排序字段,越大越靠前
     */
    private Integer sort;

    /**
     * 是否显示,1：是,0,否
     */
    @Column(name = "is_show")
    private Byte isShow;

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
     * @return name - 分类名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名
     *
     * @param name 分类名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * 获取是否显示,1：是,0,否
     *
     * @return is_show - 是否显示,1：是,0,否
     */
    public Byte getIsShow() {
        return isShow;
    }

    /**
     * 设置是否显示,1：是,0,否
     *
     * @param isShow 是否显示,1：是,0,否
     */
    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
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
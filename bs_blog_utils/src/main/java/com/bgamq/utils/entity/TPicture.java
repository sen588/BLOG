package com.bgamq.utils.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_picture")
public class TPicture {
    /**
     * 唯一uid
     */
    @Id
    private String uid;

    /**
     * 图片uid
     */
    @Column(name = "file_uid")
    private String fileUid;

    /**
     * 图片名
     */
    @Column(name = "pic_name")
    private String picName;

    /**
     * 分类uid
     */
    @Column(name = "picture_sort_uid")
    private String pictureSortUid;

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
     * 获取图片uid
     *
     * @return file_uid - 图片uid
     */
    public String getFileUid() {
        return fileUid;
    }

    /**
     * 设置图片uid
     *
     * @param fileUid 图片uid
     */
    public void setFileUid(String fileUid) {
        this.fileUid = fileUid == null ? null : fileUid.trim();
    }

    /**
     * 获取图片名
     *
     * @return pic_name - 图片名
     */
    public String getPicName() {
        return picName;
    }

    /**
     * 设置图片名
     *
     * @param picName 图片名
     */
    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    /**
     * 获取分类uid
     *
     * @return picture_sort_uid - 分类uid
     */
    public String getPictureSortUid() {
        return pictureSortUid;
    }

    /**
     * 设置分类uid
     *
     * @param pictureSortUid 分类uid
     */
    public void setPictureSortUid(String pictureSortUid) {
        this.pictureSortUid = pictureSortUid == null ? null : pictureSortUid.trim();
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
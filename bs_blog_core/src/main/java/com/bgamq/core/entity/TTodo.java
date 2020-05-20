package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_todo")
public class TTodo {
    /**
     * 唯一uid
     */
    @Id
    private String uid;

    /**
     * 管理员uid
     */
    @Column(name = "admin_uid")
    private String adminUid;

    /**
     * 内容
     */
    private String text;

    /**
     * 表示事项是否完成（0：未完成 1：已完成）
     */
    private Byte done;

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
     * 获取管理员uid
     *
     * @return admin_uid - 管理员uid
     */
    public String getAdminUid() {
        return adminUid;
    }

    /**
     * 设置管理员uid
     *
     * @param adminUid 管理员uid
     */
    public void setAdminUid(String adminUid) {
        this.adminUid = adminUid == null ? null : adminUid.trim();
    }

    /**
     * 获取内容
     *
     * @return text - 内容
     */
    public String getText() {
        return text;
    }

    /**
     * 设置内容
     *
     * @param text 内容
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    /**
     * 获取表示事项是否完成（0：未完成 1：已完成）
     *
     * @return done - 表示事项是否完成（0：未完成 1：已完成）
     */
    public Byte getDone() {
        return done;
    }

    /**
     * 设置表示事项是否完成（0：未完成 1：已完成）
     *
     * @param done 表示事项是否完成（0：未完成 1：已完成）
     */
    public void setDone(Byte done) {
        this.done = done;
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
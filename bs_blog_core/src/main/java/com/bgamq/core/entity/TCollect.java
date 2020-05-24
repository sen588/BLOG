package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_collect")
public class TCollect {
    /**
     * 唯一uid
     */
    @Id
    private String uid;

    /**
     * 用户的uid
     */
    @Column(name = "user_uid")
    private String userUid;

    /**
     * 博客的uid
     */
    @Column(name = "blog_uid")
    private String blogUid;

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
     * 获取用户的uid
     *
     * @return user_uid - 用户的uid
     */
    public String getUserUid() {
        return userUid;
    }

    /**
     * 设置用户的uid
     *
     * @param userUid 用户的uid
     */
    public void setUserUid(String userUid) {
        this.userUid = userUid == null ? null : userUid.trim();
    }

    /**
     * 获取博客的uid
     *
     * @return blog_uid - 博客的uid
     */
    public String getBlogUid() {
        return blogUid;
    }

    /**
     * 设置博客的uid
     *
     * @param blogUid 博客的uid
     */
    public void setBlogUid(String blogUid) {
        this.blogUid = blogUid == null ? null : blogUid.trim();
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

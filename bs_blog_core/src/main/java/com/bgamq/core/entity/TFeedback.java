package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_feedback")
public class TFeedback {
    /**
     * 唯一uid
     */
    @Id
    private String uid;

    /**
     * 用户uid
     */
    @Column(name = "user_uid")
    private String userUid;

    /**
     * 反馈的内容
     */
    private String content;

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
     * 标题
     */
    private String title;

    /**
     * 反馈状态： 0：已开启  1：进行中  2：已完成  3：已拒绝
     */
    @Column(name = "feedback_status")
    private Byte feedbackStatus;

    /**
     * 回复
     */
    private String reply;

    /**
     * 管理员uid
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
     * 获取反馈的内容
     *
     * @return content - 反馈的内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置反馈的内容
     *
     * @param content 反馈的内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取反馈状态： 0：已开启  1：进行中  2：已完成  3：已拒绝
     *
     * @return feedback_status - 反馈状态： 0：已开启  1：进行中  2：已完成  3：已拒绝
     */
    public Byte getFeedbackStatus() {
        return feedbackStatus;
    }

    /**
     * 设置反馈状态： 0：已开启  1：进行中  2：已完成  3：已拒绝
     *
     * @param feedbackStatus 反馈状态： 0：已开启  1：进行中  2：已完成  3：已拒绝
     */
    public void setFeedbackStatus(Byte feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    /**
     * 获取回复
     *
     * @return reply - 回复
     */
    public String getReply() {
        return reply;
    }

    /**
     * 设置回复
     *
     * @param reply 回复
     */
    public void setReply(String reply) {
        this.reply = reply == null ? null : reply.trim();
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

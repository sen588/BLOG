package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_comment_report")
public class TCommentReport {
    /**
     * 唯一uid
     */
    @Id
    private String uid;

    /**
     * 举报人uid
     */
    @Column(name = "user_uid")
    private String userUid;

    /**
     * 被举报的评论Uid
     */
    @Column(name = "report_comment_uid")
    private String reportCommentUid;

    /**
     * 被举报的用户uid
     */
    @Column(name = "report_user_uid")
    private String reportUserUid;

    /**
     * 举报的原因
     */
    private String content;

    /**
     * 进展状态: 0 未查看   1: 已查看  2：已处理
     */
    private Byte progress;

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
     * 获取举报人uid
     *
     * @return user_uid - 举报人uid
     */
    public String getUserUid() {
        return userUid;
    }

    /**
     * 设置举报人uid
     *
     * @param userUid 举报人uid
     */
    public void setUserUid(String userUid) {
        this.userUid = userUid == null ? null : userUid.trim();
    }

    /**
     * 获取被举报的评论Uid
     *
     * @return report_comment_uid - 被举报的评论Uid
     */
    public String getReportCommentUid() {
        return reportCommentUid;
    }

    /**
     * 设置被举报的评论Uid
     *
     * @param reportCommentUid 被举报的评论Uid
     */
    public void setReportCommentUid(String reportCommentUid) {
        this.reportCommentUid = reportCommentUid == null ? null : reportCommentUid.trim();
    }

    /**
     * 获取被举报的用户uid
     *
     * @return report_user_uid - 被举报的用户uid
     */
    public String getReportUserUid() {
        return reportUserUid;
    }

    /**
     * 设置被举报的用户uid
     *
     * @param reportUserUid 被举报的用户uid
     */
    public void setReportUserUid(String reportUserUid) {
        this.reportUserUid = reportUserUid == null ? null : reportUserUid.trim();
    }

    /**
     * 获取举报的原因
     *
     * @return content - 举报的原因
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置举报的原因
     *
     * @param content 举报的原因
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取进展状态: 0 未查看   1: 已查看  2：已处理
     *
     * @return progress - 进展状态: 0 未查看   1: 已查看  2：已处理
     */
    public Byte getProgress() {
        return progress;
    }

    /**
     * 设置进展状态: 0 未查看   1: 已查看  2：已处理
     *
     * @param progress 进展状态: 0 未查看   1: 已查看  2：已处理
     */
    public void setProgress(Byte progress) {
        this.progress = progress;
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

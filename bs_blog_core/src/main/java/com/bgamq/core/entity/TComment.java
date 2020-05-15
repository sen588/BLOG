package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_comment")
public class TComment {
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
     * 回复某条评论的uid
     */
    @Column(name = "to_uid")
    private String toUid;

    /**
     * 回复某个人的uid
     */
    @Column(name = "to_user_uid")
    private String toUserUid;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 博客uid
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
     * 评论来源： MESSAGE_BOARD,ABOUT,BLOG_INFO 等
     */
    private String source;

    /**
     * 评论类型 1:点赞 0:评论
     */
    @Column(name = "TYPE")
    private Byte type;

    /**
     * 一级评论UID
     */
    @Column(name = "first_comment_uid")
    private String firstCommentUid;

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
     * 获取回复某条评论的uid
     *
     * @return to_uid - 回复某条评论的uid
     */
    public String getToUid() {
        return toUid;
    }

    /**
     * 设置回复某条评论的uid
     *
     * @param toUid 回复某条评论的uid
     */
    public void setToUid(String toUid) {
        this.toUid = toUid == null ? null : toUid.trim();
    }

    /**
     * 获取回复某个人的uid
     *
     * @return to_user_uid - 回复某个人的uid
     */
    public String getToUserUid() {
        return toUserUid;
    }

    /**
     * 设置回复某个人的uid
     *
     * @param toUserUid 回复某个人的uid
     */
    public void setToUserUid(String toUserUid) {
        this.toUserUid = toUserUid == null ? null : toUserUid.trim();
    }

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取博客uid
     *
     * @return blog_uid - 博客uid
     */
    public String getBlogUid() {
        return blogUid;
    }

    /**
     * 设置博客uid
     *
     * @param blogUid 博客uid
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
     * 获取评论来源： MESSAGE_BOARD,ABOUT,BLOG_INFO 等
     *
     * @return source - 评论来源： MESSAGE_BOARD,ABOUT,BLOG_INFO 等
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置评论来源： MESSAGE_BOARD,ABOUT,BLOG_INFO 等
     *
     * @param source 评论来源： MESSAGE_BOARD,ABOUT,BLOG_INFO 等
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 获取评论类型 1:点赞 0:评论
     *
     * @return TYPE - 评论类型 1:点赞 0:评论
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置评论类型 1:点赞 0:评论
     *
     * @param type 评论类型 1:点赞 0:评论
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取一级评论UID
     *
     * @return first_comment_uid - 一级评论UID
     */
    public String getFirstCommentUid() {
        return firstCommentUid;
    }

    /**
     * 设置一级评论UID
     *
     * @param firstCommentUid 一级评论UID
     */
    public void setFirstCommentUid(String firstCommentUid) {
        this.firstCommentUid = firstCommentUid == null ? null : firstCommentUid.trim();
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
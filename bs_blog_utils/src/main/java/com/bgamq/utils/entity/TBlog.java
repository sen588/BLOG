package com.bgamq.utils.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_blog")
public class TBlog {
    /**
     * 唯一uid
     */
    @Id
    private String uid;

    /**
     * 博客标题
     */
    private String title;

    /**
     * 博客简介
     */
    private String summary;

    /**
     * 标签uid
     */
    @Column(name = "tag_uid")
    private String tagUid;

    /**
     * 博客点击数
     */
    @Column(name = "click_count")
    private Integer clickCount;

    /**
     * 博客收藏数
     */
    @Column(name = "collect_count")
    private Integer collectCount;

    /**
     * 标题图片uid
     */
    @Column(name = "file_uid")
    private String fileUid;

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
     * 管理员uid
     */
    @Column(name = "admin_uid")
    private String adminUid;

    /**
     * 是否原创（0:不是 1：是）
     */
    @Column(name = "is_original")
    private String isOriginal;

    /**
     * 作者
     */
    private String author;

    /**
     * 文章出处
     */
    @Column(name = "articles_part")
    private String articlesPart;

    /**
     * 博客分类UID
     */
    @Column(name = "blog_sort_uid")
    private String blogSortUid;

    /**
     * 推荐等级(0:正常)
     */
    private Byte level;

    /**
     * 是否发布：0：否,1：是
     */
    @Column(name = "is_publish")
    private String isPublish;

    /**
     * 排序字段
     */
    private Integer sort;

    /**
     * 是否开启评论(0:否 1:是)
     */
    @Column(name = "start_comment")
    private Byte startComment;

    /**
     * 逻辑删除
     */
    @Column(name = "is_del")
    private Byte isDel;

    /**
     * 博客内容
     */
    private String content;

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
     * 获取博客标题
     *
     * @return title - 博客标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置博客标题
     *
     * @param title 博客标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取博客简介
     *
     * @return summary - 博客简介
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置博客简介
     *
     * @param summary 博客简介
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * 获取标签uid
     *
     * @return tag_uid - 标签uid
     */
    public String getTagUid() {
        return tagUid;
    }

    /**
     * 设置标签uid
     *
     * @param tagUid 标签uid
     */
    public void setTagUid(String tagUid) {
        this.tagUid = tagUid == null ? null : tagUid.trim();
    }

    /**
     * 获取博客点击数
     *
     * @return click_count - 博客点击数
     */
    public Integer getClickCount() {
        return clickCount;
    }

    /**
     * 设置博客点击数
     *
     * @param clickCount 博客点击数
     */
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    /**
     * 获取博客收藏数
     *
     * @return collect_count - 博客收藏数
     */
    public Integer getCollectCount() {
        return collectCount;
    }

    /**
     * 设置博客收藏数
     *
     * @param collectCount 博客收藏数
     */
    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    /**
     * 获取标题图片uid
     *
     * @return file_uid - 标题图片uid
     */
    public String getFileUid() {
        return fileUid;
    }

    /**
     * 设置标题图片uid
     *
     * @param fileUid 标题图片uid
     */
    public void setFileUid(String fileUid) {
        this.fileUid = fileUid == null ? null : fileUid.trim();
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
     * 获取是否原创（0:不是 1：是）
     *
     * @return is_original - 是否原创（0:不是 1：是）
     */
    public String getIsOriginal() {
        return isOriginal;
    }

    /**
     * 设置是否原创（0:不是 1：是）
     *
     * @param isOriginal 是否原创（0:不是 1：是）
     */
    public void setIsOriginal(String isOriginal) {
        this.isOriginal = isOriginal == null ? null : isOriginal.trim();
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * 获取文章出处
     *
     * @return articles_part - 文章出处
     */
    public String getArticlesPart() {
        return articlesPart;
    }

    /**
     * 设置文章出处
     *
     * @param articlesPart 文章出处
     */
    public void setArticlesPart(String articlesPart) {
        this.articlesPart = articlesPart == null ? null : articlesPart.trim();
    }

    /**
     * 获取博客分类UID
     *
     * @return blog_sort_uid - 博客分类UID
     */
    public String getBlogSortUid() {
        return blogSortUid;
    }

    /**
     * 设置博客分类UID
     *
     * @param blogSortUid 博客分类UID
     */
    public void setBlogSortUid(String blogSortUid) {
        this.blogSortUid = blogSortUid == null ? null : blogSortUid.trim();
    }

    /**
     * 获取推荐等级(0:正常)
     *
     * @return level - 推荐等级(0:正常)
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * 设置推荐等级(0:正常)
     *
     * @param level 推荐等级(0:正常)
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * 获取是否发布：0：否,1：是
     *
     * @return is_publish - 是否发布：0：否,1：是
     */
    public String getIsPublish() {
        return isPublish;
    }

    /**
     * 设置是否发布：0：否,1：是
     *
     * @param isPublish 是否发布：0：否,1：是
     */
    public void setIsPublish(String isPublish) {
        this.isPublish = isPublish == null ? null : isPublish.trim();
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
     * 获取是否开启评论(0:否 1:是)
     *
     * @return start_comment - 是否开启评论(0:否 1:是)
     */
    public Byte getStartComment() {
        return startComment;
    }

    /**
     * 设置是否开启评论(0:否 1:是)
     *
     * @param startComment 是否开启评论(0:否 1:是)
     */
    public void setStartComment(Byte startComment) {
        this.startComment = startComment;
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

    /**
     * 获取博客内容
     *
     * @return content - 博客内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置博客内容
     *
     * @param content 博客内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
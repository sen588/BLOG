package com.bgamq.utils.entity;

import java.io.Serializable;
import java.util.Date;

public class TBlog implements Serializable {
    private String uid;

    private String title;

    private String summary;

    private String tagUid;

    private Integer clickCount;

    private Integer collectCount;

    private String fileUid;

    private Boolean status;

    private Date createTime;

    private Date updateTime;

    private String adminUid;

    private String isOriginal;

    private String author;

    private String articlesPart;

    private String blogSortUid;

    private Boolean level;

    private String isPublish;

    private Integer sort;

    private Boolean startComment;

    private Boolean isDel;

    private String content;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getTagUid() {
        return tagUid;
    }

    public void setTagUid(String tagUid) {
        this.tagUid = tagUid == null ? null : tagUid.trim();
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public String getFileUid() {
        return fileUid;
    }

    public void setFileUid(String fileUid) {
        this.fileUid = fileUid == null ? null : fileUid.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAdminUid() {
        return adminUid;
    }

    public void setAdminUid(String adminUid) {
        this.adminUid = adminUid == null ? null : adminUid.trim();
    }

    public String getIsOriginal() {
        return isOriginal;
    }

    public void setIsOriginal(String isOriginal) {
        this.isOriginal = isOriginal == null ? null : isOriginal.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getArticlesPart() {
        return articlesPart;
    }

    public void setArticlesPart(String articlesPart) {
        this.articlesPart = articlesPart == null ? null : articlesPart.trim();
    }

    public String getBlogSortUid() {
        return blogSortUid;
    }

    public void setBlogSortUid(String blogSortUid) {
        this.blogSortUid = blogSortUid == null ? null : blogSortUid.trim();
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public String getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(String isPublish) {
        this.isPublish = isPublish == null ? null : isPublish.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getStartComment() {
        return startComment;
    }

    public void setStartComment(Boolean startComment) {
        this.startComment = startComment;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", title=").append(title);
        sb.append(", summary=").append(summary);
        sb.append(", tagUid=").append(tagUid);
        sb.append(", clickCount=").append(clickCount);
        sb.append(", collectCount=").append(collectCount);
        sb.append(", fileUid=").append(fileUid);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", adminUid=").append(adminUid);
        sb.append(", isOriginal=").append(isOriginal);
        sb.append(", author=").append(author);
        sb.append(", articlesPart=").append(articlesPart);
        sb.append(", blogSortUid=").append(blogSortUid);
        sb.append(", level=").append(level);
        sb.append(", isPublish=").append(isPublish);
        sb.append(", sort=").append(sort);
        sb.append(", startComment=").append(startComment);
        sb.append(", isDel=").append(isDel);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
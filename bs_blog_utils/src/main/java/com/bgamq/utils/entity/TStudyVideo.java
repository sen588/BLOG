package com.bgamq.utils.entity;

import java.io.Serializable;
import java.util.Date;

public class TStudyVideo implements Serializable {
    private String uid;

    private String fileUid;

    private String resourceSortUid;

    private String name;

    private String summary;

    private String content;

    private String baiduPath;

    private String clickCount;

    private Boolean status;

    private Date createTime;

    private Date updateTime;

    private String parentUid;

    private Boolean isDel;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getFileUid() {
        return fileUid;
    }

    public void setFileUid(String fileUid) {
        this.fileUid = fileUid == null ? null : fileUid.trim();
    }

    public String getResourceSortUid() {
        return resourceSortUid;
    }

    public void setResourceSortUid(String resourceSortUid) {
        this.resourceSortUid = resourceSortUid == null ? null : resourceSortUid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getBaiduPath() {
        return baiduPath;
    }

    public void setBaiduPath(String baiduPath) {
        this.baiduPath = baiduPath == null ? null : baiduPath.trim();
    }

    public String getClickCount() {
        return clickCount;
    }

    public void setClickCount(String clickCount) {
        this.clickCount = clickCount == null ? null : clickCount.trim();
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

    public String getParentUid() {
        return parentUid;
    }

    public void setParentUid(String parentUid) {
        this.parentUid = parentUid == null ? null : parentUid.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", fileUid=").append(fileUid);
        sb.append(", resourceSortUid=").append(resourceSortUid);
        sb.append(", name=").append(name);
        sb.append(", summary=").append(summary);
        sb.append(", content=").append(content);
        sb.append(", baiduPath=").append(baiduPath);
        sb.append(", clickCount=").append(clickCount);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", parentUid=").append(parentUid);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
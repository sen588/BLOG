package com.bgamq.utils.entity;

import java.io.Serializable;
import java.util.Date;

public class TCommentReport implements Serializable {
    private String uid;

    private String userUid;

    private String reportCommentUid;

    private String reportUserUid;

    private String content;

    private Boolean progress;

    private Boolean status;

    private Date createTime;

    private Date updateTime;

    private Boolean isDel;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid == null ? null : userUid.trim();
    }

    public String getReportCommentUid() {
        return reportCommentUid;
    }

    public void setReportCommentUid(String reportCommentUid) {
        this.reportCommentUid = reportCommentUid == null ? null : reportCommentUid.trim();
    }

    public String getReportUserUid() {
        return reportUserUid;
    }

    public void setReportUserUid(String reportUserUid) {
        this.reportUserUid = reportUserUid == null ? null : reportUserUid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Boolean getProgress() {
        return progress;
    }

    public void setProgress(Boolean progress) {
        this.progress = progress;
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
        sb.append(", userUid=").append(userUid);
        sb.append(", reportCommentUid=").append(reportCommentUid);
        sb.append(", reportUserUid=").append(reportUserUid);
        sb.append(", content=").append(content);
        sb.append(", progress=").append(progress);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
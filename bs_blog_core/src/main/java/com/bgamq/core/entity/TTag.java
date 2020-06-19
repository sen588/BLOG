package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_tag")
public class TTag {
    /**
     * 唯一uid
     */
    @Id
    private String uid;

    /**
     * 标签内容
     */
    private String content;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 标签简介
     */
    @Column(name = "click_count")
    private Integer clickCount;

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
     * 排序字段,越大越靠前
     */
    private Integer sort;

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
     * 获取标签内容
     *
     * @return content - 标签内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置标签内容
     *
     * @param content 标签内容
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
     * 获取标签简介
     *
     * @return click_count - 标签简介
     */
    public Integer getClickCount() {
        return clickCount;
    }

    /**
     * 设置标签简介
     *
     * @param clickCount 标签简介
     */
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
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
     * 获取排序字段,越大越靠前
     *
     * @return sort - 排序字段,越大越靠前
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序字段,越大越靠前
     *
     * @param sort 排序字段,越大越靠前
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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

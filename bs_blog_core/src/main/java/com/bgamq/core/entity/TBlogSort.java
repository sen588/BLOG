package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_blog_sort")
public class TBlogSort {
    /**
     * 唯一uid
     */
    @Id
    private String uid;

    /**
     * 分类内容
     */
    @Column(name = "sort_name")
    private String sortName;

    /**
     * 分类简介
     */
    private String content;

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
     * 状态
     */
    private Byte status;

    /**
     * 排序字段,越大越靠前
     */
    private Integer sort;

    /**
     * 点击数
     */
    @Column(name = "click_count")
    private Integer clickCount;

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
     * 获取分类内容
     *
     * @return sort_name - 分类内容
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * 设置分类内容
     *
     * @param sortName 分类内容
     */
    public void setSortName(String sortName) {
        this.sortName = sortName == null ? null : sortName.trim();
    }

    /**
     * 获取分类简介
     *
     * @return content - 分类简介
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置分类简介
     *
     * @param content 分类简介
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
     * 获取点击数
     *
     * @return click_count - 点击数
     */
    public Integer getClickCount() {
        return clickCount;
    }

    /**
     * 设置点击数
     *
     * @param clickCount 点击数
     */
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
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
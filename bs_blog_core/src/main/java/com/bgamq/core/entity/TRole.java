package com.bgamq.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_role")
public class TRole {
    /**
     * 角色id
     */
    @Id
    private String uid;

    /**
     * 角色名
     */
    @Column(name = "role_name")
    private String roleName;

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
     * 角色介绍
     */
    private String summary;

    /**
     * 逻辑删除
     */
    @Column(name = "is_del")
    private Byte isDel;

    /**
     * 角色管辖的菜单的UID
     */
    @Column(name = "category_menu_uids")
    private String categoryMenuUids;

    /**
     * 获取角色id
     *
     * @return uid - 角色id
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置角色id
     *
     * @param uid 角色id
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * 获取角色名
     *
     * @return role_name - 角色名
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名
     *
     * @param roleName 角色名
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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
     * 获取角色介绍
     *
     * @return summary - 角色介绍
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置角色介绍
     *
     * @param summary 角色介绍
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
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
     * 获取角色管辖的菜单的UID
     *
     * @return category_menu_uids - 角色管辖的菜单的UID
     */
    public String getCategoryMenuUids() {
        return categoryMenuUids;
    }

    /**
     * 设置角色管辖的菜单的UID
     *
     * @param categoryMenuUids 角色管辖的菜单的UID
     */
    public void setCategoryMenuUids(String categoryMenuUids) {
        this.categoryMenuUids = categoryMenuUids == null ? null : categoryMenuUids.trim();
    }
}

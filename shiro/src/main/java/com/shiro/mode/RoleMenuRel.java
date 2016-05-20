package com.shiro.mode;

import com.framework.base.BaseObject;

/**
 * 角色菜单授权
 *
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2014
 * @author wangxin
 * @Date Apr 1, 2015
 */
public class RoleMenuRel extends BaseObject {

    private static final long serialVersionUID = -1433759471026642934L;

    // 角色ID
    private String roleId;

    // 菜单ID
    private String menuId;

    // 是否拥有导出权限
    private Integer hasExport;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public Integer getHasExport() {
        return hasExport;
    }

    public void setHasExport(Integer hasExport) {
        this.hasExport = hasExport;
    }

}

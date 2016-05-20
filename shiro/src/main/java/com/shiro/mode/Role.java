package com.shiro.mode;

import java.util.List;

import com.framework.base.BaseObject;

public class Role extends BaseObject {

    private static final long serialVersionUID = 6871165236213253249L;

    // 角色名称
    private String roleName;

    // 模版类型
    private String roleTypeId;

    // 父角色ID
    private String parentId;

    // 管理员角色
    private Integer isAdminRole;

    // 所属系统
    private String systemCode;

    // 暂时没用
    private String isLeaf;

    // 查询展示字段：创建用户名称
    private String createUserName;

    // 菜单主键
    private String menuId;

    // 一个角色包含多个菜单
    private List<Menu> menu;
    
    /***************************非持久化字段   begin********************************/
    /** 商家或柜台ID */
    private String orgId;
    /***************************非持久化字段   end  ********************************/

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setIsAdminRole(Integer isAdminRole) {
        this.isAdminRole = isAdminRole;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public Integer getIsAdminRole() {
        return isAdminRole;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

}

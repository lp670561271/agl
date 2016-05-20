package com.shiro.mode;

import com.framework.base.BaseObject;

public class RoleType extends BaseObject {

    private static final long serialVersionUID = 3065414977415288325L;

    // 角色模板名称
    private String roleTypeName;

    // 角色编号
    private String roleTypeCode;

    // 角色描述
    private String description;

    // 所属系统编号
    private String systemCode;

    public String getRoleTypeName() {
        return roleTypeName;
    }

    public void setRoleTypeName(String roleTypeName) {
        this.roleTypeName = roleTypeName;
    }

    public String getRoleTypeCode() {
        return roleTypeCode;
    }

    public void setRoleTypeCode(String roleTypeCode) {
        this.roleTypeCode = roleTypeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

}

package com.shiro.mode;

import com.framework.base.BaseObject;

public class UserRoleRel extends BaseObject {

    private static final long serialVersionUID = 3998927436215142273L;

    private String userId;

    private String roleId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

}

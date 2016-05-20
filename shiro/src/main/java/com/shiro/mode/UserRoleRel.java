package com.shiro.mode;

import com.framework.base.BaseObject;

/**
 * 用户角色
 * 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2014
 * @author wangxin
 * @Date May 15, 2015
 */
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

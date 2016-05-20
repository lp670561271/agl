package com.shiro.mode;

import com.framework.base.BaseObject;

public class User extends BaseObject {

    private static final long serialVersionUID = -1083711780724721275L;

    /** 商家或柜台ID */
    private String orgId;

    /** 机构类型 */
    private String orgType;

    /** 账号 */
    private String account;

    /** 用户名称 */
    private String userName;

    /** 密码 */
    private String password;

    /** 所属系统编号 */
    private String systemCode;

    /** 上级主键 */
    private String parentId;

    /** 是否管理员 */
    private String isAdmin;
    
    private String roleId;

    private String casAccount;
    
    /**统一邮箱验证*/
    private String u_email;
    
    public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

	public String getCasAccount() {
		return casAccount;
	}

	public void setCasAccount(String casAccount) {
		this.casAccount = casAccount;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
    
}
package com.shiro.mode;

import com.framework.base.BaseObject;

/**
 * 角色类型菜单授权
 *
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2014
 * @author wangxin
 * @Date Apr 13, 2015
 */
public class RoleTypeMenuRel extends BaseObject {

    private static final long serialVersionUID = 2334037014900176683L;

    /** 角色类型ID **/
    private String roletypeId;

    /** 菜单ID **/
    private String menuId;

    public String getRoletypeId() {
        return roletypeId;
    }

    public void setRoletypeId(String roletypeId) {
        this.roletypeId = roletypeId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

}
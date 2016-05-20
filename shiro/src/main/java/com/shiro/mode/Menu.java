package com.shiro.mode;

import com.framework.base.BaseObject;

public class Menu extends BaseObject {

    private static final long serialVersionUID = -5347548357722243040L;

    // 菜单名称
    private String menuName;

    // 菜单识别码
    private String menuCode;

    // 上级主键
    private String parentId;

    // 树级别
    private Integer lev;

    // 是否有子节点
    private String isLeaf;

    // 菜单连接
    private String menuUrl;

    // 所属系统编号
    private String systemCode;

    // 菜单排序
    private String sortId;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

}

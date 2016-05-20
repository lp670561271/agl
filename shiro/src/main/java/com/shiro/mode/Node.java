package com.shiro.mode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 构架树结构
 * 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2014
 * @author wangxin
 * @date 2015-04-06
 */
public class Node implements Serializable {

    private static final long serialVersionUID = -7382515600282738384L;

    // id
    private String id;

    // 树父id

    private String pid;
    // 节点名字
    private String name;

    // 是否被选中
    private boolean checked;

    private String click;

    private String icon;

    private String iconClose;

    private String iconOpen;

    private String iconSkin;

    private boolean isParent;

    private boolean nocheck;

    // 树是否展开
    private boolean open;

    private String target;

    private String ename;

    // 描述
    private String desc;

    // 菜单路径
    private String url;

    private String nodeType;

    private String citeType;

    private String nodeLevel;

    // 是否有子节点
    private String isLeaf;

    // 是否支持导出
    private Integer hasExport;

    // 树节点
    private List<Node> nodes = new ArrayList<Node>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconClose() {
        return iconClose;
    }

    public void setIconClose(String iconClose) {
        this.iconClose = iconClose;
    }

    public String getIconOpen() {
        return iconOpen;
    }

    public void setIconOpen(String iconOpen) {
        this.iconOpen = iconOpen;
    }

    public String getIconSkin() {
        return iconSkin;
    }

    public void setIconSkin(String iconSkin) {
        this.iconSkin = iconSkin;
    }

    public boolean isParent() {
        return isParent;
    }

    public void setParent(boolean isParent) {
        this.isParent = isParent;
    }

    public boolean isNocheck() {
        return nocheck;
    }

    public void setNocheck(boolean nocheck) {
        this.nocheck = nocheck;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getCiteType() {
        return citeType;
    }

    public void setCiteType(String citeType) {
        this.citeType = citeType;
    }

    public String getNodeLevel() {
        return nodeLevel;
    }

    public void setNodeLevel(String nodeLevel) {
        this.nodeLevel = nodeLevel;
    }

    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public Integer getHasExport() {
        return hasExport;
    }

    public void setHasExport(Integer hasExport) {
        this.hasExport = hasExport;
    }

}

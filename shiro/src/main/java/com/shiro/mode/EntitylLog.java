package com.shiro.mode;

import com.framework.base.BaseObject;

/**
 * 实体日志BaseObject.java
 *
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2014
 * @author wangxin
 * @Date Apr 1, 2015
 */
public class EntitylLog extends BaseObject {

    private static final long serialVersionUID = 6960904012932671556L;
    
    // 用户id
    private String userId;

    // 操作类型（delete/add）
    private String action;

    // 实体表名
    private String entityTable;

    // 实体表主键
    private String entityId;

    // 备注
    private String remark;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getEntityTable() {
        return entityTable;
    }

    public void setEntityTable(String entityTable) {
        this.entityTable = entityTable;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public EntitylLog() {
        super();
    }

    public EntitylLog(String userId, String action, String entityTable, String entityId, String remark) {
        super();
        this.userId = userId;
        this.action = action;
        this.entityTable = entityTable;
        this.entityId = entityId;
        this.remark = remark;
    }

}

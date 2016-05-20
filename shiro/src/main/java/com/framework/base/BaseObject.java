package com.framework.base;

import java.io.Serializable;
import java.util.Date;

/**
 * POJO基类对象
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2014
 * @author majun
 * @date 2014-10-19
 * =================Modify Record=================
 * @Modifier            @date           @Content
 * majun                2014-10-18      新增
 * wangxin              2014-02-10      属性命名变更
 */
public class BaseObject implements Serializable {
    
    private static final long serialVersionUID = 329430609755626516L;

    /** 主键 */
    private String id;
    
    /** 删除标识：0、未删除 1、已删除 */
    private int isDel;
    
    /** 版本号 */
    private Long versionNum;

    /** 创建人 */
    private String createUserId;

    /** 创建时间 */
    private Date createTime;

    /** 修改人 */
    private String updateUserId;

    /** 修改时间 */
    private Date updateTime;
 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public Long getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(Long versionNum) {
        this.versionNum = versionNum;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

     
}

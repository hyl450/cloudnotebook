package com.hyl.cloudnote.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CnNotebook implements Serializable {
    @ApiModelProperty(value = "笔记本ID")
    private String cnNotebookId;

    @ApiModelProperty(value = "用户ID")
    private String cnUserId;

    @ApiModelProperty(value = "笔记本类型ID")
    private String cnNotebookTypeId;

    @ApiModelProperty(value = "笔记本名")
    private String cnNotebookName;

    private Date cnNotebookCreatetime;

    public String getCnNotebookCreatetimeFormat() {
        return cnNotebookCreatetimeFormat;
    }

    public void setCnNotebookCreatetimeFormat(String cnNotebookCreatetimeFormat) {
        this.cnNotebookCreatetimeFormat = cnNotebookCreatetimeFormat;
    }

    private String cnNotebookCreatetimeFormat;

    @ApiModelProperty(value = "笔记本说明")
    private String cnNotebookDesc;

    @ApiModelProperty(value = "排序")
    private String orderByClause;

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    private static final long serialVersionUID = 1L;

    public String getCnNotebookId() {
        return cnNotebookId;
    }

    public void setCnNotebookId(String cnNotebookId) {
        this.cnNotebookId = cnNotebookId;
    }

    public String getCnUserId() {
        return cnUserId;
    }

    public void setCnUserId(String cnUserId) {
        this.cnUserId = cnUserId;
    }

    public String getCnNotebookTypeId() {
        return cnNotebookTypeId;
    }

    public void setCnNotebookTypeId(String cnNotebookTypeId) {
        this.cnNotebookTypeId = cnNotebookTypeId;
    }

    public String getCnNotebookName() {
        return cnNotebookName;
    }

    public void setCnNotebookName(String cnNotebookName) {
        this.cnNotebookName = cnNotebookName;
    }

    public Date getCnNotebookCreatetime() {
        return cnNotebookCreatetime;
    }

    public void setCnNotebookCreatetime(Date cnNotebookCreatetime) {
        this.cnNotebookCreatetime = cnNotebookCreatetime;
    }

    public String getCnNotebookDesc() {
        return cnNotebookDesc;
    }

    public void setCnNotebookDesc(String cnNotebookDesc) {
        this.cnNotebookDesc = cnNotebookDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnNotebookId=").append(cnNotebookId);
        sb.append(", cnUserId=").append(cnUserId);
        sb.append(", cnNotebookTypeId=").append(cnNotebookTypeId);
        sb.append(", cnNotebookName=").append(cnNotebookName);
        sb.append(", cnNotebookCreatetime=").append(cnNotebookCreatetime);
        sb.append(", cnNotebookDesc=").append(cnNotebookDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
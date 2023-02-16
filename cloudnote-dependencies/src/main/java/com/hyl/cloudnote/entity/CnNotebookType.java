package com.hyl.cloudnote.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CnNotebookType implements Serializable {
    @ApiModelProperty(value = "笔记本类型ID")
    private String cnNotebookTypeId;

    @ApiModelProperty(value = "笔记本类型Code")
    private String cnNotebookTypeCode;

    @ApiModelProperty(value = "笔记本类型名称")
    private String cnNotebookTypeName;

    @ApiModelProperty(value = "笔记本类型说明")
    private String cnNotebookTypeDesc;

    private static final long serialVersionUID = 1L;

    public String getCnNotebookTypeId() {
        return cnNotebookTypeId;
    }

    public void setCnNotebookTypeId(String cnNotebookTypeId) {
        this.cnNotebookTypeId = cnNotebookTypeId;
    }

    public String getCnNotebookTypeCode() {
        return cnNotebookTypeCode;
    }

    public void setCnNotebookTypeCode(String cnNotebookTypeCode) {
        this.cnNotebookTypeCode = cnNotebookTypeCode;
    }

    public String getCnNotebookTypeName() {
        return cnNotebookTypeName;
    }

    public void setCnNotebookTypeName(String cnNotebookTypeName) {
        this.cnNotebookTypeName = cnNotebookTypeName;
    }

    public String getCnNotebookTypeDesc() {
        return cnNotebookTypeDesc;
    }

    public void setCnNotebookTypeDesc(String cnNotebookTypeDesc) {
        this.cnNotebookTypeDesc = cnNotebookTypeDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnNotebookTypeId=").append(cnNotebookTypeId);
        sb.append(", cnNotebookTypeCode=").append(cnNotebookTypeCode);
        sb.append(", cnNotebookTypeName=").append(cnNotebookTypeName);
        sb.append(", cnNotebookTypeDesc=").append(cnNotebookTypeDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
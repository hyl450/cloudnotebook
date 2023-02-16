package com.hyl.cloudnote.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CnNoteType implements Serializable {
    @ApiModelProperty(value = "笔记类型ID")
    private String cnNoteTypeId;

    @ApiModelProperty(value = "笔记类型Code")
    private String cnNoteTypeCode;

    @ApiModelProperty(value = "笔记类型名称")
    private String cnNoteTypeName;

    @ApiModelProperty(value = "笔记类型说明")
    private String cnNoteTypeDesc;

    private static final long serialVersionUID = 1L;

    public String getCnNoteTypeId() {
        return cnNoteTypeId;
    }

    public void setCnNoteTypeId(String cnNoteTypeId) {
        this.cnNoteTypeId = cnNoteTypeId;
    }

    public String getCnNoteTypeCode() {
        return cnNoteTypeCode;
    }

    public void setCnNoteTypeCode(String cnNoteTypeCode) {
        this.cnNoteTypeCode = cnNoteTypeCode;
    }

    public String getCnNoteTypeName() {
        return cnNoteTypeName;
    }

    public void setCnNoteTypeName(String cnNoteTypeName) {
        this.cnNoteTypeName = cnNoteTypeName;
    }

    public String getCnNoteTypeDesc() {
        return cnNoteTypeDesc;
    }

    public void setCnNoteTypeDesc(String cnNoteTypeDesc) {
        this.cnNoteTypeDesc = cnNoteTypeDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnNoteTypeId=").append(cnNoteTypeId);
        sb.append(", cnNoteTypeCode=").append(cnNoteTypeCode);
        sb.append(", cnNoteTypeName=").append(cnNoteTypeName);
        sb.append(", cnNoteTypeDesc=").append(cnNoteTypeDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.hyl.cloudnote.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CnNoteStatus implements Serializable {
    @ApiModelProperty(value = "笔记状态ID")
    private String cnNoteStatusId;

    @ApiModelProperty(value = "笔记状态Code")
    private String cnNoteStatusCode;

    @ApiModelProperty(value = "笔记状态名字")
    private String cnNoteStatusName;

    private static final long serialVersionUID = 1L;

    public String getCnNoteStatusId() {
        return cnNoteStatusId;
    }

    public void setCnNoteStatusId(String cnNoteStatusId) {
        this.cnNoteStatusId = cnNoteStatusId;
    }

    public String getCnNoteStatusCode() {
        return cnNoteStatusCode;
    }

    public void setCnNoteStatusCode(String cnNoteStatusCode) {
        this.cnNoteStatusCode = cnNoteStatusCode;
    }

    public String getCnNoteStatusName() {
        return cnNoteStatusName;
    }

    public void setCnNoteStatusName(String cnNoteStatusName) {
        this.cnNoteStatusName = cnNoteStatusName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnNoteStatusId=").append(cnNoteStatusId);
        sb.append(", cnNoteStatusCode=").append(cnNoteStatusCode);
        sb.append(", cnNoteStatusName=").append(cnNoteStatusName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
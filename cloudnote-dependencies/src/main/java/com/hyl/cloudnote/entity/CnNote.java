package com.hyl.cloudnote.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CnNote implements Serializable {
    @ApiModelProperty(value = "笔记ID")
    private String cnNoteId;

    @ApiModelProperty(value = "笔记本ID")
    private String cnNotebookId;

    @ApiModelProperty(value = "笔记本ID")
    private String cnNoteNewbookId;

    @ApiModelProperty(value = "用户ID")
    private String cnUserId;

    @ApiModelProperty(value = "笔记状态ID:备用")
    private String cnNoteStatusId;

    @ApiModelProperty(value = "笔记本类型ID：备用")
    private String cnNoteTypeId;

    @ApiModelProperty(value = "笔记标题")
    private String cnNoteTitle;

    @ApiModelProperty(value = "笔记创建时间")
    private Long cnNoteCreateTime;

    @ApiModelProperty(value = "笔记最近修改时间")
    private Long cnNoteLastModifyTime;

    @ApiModelProperty(value = "笔记内容")
    private String cnNoteBody;

    public String getCnNoteNewbookId() {
        return cnNoteNewbookId;
    }

    public void setCnNoteNewbookId(String cnNoteNewbookId) {
        this.cnNoteNewbookId = cnNoteNewbookId;
    }

    private static final long serialVersionUID = 1L;

    public String getCnNoteId() {
        return cnNoteId;
    }

    public void setCnNoteId(String cnNoteId) {
        this.cnNoteId = cnNoteId;
    }

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

    public String getCnNoteStatusId() {
        return cnNoteStatusId;
    }

    public void setCnNoteStatusId(String cnNoteStatusId) {
        this.cnNoteStatusId = cnNoteStatusId;
    }

    public String getCnNoteTypeId() {
        return cnNoteTypeId;
    }

    public void setCnNoteTypeId(String cnNoteTypeId) {
        this.cnNoteTypeId = cnNoteTypeId;
    }

    public String getCnNoteTitle() {
        return cnNoteTitle;
    }

    public void setCnNoteTitle(String cnNoteTitle) {
        this.cnNoteTitle = cnNoteTitle;
    }

    public Long getCnNoteCreateTime() {
        return cnNoteCreateTime;
    }

    public void setCnNoteCreateTime(Long cnNoteCreateTime) {
        this.cnNoteCreateTime = cnNoteCreateTime;
    }

    public Long getCnNoteLastModifyTime() {
        return cnNoteLastModifyTime;
    }

    public void setCnNoteLastModifyTime(Long cnNoteLastModifyTime) {
        this.cnNoteLastModifyTime = cnNoteLastModifyTime;
    }

    public String getCnNoteBody() {
        return cnNoteBody;
    }

    public void setCnNoteBody(String cnNoteBody) {
        this.cnNoteBody = cnNoteBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnNoteId=").append(cnNoteId);
        sb.append(", cnNotebookId=").append(cnNotebookId);
        sb.append(", cnUserId=").append(cnUserId);
        sb.append(", cnNoteStatusId=").append(cnNoteStatusId);
        sb.append(", cnNoteTypeId=").append(cnNoteTypeId);
        sb.append(", cnNoteTitle=").append(cnNoteTitle);
        sb.append(", cnNoteCreateTime=").append(cnNoteCreateTime);
        sb.append(", cnNoteLastModifyTime=").append(cnNoteLastModifyTime);
        sb.append(", cnNoteBody=").append(cnNoteBody);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
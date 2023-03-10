package com.hyl.cloudnote.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CnShare implements Serializable {
    @ApiModelProperty(value = "共享ID")
    private String cnShareId;

    @ApiModelProperty(value = "共享标题")
    private String cnShareTitle;

    @ApiModelProperty(value = "笔记id")
    private String cnNoteId;

    @ApiModelProperty(value = "共享内容")
    private String cnShareBody;

    @ApiModelProperty(value = "用户ID")
    private String cnUserId;

    @ApiModelProperty(value = "是否本人分享的笔记")
    private String isPersonShare;

    public String getIsPersonShare() {
        return isPersonShare;
    }

    public void setIsPersonShare(String isPersonShare) {
        this.isPersonShare = isPersonShare;
    }

    public String getCnUserId() {
        return cnUserId;
    }

    public void setCnUserId(String cnUserId) {
        this.cnUserId = cnUserId;
    }

    private static final long serialVersionUID = 1L;

    public String getCnShareId() {
        return cnShareId;
    }

    public void setCnShareId(String cnShareId) {
        this.cnShareId = cnShareId;
    }

    public String getCnShareTitle() {
        return cnShareTitle;
    }

    public void setCnShareTitle(String cnShareTitle) {
        this.cnShareTitle = cnShareTitle;
    }

    public String getCnNoteId() {
        return cnNoteId;
    }

    public void setCnNoteId(String cnNoteId) {
        this.cnNoteId = cnNoteId;
    }

    public String getCnShareBody() {
        return cnShareBody;
    }

    public void setCnShareBody(String cnShareBody) {
        this.cnShareBody = cnShareBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnShareId=").append(cnShareId);
        sb.append(", cnShareTitle=").append(cnShareTitle);
        sb.append(", cnNoteId=").append(cnNoteId);
        sb.append(", cnShareBody=").append(cnShareBody);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
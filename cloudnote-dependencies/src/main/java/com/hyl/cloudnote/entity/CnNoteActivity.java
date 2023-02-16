package com.hyl.cloudnote.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CnNoteActivity implements Serializable {
    @ApiModelProperty(value = "投稿ID")
    private String cnNoteActivityId;

    @ApiModelProperty(value = "活动ID")
    private String cnActivityId;

    @ApiModelProperty(value = "笔记ID")
    private String cnNoteId;

    @ApiModelProperty(value = "投稿赞:增加数")
    private Integer cnNoteActivityUp;

    @ApiModelProperty(value = "投稿踩:增加数")
    private Integer cnNoteActivityDown;

    private String cnNoteActivityTitle;

    private String cnNoteActivityBody;

    private static final long serialVersionUID = 1L;

    public String getCnNoteActivityId() {
        return cnNoteActivityId;
    }

    public void setCnNoteActivityId(String cnNoteActivityId) {
        this.cnNoteActivityId = cnNoteActivityId;
    }

    public String getCnActivityId() {
        return cnActivityId;
    }

    public void setCnActivityId(String cnActivityId) {
        this.cnActivityId = cnActivityId;
    }

    public String getCnNoteId() {
        return cnNoteId;
    }

    public void setCnNoteId(String cnNoteId) {
        this.cnNoteId = cnNoteId;
    }

    public Integer getCnNoteActivityUp() {
        return cnNoteActivityUp;
    }

    public void setCnNoteActivityUp(Integer cnNoteActivityUp) {
        this.cnNoteActivityUp = cnNoteActivityUp;
    }

    public Integer getCnNoteActivityDown() {
        return cnNoteActivityDown;
    }

    public void setCnNoteActivityDown(Integer cnNoteActivityDown) {
        this.cnNoteActivityDown = cnNoteActivityDown;
    }

    public String getCnNoteActivityTitle() {
        return cnNoteActivityTitle;
    }

    public void setCnNoteActivityTitle(String cnNoteActivityTitle) {
        this.cnNoteActivityTitle = cnNoteActivityTitle;
    }

    public String getCnNoteActivityBody() {
        return cnNoteActivityBody;
    }

    public void setCnNoteActivityBody(String cnNoteActivityBody) {
        this.cnNoteActivityBody = cnNoteActivityBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnNoteActivityId=").append(cnNoteActivityId);
        sb.append(", cnActivityId=").append(cnActivityId);
        sb.append(", cnNoteId=").append(cnNoteId);
        sb.append(", cnNoteActivityUp=").append(cnNoteActivityUp);
        sb.append(", cnNoteActivityDown=").append(cnNoteActivityDown);
        sb.append(", cnNoteActivityTitle=").append(cnNoteActivityTitle);
        sb.append(", cnNoteActivityBody=").append(cnNoteActivityBody);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
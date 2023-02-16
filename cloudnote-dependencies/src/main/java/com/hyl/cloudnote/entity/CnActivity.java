package com.hyl.cloudnote.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CnActivity implements Serializable {
    @ApiModelProperty(value = "活动ID")
    private String cnActivityId;

    @ApiModelProperty(value = "活动标题")
    private String cnActivityTitle;

    @ApiModelProperty(value = "活动结束时间")
    private Long cnActivityEndTime;

    @ApiModelProperty(value = "活动介绍(html片段)")
    private String cnActivityBody;

    private static final long serialVersionUID = 1L;

    public String getCnActivityId() {
        return cnActivityId;
    }

    public void setCnActivityId(String cnActivityId) {
        this.cnActivityId = cnActivityId;
    }

    public String getCnActivityTitle() {
        return cnActivityTitle;
    }

    public void setCnActivityTitle(String cnActivityTitle) {
        this.cnActivityTitle = cnActivityTitle;
    }

    public Long getCnActivityEndTime() {
        return cnActivityEndTime;
    }

    public void setCnActivityEndTime(Long cnActivityEndTime) {
        this.cnActivityEndTime = cnActivityEndTime;
    }

    public String getCnActivityBody() {
        return cnActivityBody;
    }

    public void setCnActivityBody(String cnActivityBody) {
        this.cnActivityBody = cnActivityBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnActivityId=").append(cnActivityId);
        sb.append(", cnActivityTitle=").append(cnActivityTitle);
        sb.append(", cnActivityEndTime=").append(cnActivityEndTime);
        sb.append(", cnActivityBody=").append(cnActivityBody);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
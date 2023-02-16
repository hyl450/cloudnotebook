package com.hyl.cloudnote.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CnActivityStatus implements Serializable {
    @ApiModelProperty(value = "活动状态ID")
    private String cnActivityStatusId;

    @ApiModelProperty(value = "活动ID")
    private String cnActivityId;

    @ApiModelProperty(value = "活动状态Code")
    private String cnActivityStatusCode;

    @ApiModelProperty(value = "活动状态名称")
    private String cnActivityStatusName;

    private static final long serialVersionUID = 1L;

    public String getCnActivityStatusId() {
        return cnActivityStatusId;
    }

    public void setCnActivityStatusId(String cnActivityStatusId) {
        this.cnActivityStatusId = cnActivityStatusId;
    }

    public String getCnActivityId() {
        return cnActivityId;
    }

    public void setCnActivityId(String cnActivityId) {
        this.cnActivityId = cnActivityId;
    }

    public String getCnActivityStatusCode() {
        return cnActivityStatusCode;
    }

    public void setCnActivityStatusCode(String cnActivityStatusCode) {
        this.cnActivityStatusCode = cnActivityStatusCode;
    }

    public String getCnActivityStatusName() {
        return cnActivityStatusName;
    }

    public void setCnActivityStatusName(String cnActivityStatusName) {
        this.cnActivityStatusName = cnActivityStatusName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnActivityStatusId=").append(cnActivityStatusId);
        sb.append(", cnActivityId=").append(cnActivityId);
        sb.append(", cnActivityStatusCode=").append(cnActivityStatusCode);
        sb.append(", cnActivityStatusName=").append(cnActivityStatusName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
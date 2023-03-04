package com.hyl.cloudnote.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CnUser implements Serializable {
    @ApiModelProperty(value = "用户ID")
    private String cnUserId;

    @ApiModelProperty(value = "用户名")
    private String cnUserName;

    @ApiModelProperty(value = "密码")
    private String cnUserPassword;

    @ApiModelProperty(value = "确认密码")
    private String confirmPassword;

    @ApiModelProperty(value = "令牌")
    private String cnUserToken;

    @ApiModelProperty(value = "昵称")
    private String cnUserNick;

    @ApiModelProperty(value = "说明")
    private String cnUserDesc;

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    private static final long serialVersionUID = 1L;

    public String getCnUserId() {
        return cnUserId;
    }

    public void setCnUserId(String cnUserId) {
        this.cnUserId = cnUserId;
    }

    public String getCnUserName() {
        return cnUserName;
    }

    public void setCnUserName(String cnUserName) {
        this.cnUserName = cnUserName;
    }

    public String getCnUserPassword() {
        return cnUserPassword;
    }

    public void setCnUserPassword(String cnUserPassword) {
        this.cnUserPassword = cnUserPassword;
    }

    public String getCnUserToken() {
        return cnUserToken;
    }

    public void setCnUserToken(String cnUserToken) {
        this.cnUserToken = cnUserToken;
    }

    public String getCnUserNick() {
        return cnUserNick;
    }

    public void setCnUserNick(String cnUserNick) {
        this.cnUserNick = cnUserNick;
    }

    public String getCnUserDesc() {
        return cnUserDesc;
    }

    public void setCnUserDesc(String cnUserDesc) {
        this.cnUserDesc = cnUserDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnUserId=").append(cnUserId);
        sb.append(", cnUserName=").append(cnUserName);
        sb.append(", cnUserPassword=").append(cnUserPassword);
        sb.append(", cnUserToken=").append(cnUserToken);
        sb.append(", cnUserNick=").append(cnUserNick);
        sb.append(", cnUserDesc=").append(cnUserDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
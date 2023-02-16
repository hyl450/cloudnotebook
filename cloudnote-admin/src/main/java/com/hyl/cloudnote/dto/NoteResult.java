package com.hyl.cloudnote.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2022/12/16 14:56
 * @description :
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class NoteResult {
//	@ApiModelProperty(value = "用户名",required = true)
	private int status;//状态，0正确；其他错误
	private String msg;//消息
	private Object data;//传出去的数据
}

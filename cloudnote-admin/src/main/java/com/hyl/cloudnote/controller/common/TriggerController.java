package com.hyl.cloudnote.controller.common;

import com.hyl.cloudnote.service.common.SendMsgService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/2/16 14:20
 * @description :
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("trigger")
public class TriggerController {

	private final SendMsgService sendMsgService;
	@GetMapping("/send")
	public String sendMsgToMq(@RequestParam String msg) {
		sendMsgService.sendMsg(msg);
		return "ok";
	}
}

package com.hyl.cloudnote.controller.user;

import com.hyl.cloudnote.dto.NoteResult;
import com.hyl.cloudnote.entity.CnUser;
import com.hyl.cloudnote.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2022/12/16 14:40
 * @description : 用户管理
 */
@Controller
@RequestMapping("/cloudnote/user")
public class UserLoginController {
	@Resource
	private UserService userService;

	@RequestMapping("/login.do")
	@ResponseBody//返回JSON字符串
	public NoteResult login(String name, String password) throws Exception{
		System.out.println("execute方法");
		NoteResult result = userService.checkLogin(name, password);
		System.out.println(result);
		return result;
	}

	@RequestMapping("/updatePwd.do")
	@ResponseBody//返回JSON字符串
	public NoteResult updatePwd(String name, String password, String newpassword) throws Exception{
		System.out.println("execute方法");
		NoteResult result = userService.updatePwd(name, password,newpassword);
		System.out.println(result);
		return result;
	}

	@RequestMapping("/regist.do")
	@ResponseBody
	public NoteResult regist(@RequestBody CnUser cnUser) throws Exception{
		NoteResult result = userService.registUser(cnUser.getCnUserName(), cnUser.getCnUserPassword(), cnUser.getCnUserNick());
		return result;
	}

	@RequestMapping("/logout.do")
	@ResponseBody
	public NoteResult logout(@RequestBody CnUser cnUser) throws Exception{
		NoteResult result = userService.logout(cnUser.getCnUserId());
		return result;
	}
}

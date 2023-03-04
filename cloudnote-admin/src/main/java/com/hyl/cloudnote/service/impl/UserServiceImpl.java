package com.hyl.cloudnote.service.impl;

import com.hyl.cloudnote.common.util.NoteUtil;
import com.hyl.cloudnote.dto.NoteResult;
import com.hyl.cloudnote.entity.CnUser;
import com.hyl.cloudnote.mapper.CnUserMapper;
import com.hyl.cloudnote.service.UserService;
import com.hyl.cloudnote.service.common.SendMsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2022/12/16 15:23
 * @description :
 */
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private CnUserMapper cnUserMapper;

	@Resource
	private SendMsgService sendMsgService;

	@Override
	public NoteResult checkLogin(String name, String password) throws Exception {

		NoteResult result = new NoteResult();
		//检测用户名和密码
		CnUser user = cnUserMapper.selectByUserName(name);
		if(user==null){
			result.setStatus(1);
			result.setMsg("用户不存在");
			return result;
		}
		//将用户输入password加密
		String md5_pwd = NoteUtil.md5(password);
		//密文比对
		if(!user.getCnUserPassword().equals(md5_pwd)){
			result.setStatus(2);
			result.setMsg("密码错误");
			return result;
		}
		result.setStatus(0);
		result.setMsg("登录成功");
		//把用户ID返回给ajax回调函数
		result.setData(user.getCnUserId());
		return result;
	}

	public NoteResult registUser(String name, String password, String nick) throws Exception {
		NoteResult result = new NoteResult();
		//用户名唯一性检测
		CnUser has_user = cnUserMapper.selectByUserName(name);
		if(has_user!=null){
			result.setStatus(1);
			result.setMsg("用户名已存在");
			return result;
		}
		//执行添加
		CnUser user = new CnUser();

		String userId = NoteUtil.createId();
		user.setCnUserId(userId);//设置用户ID

		user.setCnUserName(name);//设置用户名
		String md5_pwd = NoteUtil.md5(password);
		user.setCnUserPassword(md5_pwd);//设置加密
		user.setCnUserNick(nick);//设置昵称
		cnUserMapper.insertSelective(user);//添加用户
		result.setStatus(0);
//		String s = null;
//		s.toString();
		result.setMsg("注册用户成功");
		return result;
	}

	@Override
	public NoteResult logout(String userId) {
		NoteResult result = new NoteResult();
		//TODO 发消息进行多余文件删除
		sendMsgService.sendMsg(userId);
		result.setStatus(0);
		result.setMsg("用户退出成功");
		return result;
	}

	public NoteResult updatePwd(String userName,String lastPwd, String newPwd) throws Exception {
		NoteResult result = new NoteResult();
		CnUser has_user = cnUserMapper.selectByUserName(userName);
		String md5OldPwd = NoteUtil.md5(lastPwd);

		if(!has_user.getCnUserPassword().equals(md5OldPwd)){
			result.setStatus(1);
			result.setMsg("旧密码不正确");
			return result;
		}
		String md5Pwd = NoteUtil.md5(newPwd);
		CnUser user = new CnUser();
		user.setCnUserId(has_user.getCnUserId());
		user.setCnUserPassword(md5Pwd);
		cnUserMapper.updateByPrimaryKeySelective(user);
		result.setStatus(0);
		result.setMsg("更新密码成功");

		return result;
	}

	public NoteResult lookUserName(String userId) {
		NoteResult result = new NoteResult();
		CnUser user = cnUserMapper.selectByPrimaryKey(userId);
		result.setStatus(0);
		result.setMsg("查询用户名成功");
		result.setData(user);
		return result;
	}
}

package com.hyl.cloudnote.service;

import com.hyl.cloudnote.dto.NoteResult;
import org.springframework.stereotype.Service;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2022/12/16 14:55
 * @description :
 */
public interface UserService {
	public NoteResult checkLogin(String name, String password) throws Exception;
	public NoteResult updatePwd(String userId, String oldPwd, String newPwd)throws Exception;
	public NoteResult lookUserName(String userId);
	public NoteResult registUser(String name, String password, String desc) throws Exception;
	NoteResult logout(String userId);
}

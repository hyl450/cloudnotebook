package com.hyl.cloudnote.controller.file;

import com.hyl.cloudnote.common.util.ueditor.ActionEnter;
import com.hyl.cloudnote.common.util.ueditor.define.UEditorFile;
import com.hyl.cloudnote.common.util.ueditor.define.UEditorUpload;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/2/4 20:00
 * @description :
 */
@RestController
public class UEditorController {

	@Autowired
	private UEditorUpload uEditorUpload;

	@RequestMapping("/config")
	public String exec(HttpServletRequest request,
	                   HttpServletResponse response,
	                   @RequestParam(value = "action") String action,
	                   @RequestParam(value = "userId") String userId,
	                   @RequestParam(value = "upfile", required = false) MultipartFile upfile) throws Exception {
		if (action.equals("config")) {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html");
			String rootPath = request.getSession().getServletContext().getRealPath("/");
			return new ActionEnter(request, rootPath).exec();
		} else if (action.equals("uploadimage")) {
			UEditorFile uEditorFile = uEditorUpload.uploadImage(upfile, userId);
			JSONObject jsonObject = new JSONObject(uEditorFile);
			return jsonObject.toString();
		}
		return "无效Action";
	}

//	@RequestMapping("/config")
//	public String exec(HttpServletRequest request,
//	                   HttpServletResponse response,
//	                   @RequestParam(value = "action") String action) throws Exception {
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html");
//		String rootPath = request.getSession().getServletContext().getRealPath("/");
//		return new ActionEnter(request, rootPath).exec();
//	}
}

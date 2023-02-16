package com.hyl.cloudnote.common.util.ueditor.define;

import com.hyl.cloudnote.common.util.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/2/4 20:54
 * @description :
 */
@Service
public class UEditorUpload {

	private Logger log = LoggerFactory.getLogger(UEditorUpload.class);
	private String path = ClassUtils.getDefaultClassLoader().getResource("").getPath();

	@Resource
	private RedisService redisService;

	public UEditorFile uploadImage(MultipartFile file, String userId) throws IOException {
		log.info("UEditor开始上传文件");
		String fileName = file.getOriginalFilename();  //获取文件名
		//Ueditor的config.json规定的返回路径格式
		//TODO 文件名序列
		Object fileId = redisService.get("FILE_NAME_SEQ");
		if(fileId == null) {
			fileId = 10000;
			redisService.set("FILE_NAME_SEQ", String.valueOf(10000));
		} else {
			fileId = redisService.incr("FILE_NAME_SEQ", 1);
		}
		String returnPath = "/image/upload/ueditor/"+userId+"/"+new Date().getTime() + "_"+ fileId + "_" + fileName;
		//部署时需要修改
		path = "/root/hyl/";
		File saveFile = new File(path+"static"+returnPath);
		if (!saveFile.exists()){
			saveFile.mkdirs();
		}
		file.transferTo(saveFile);  //将临时文件移动到保存路径
		log.info("UEditor上传文件成功，保存路径："+saveFile.getAbsolutePath());
		UEditorFile uEditorFile = new UEditorFile();
		uEditorFile.setState("SUCCESS");
		uEditorFile.setUrl(returnPath);  //访问URL
		uEditorFile.setTitle(fileName);
		uEditorFile.setOriginal(fileName);
		return uEditorFile;
	}
}

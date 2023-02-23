package com.hyl.cloudnote.service.common;

import com.hyl.cloudnote.entity.CnNote;
import com.hyl.cloudnote.entity.CnNoteExample;
import com.hyl.cloudnote.mapper.CnNoteMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/2/15 22:03
 * @description :
 */
@Service
public class DelSurplusImageFiles {

	private static final Logger log = LoggerFactory.getLogger(DelSurplusImageFiles.class);

	@Resource
	private CnNoteMapper cnNoteMapper;
	@Value("${ueditor.image.filePath}")
	private String filePath;

	@RabbitListener(queues = {"del_surplus_image_files"})
	public void queueConsumer(@Payload String cnUserId){
		log.info("消息主题:del_surplus_image_files,消息内容:{}", cnUserId);
		log.info("消费者正在消费消息...begin...:{}", cnUserId);
		log.info("DelSurplusImageFiles_queueConsumer_del_surplus_image_files:{}", cnUserId);
		//删除多余的文件
//		String filePath = System.getProperty("user.dir") + "/static/image/upload/ueditor/"+cnUserId;
		filePath = filePath + cnUserId;
//		String filePath = System.getProperty("user.dir") + "\\cloudnote-admin\\target\\classes\\static\\image\\upload\\ueditor\\"+cnUserId;
		log.info("DelSurplusImageFiles_queueConsumer_filePath:{}", filePath);

		List<String> fileNames = getFileNames(filePath);
		if(fileNames != null && fileNames.size() > 0) {
			for (String fileName : fileNames) {
				log.info("fileName:{}", fileName);
				Map<String, Object> inMap = new HashMap<>();
				inMap.put("cn_user_id", cnUserId);
				inMap.put("body", fileName);
				List<CnNote> cnNotes = cnNoteMapper.selectCnNoteByLikeBody(inMap);
				if(cnNotes != null && cnNotes.size() > 0) {
					log.info("cnUserId:{}, cnNotes:{}, cnNotes_size:{}", cnUserId, cnNotes, cnNotes.size());
				} else {
					String filePathName = filePath+File.separator+fileName;
					log.info("cnUserId:{}, filePathName:{},cn_note表不存在该文件记录，该多余图片文件进行删除操作！", cnUserId, filePathName);
					File file = new File(filePathName);
					if(file.isFile()) {
						file.delete();
					}
				}
			}
		}
		log.info("消费者已消费消息...end...:{}", cnUserId);

//		try (Stream<Path> paths = Files.walk(Paths.get(filePath))){
//			List<Path> fileNames = paths
//					.filter(Files::isRegularFile)
//					.collect(Collectors.toList());
//			if(fileNames != null && fileNames.size() > 0) {
//				for (Path fileName : fileNames) {
//					log.info("fileName:{}", fileName);
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	private List<String> getFileNames(String path) {
		File file = new File(path);
		if (!file.exists()) {
			return null;
		}
		List<String> fileNames = new ArrayList<>();
		return getFileNames(file, fileNames);
	}

	private List<String> getFileNames(File file, List<String> fileNames) {
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				getFileNames(f, fileNames);
			} else {
				fileNames.add(f.getName());
			}
		}
		return fileNames;
	}

//	@Scheduled(cron = "0 0/1 * * * ?")
//	public void task(){
//		//TODO 删除多余的文件
//		String filePath = System.getProperty("user.dir") + "/static/image/upload/ueditor/"+userId;
//		try (Stream<Path> paths = Files.walk(Paths.get(filePath))){
//			List<Path> fileNames = paths
//					.filter(Files::isRegularFile)
//					.collect(Collectors.toList());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}

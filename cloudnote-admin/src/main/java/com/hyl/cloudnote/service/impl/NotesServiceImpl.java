package com.hyl.cloudnote.service.impl;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/1/29 11:15
 * @description :
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.hyl.cloudnote.common.util.NoteUtil;
import com.hyl.cloudnote.common.util.RedisService;
import com.hyl.cloudnote.common.util.StringUtils;
import com.hyl.cloudnote.entity.*;
import com.hyl.cloudnote.mapper.CnNoteMapper;
import com.hyl.cloudnote.mapper.CnShareMapper;
import com.hyl.cloudnote.service.NotesService;
import com.hyl.cloudnote.dto.NoteResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("notesService")
@Transactional
public class NotesServiceImpl implements NotesService {
	@Resource
	private CnNoteMapper noteDao;
	@Resource
	private CnShareMapper shareDao;
	@Resource
	private RedisService redisService;

	public NoteResult loadBookNotes(String bookId) {
		NoteResult result = new NoteResult();
		List<CnNote> notes = noteDao.findByBookId(bookId);
		result.setStatus(0);
		result.setMsg("加载笔记列表成功");
		result.setData(notes);
		return result;
	}

	public NoteResult loadNote(String noteId) {
		NoteResult result = new NoteResult();
		String cn_note_title = StringUtils.castToString(redisService.get("cn_note_title:" + noteId));
		if (cn_note_title != null && !"".equals(cn_note_title)) {
			CnNote note = new CnNote();
			note.setCnNoteId(noteId);
			note.setCnNoteTitle(cn_note_title);
			String cn_note_body = StringUtils.castToString(redisService.get("cn_note_body:" + noteId));
			if(cn_note_body != null && !"".equals(cn_note_body)) {
				note.setCnNoteBody(cn_note_body);
			} else {
				CnNote notenew = noteDao.selectByPrimaryKey(noteId);
				redisService.set("cn_note_title:" + noteId, notenew.getCnNoteTitle());
				redisService.set("cn_note_body:" + noteId, notenew.getCnNoteBody());
				note.setCnNoteBody(notenew.getCnNoteBody());
			}
			result.setStatus(0);
			result.setMsg("打开笔记成功");
			result.setData(note);
			return result;
		}
		CnNote note = noteDao.selectByPrimaryKey(noteId);
		redisService.set("cn_note_title:" + noteId, note.getCnNoteTitle());
		redisService.set("cn_note_body:" + noteId, note.getCnNoteBody());
		result.setStatus(0);
		result.setMsg("打开笔记成功");
		result.setData(note);
		return result;
	}

	public NoteResult addNote(String userId, String bookId, String noteName) {
		NoteResult result = new NoteResult();
		CnNote note = new CnNote();
		String noteId = NoteUtil.createId();
		note.setCnNoteId(noteId);
		note.setCnNotebookId(bookId);
		note.setCnUserId(userId);
		note.setCnNoteStatusId("1");//normal
		note.setCnNoteTypeId("1");//normal
		note.setCnNoteTitle(noteName);
		note.setCnNoteBody("");
		Long time = System.currentTimeMillis();
		note.setCnNoteCreateTime(time);
		note.setCnNoteLastModifyTime(time);
		noteDao.insertSelective(note);
		//返回结果
		result.setStatus(0);
		result.setMsg("创建笔记成功");
		result.setData(note.getCnNoteId());
		return result;
	}

	public NoteResult saveNote(String noteId, String noteName, String noteDesc) {
		CnNote note = new CnNote();
		note.setCnNoteId(noteId);
		note.setCnNoteTitle(noteName);
		note.setCnNoteBody(noteDesc);
		Long time = System.currentTimeMillis();
		note.setCnNoteLastModifyTime(time);
		int rows = noteDao.updateByPrimaryKeySelective(note);
		//更新cn_share表
		CnShare share = new CnShare();
		share.setCnShareId(noteName);
		share.setCnShareBody(noteDesc);
		share.setCnNoteId(noteId);
		shareDao.updateByPrimaryKeySelective(share);
		//返回结果
		NoteResult result = new NoteResult();
		if (rows == 0) {
			result.setStatus(1);
			result.setMsg("保存笔记失败");
		} else {
			redisService.set("cn_note_title:" + noteId, noteName);
			redisService.set("cn_note_body:" + noteId, noteDesc);
			result.setStatus(0);
			result.setMsg("保存笔记成功");
		}
		return result;
	}

	public NoteResult recycleNote(String noteId) {
		CnNote record = new CnNote();
		record.setCnNoteId(noteId);
		record.setCnNoteStatusId("2");
		int rows = noteDao.updateByPrimaryKeySelective(record);
		//返回结果
		NoteResult result = new NoteResult();
		if (rows == 0) {
			result.setStatus(1);
			result.setMsg("删除笔记失败");
		} else {
			redisService.del("cn_note_title:" + noteId);
			redisService.del("cn_note_body:" + noteId);
			result.setStatus(0);
			result.setMsg("删除笔记成功");
		}
		//删除曾经共享过的笔记，共享笔记也被删除
		CnShareExample cnShareExample = new CnShareExample();
		CnShareExample.Criteria criteria = cnShareExample.createCriteria();
		criteria.andCnNoteIdEqualTo(noteId);
		List<CnShare> has_share = shareDao.selectByExample(cnShareExample);
		if (has_share != null && has_share.size() > 0) {
			shareDao.deleteByPrimaryKey(noteId);
		}
		return result;
	}

	public NoteResult moveNote(String noteId, String bookId) {
		CnNote record = new CnNote();
		record.setCnNoteId(noteId);
		record.setCnNotebookId(bookId);
		int rows = noteDao.updateByPrimaryKeySelective(record);
		NoteResult result = new NoteResult();
		if (rows == 0) {
			result.setStatus(1);
			result.setMsg("移动笔记失败");
		} else {
			result.setStatus(0);
			result.setMsg("移动笔记成功");
		}
		return result;
	}

	public NoteResult loadBackNotes(String userId) {
		NoteResult result = new NoteResult();
		CnNoteExample example = new CnNoteExample();
		CnNoteExample.Criteria criteria = example.createCriteria();
		criteria.andCnUserIdEqualTo(userId);
		List<CnNote> notes = noteDao.selectByExample(example);
		result.setStatus(0);
		result.setMsg("打开回收站笔记成功");
		result.setData(notes);
		return result;
	}

	@Override
	public NoteResult deleteBackNote(String noteId) {
		NoteResult result = new NoteResult();
		int rows = noteDao.deleteByPrimaryKey(noteId);
		if (rows != 0) {
			result.setStatus(0);
			result.setMsg("删除回收站笔记成功");
		} else {
			result.setStatus(1);
			result.setMsg("删除回收站笔记失败");
		}
		return result;
	}

	public NoteResult replayNote(String newBookId, String noteId) {
		NoteResult result = new NoteResult();
		//此处也可以拆分两步来做
		//1.通过noteId修改bookId
		//2.通过noteId修改笔记状态
//		Map<String, Object> map1 = new HashMap<String, Object>();
//		map1.put("noteId", noteId);
//		map1.put("bookId", newBookId);
//		noteDao.updateBookId(map1);
//		Map<String, Object> map2 = new HashMap<String, Object>();
//		map2.put("noteId", noteId);
//		map2.put("statusId", "1");
//		noteDao.updateStatus(map2);
		CnNote record = new CnNote();
		record.setCnNoteId(noteId);
		record.setCnNotebookId(newBookId);
		record.setCnNoteStatusId("2");
		noteDao.updateByPrimaryKeySelective(record);

		result.setStatus(0);
		result.setMsg("还原笔记成功");
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("newBookId", newBookId);
//		map.put("noteId", noteId);
//		int rows = noteDao.replayNote(map);
//		if(rows!=0){
//			result.setStatus(0);
//			result.setMsg("还原笔记成功");
//		}else{
//			result.setStatus(1);
//			result.setMsg("还原笔记失败");
//		}
		return result;
	}

	@Override
	public NoteResult updateNoteIp(ReqParam reqParam) {
		Map<String, Object> inMap = new HashMap<>();
		inMap.put("body", reqParam.getOldIpAddress());
		List<CnNote> notes = noteDao.selectCnNoteByLikeBody(inMap);
		int rows = noteDao.updateNoteIp(reqParam);
		NoteResult result = new NoteResult();
		if(rows != 0){
			if(notes != null && notes.size() > 0) {
				for(CnNote cnNote : notes) {
					String cn_note_body = StringUtils.castToString(redisService.get("cn_note_body:"+cnNote.getCnNoteId()));
					redisService.set("cn_note_body:"+cnNote.getCnNoteId(), cn_note_body.replaceAll(reqParam.getOldIpAddress(), reqParam.getNewIpAddress()));
				}
			}
			result.setStatus(0);
			result.setMsg("笔记图片ip地址修改成功");
		}else{
			result.setStatus(1);
			result.setMsg("笔记图片ip地址修改失败");
		}
		return result;
	}
}
package com.hyl.cloudnote.service.impl;

import com.hyl.cloudnote.common.util.NoteUtil;
import com.hyl.cloudnote.dto.NoteResult;
import com.hyl.cloudnote.entity.CnNoteExample;
import com.hyl.cloudnote.entity.CnNotebook;
import com.hyl.cloudnote.entity.CnNotebookExample;
import com.hyl.cloudnote.entity.ReqParam;
import com.hyl.cloudnote.mapper.CnNoteMapper;
import com.hyl.cloudnote.mapper.CnNotebookMapper;
import com.hyl.cloudnote.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/2/2 20:42
 * @description :
 */
@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService {

	@Resource
	private CnNotebookMapper bookDao;
	@Resource
	private CnNoteMapper noteDao;
	@Transactional(readOnly=true)
	public NoteResult loadUserBooks(String userId) {
		NoteResult result = new NoteResult();
		CnNotebookExample example = new CnNotebookExample();
		CnNotebookExample.Criteria criteria = example.createCriteria();
		criteria.andCnUserIdEqualTo(userId);
		List<CnNotebook> books = bookDao.selectByExample(example);
		result.setStatus(0);
		result.setMsg("加载笔记本成功");
		result.setData(books);
		return result;
	}

	public NoteResult addBook(String bookName,String userId) {
		NoteResult result = new NoteResult();
		CnNotebook book = new CnNotebook();
		String bookId = NoteUtil.createId();
		book.setCnNotebookName(bookName);
		book.setCnUserId(userId);
		book.setCnNotebookId(bookId);
		book.setCnNotebookTypeId("5");
		book.setCnNotebookDesc("");
//		Timestamp time = new Timestamp(System.currentTimeMillis());
//		book.setCn_notebook_createtime(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		String strDate = sdf.format(ts);
		book.setCnNotebookCreatetime(Timestamp.valueOf(strDate));
		bookDao.insertSelective(book);
		result.setStatus(0);
		result.setMsg("新增笔记本成功");
		result.setData(book.getCnNotebookId());
		return result;
	}

	public NoteResult deleteBook(String bookId) {
		int rows = bookDao.deleteByPrimaryKey(bookId);
		NoteResult result = new NoteResult();
		if(rows != 0){
			result.setStatus(0);
			result.setMsg("删除笔记本成功");
		}else{
			result.setStatus(1);
			result.setMsg("删除笔记本成功");
		}
		//同时删除该笔记本下的所有笔记
		CnNoteExample example = new CnNoteExample();
		CnNoteExample.Criteria criteria = example.createCriteria();
		criteria.andCnNotebookIdEqualTo(bookId);
		noteDao.deleteByExample(example);
		return result;
	}

	public NoteResult renameBook(String bookName, String bookId) {
		CnNotebook record = new CnNotebook();
		record.setCnNotebookId(bookId);
		record.setCnNotebookName(bookName);
		int rows = bookDao.updateByPrimaryKeySelective(record);
		NoteResult result = new NoteResult();
		if(rows != 0){
			result.setStatus(0);
			result.setMsg("笔记本重命名成功");
		}else{
			result.setStatus(1);
			result.setMsg("笔记本重命名失败");
		}
		return result;
	}
}

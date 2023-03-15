package com.hyl.cloudnote.controller.notebook;

import com.hyl.cloudnote.dto.NoteResult;
import com.hyl.cloudnote.entity.*;
import com.hyl.cloudnote.service.BookService;
import com.hyl.cloudnote.service.NotesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/2/2 20:41
 * @description :
 */
@Controller
@RequestMapping("/notebook")
public class NoteBooksController {
	@Resource
	private BookService bookService;

	@Resource
	private NotesService notesService;

	@RequestMapping("/loadbooks.do")
	@ResponseBody
	public NoteResult loadbooks(@RequestBody CnNotebook notebook){
		NoteResult result = bookService.loadUserBooks(notebook.getCnUserId(), notebook.getOrderByClause());
		return result;
	}

	@RequestMapping("/loadnotes.do")
	@ResponseBody
	public NoteResult loadnotes(@RequestBody CnNotebook cnNotebook){
		NoteResult result = notesService.loadBookNotes(cnNotebook.getCnNotebookId(), cnNotebook.getOrderByClause());
		return result;
	}

	@RequestMapping("/loadnote.do")
	@ResponseBody
	public NoteResult loadnote(@RequestBody CnNote cnNote){
		NoteResult result = notesService.loadNote(cnNote.getCnNoteId());
		return result;
	}

	@RequestMapping("/notebookadd.do")
	@ResponseBody
	public NoteResult notebookadd(@RequestBody CnNotebook cnNotebook){
		NoteResult result = bookService.addBook(cnNotebook.getCnNotebookName(), cnNotebook.getCnUserId());
		return result;
	}

	@RequestMapping("/delbook.do")
	@ResponseBody
	public NoteResult delbook(@RequestBody CnNotebook cnNotebook){
		NoteResult result = bookService.deleteBook(cnNotebook.getCnNotebookId());
		return result;
	}

	@RequestMapping("/renameBook.do")
	@ResponseBody
	public NoteResult renameBook(@RequestBody CnNotebook cnNotebook){
		NoteResult result = bookService.renameBook(cnNotebook.getCnNotebookName(), cnNotebook.getCnNotebookId());
		return result;
	}

	@RequestMapping("/addNote.do")
	@ResponseBody
	public NoteResult addNote(@RequestBody CnNote cnNote){
		NoteResult result = notesService.addNote(cnNote.getCnUserId(), cnNote.getCnNotebookId(), cnNote.getCnNoteTitle());
		return result;
	}

	@RequestMapping("/saveNote.do")
	@ResponseBody
	public NoteResult saveNote(@RequestBody CnNote cnNote){
		NoteResult result = notesService.saveNote(cnNote.getCnNoteId(),cnNote.getCnNoteTitle(),cnNote.getCnNoteBody());
		return result;
	}

	//从回收站彻底删除笔记
	@RequestMapping("/delbacknote.do")
	@ResponseBody
	public NoteResult delbacknote(@RequestBody CnNote cnNote){
		NoteResult result = notesService.deleteBackNote(cnNote.getCnNoteId());
		return result;
	}

	//将笔记移入回收站
	@RequestMapping("/recyclenote.do")
	@ResponseBody
	public NoteResult recyclenote(@RequestBody CnNote cnNote){
		NoteResult result = notesService.recycleNote(cnNote.getCnNoteId());
		return result;
	}

	/**
	 * @description : 更新笔记中图片ip信息，使其能够正常展示
	 * @param : [reqParam]
	 * @return : com.hyl.cloudnote.dto.NoteResult
	 * @author : huangyl
	 * @time : 2023/3/2
	 */
	@RequestMapping("/updateNoteIp.do")
	@ResponseBody
	public NoteResult updateNoteIp(@RequestBody ReqParam reqParam){
		NoteResult result = notesService.updateNoteIp(reqParam);
		return result;
	}

	/**
	 * @description : 回收站
	 * @param : [cnUser]
	 * @return : com.hyl.cloudnote.dto.NoteResult
	 * @author : huangyl
	 * @time : 2023/3/2
	 */
	@RequestMapping("/loadbacknotes.do")
	@ResponseBody
	public NoteResult loadbacknotes(@RequestBody CnUser cnUser){
		NoteResult result = notesService.loadBackNotes(cnUser.getCnUserId());
		return result;
	}

	/**
	 * @description : 还原笔记
	 * @param : [cnNote]
	 * @return : com.hyl.cloudnote.dto.NoteResult
	 * @author : huangyl
	 * @time : 2023/3/3
	 */
	@RequestMapping("/replayNote.do")
	@ResponseBody
	public NoteResult replayNote(@RequestBody CnNote cnNote){
		NoteResult result = notesService.replayNote(cnNote.getCnNoteNewbookId(), cnNote.getCnNoteId());
		return result;
	}

	/**
	 * @description : 收藏或取消收藏笔记
	 * @param : [cnNote]
	 * @return : com.hyl.cloudnote.dto.NoteResult
	 * @author : huangyl
	 * @time : 2023/3/3
	 */
	@RequestMapping("/upNoteTypeId.do")
	@ResponseBody
	public NoteResult upNoteTypeId(@RequestBody CnNote cnNote){
		NoteResult result = notesService.upNoteTypeId(cnNote);
		return result;
	}

	/**
	 * @description : 查询收藏笔记
	 * @param : [cnNote]
	 * @return : com.hyl.cloudnote.dto.NoteResult
	 * @author : huangyl
	 * @time : 2023/3/3
	 */
	@RequestMapping("/loadLikeNotes.do")
	@ResponseBody
	public NoteResult loadLikeNotes(@RequestBody CnNote cnNote){
		NoteResult result = notesService.loadLikeNotes(cnNote);
		return result;
	}

	/**
	 * @description : 搜索笔记
	 * @param : [cnNote]
	 * @return : com.hyl.cloudnote.dto.NoteResult
	 * @author : huangyl
	 * @time : 2023/3/4
	 */
	@RequestMapping("/toSearchNotes.do")
	@ResponseBody
	public NoteResult toSearchNotes(@RequestBody CnNote cnNote){
		NoteResult result = notesService.toSearchNotes(cnNote);
		return result;
	}

	/**
	 * @description : 移动笔记
	 * @param : [cnNote]
	 * @return : com.hyl.cloudnote.dto.NoteResult
	 * @author : huangyl
	 * @time : 2023/3/10
	 */
	@RequestMapping("/moveNote.do")
	@ResponseBody
	public NoteResult moveNote(@RequestBody CnNote cnNote){
		NoteResult result = notesService.moveNote(cnNote.getCnNoteId(), cnNote.getCnNoteNewbookId());
		return result;
	}

	/**
	 * @description : 分享笔记
	 * @param : [cnNote]
	 * @return : com.hyl.cloudnote.dto.NoteResult
	 * @author : huangyl
	 * @time : 2023/3/10
	 */
	@RequestMapping("/shareNote.do")
	@ResponseBody
	public NoteResult shareNote(@RequestBody CnNote cnNote){
		NoteResult result = notesService.shareNote(cnNote.getCnNoteId());
		return result;
	}

	/**
	 * @description : 加载分享笔记列表
	 * @param : [cnNote]
	 * @return : com.hyl.cloudnote.dto.NoteResult
	 * @author : huangyl
	 * @time : 2023/3/10
	 */
	@RequestMapping("/loadShareNotes.do")
	@ResponseBody
	public NoteResult loadShareNote(@RequestBody CnNote cnNote){
		NoteResult result = notesService.loadShareNotes(cnNote.getCnUserId());
		return result;
	}

	/**
	 * @description : 取消分享笔记
	 * @param : [cnNote]
	 * @return : com.hyl.cloudnote.dto.NoteResult
	 * @author : huangyl
	 * @time : 2023/3/10
	 */
	@RequestMapping("/delShareNote.do")
	@ResponseBody
	public NoteResult delShareNote(@RequestBody CnShare cnShare){
		NoteResult result = notesService.delShareNote(cnShare);
		return result;
	}

}

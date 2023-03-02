package com.hyl.cloudnote.controller.notebook;

import com.hyl.cloudnote.dto.NoteResult;
import com.hyl.cloudnote.entity.CnNote;
import com.hyl.cloudnote.entity.CnNotebook;
import com.hyl.cloudnote.entity.CnUser;
import com.hyl.cloudnote.entity.ReqParam;
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
		NoteResult result = bookService.loadUserBooks(notebook.getCnUserId());
		return result;
	}

	@RequestMapping("/loadnotes.do")
	@ResponseBody
	public NoteResult loadnotes(@RequestBody CnNotebook cnNotebook){
		NoteResult result = notesService.loadBookNotes(cnNotebook.getCnNotebookId());
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

	@RequestMapping("/delbacknote.do")
	@ResponseBody
	public NoteResult delbacknote(@RequestBody CnNote cnNote){
		NoteResult result = notesService.deleteBackNote(cnNote.getCnNoteId());
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

}

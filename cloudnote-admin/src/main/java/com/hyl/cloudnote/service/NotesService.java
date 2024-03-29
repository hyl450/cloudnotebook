package com.hyl.cloudnote.service;

import com.hyl.cloudnote.dto.NoteResult;
import com.hyl.cloudnote.entity.CnNote;
import com.hyl.cloudnote.entity.CnShare;
import com.hyl.cloudnote.entity.ReqParam;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/1/29 11:13
 * @description :
 */
public interface NotesService {
	public NoteResult loadBookNotes(String bookId, String orderByCause);
	public NoteResult loadNote(String noteId);
	public NoteResult addNote(String userId, String bookId, String noteName);
	public NoteResult saveNote(String noteId, String noteName, String noteDesc);
	public NoteResult recycleNote(String noteId);
	public NoteResult moveNote(String noteId, String bookId);
	public NoteResult loadBackNotes(String userId);
	public NoteResult deleteBackNote(String noteId);
	public NoteResult replayNote(String newBookId, String noteId);

	NoteResult updateNoteIp(ReqParam reqParam);

	NoteResult upNoteTypeId(CnNote cnNote);

	NoteResult loadLikeNotes(CnNote cnNote);

	NoteResult toSearchNotes(CnNote cnNote);

	NoteResult shareNote(String noteId);

	NoteResult loadShareNotes(String cnUserId);

	NoteResult delShareNote(CnShare cnShare);
}

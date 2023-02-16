package com.hyl.cloudnote.service;

import com.hyl.cloudnote.dto.NoteResult;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/2/2 20:42
 * @description :
 */
public interface BookService {
	public NoteResult loadUserBooks(String userId);
	public NoteResult addBook(String bookName, String userId);
	public NoteResult deleteBook(String bookId);
	public NoteResult renameBook(String bookName, String bookId);
}

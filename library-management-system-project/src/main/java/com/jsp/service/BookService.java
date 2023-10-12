package com.jsp.service;

import java.util.List;

import com.jsp.dao.BookDao;
import com.jsp.dto.BookDto;


public class BookService {
	BookDao bookDao=new BookDao();
	
	public BookDto savebookData(BookDto bookDto) {
		return bookDao.savebookData(bookDto);
	}

	public boolean deletebookById(int id) {
		return bookDao.deletebookById(id);
	}
	
	public void updatebook(int id,String title) {
		bookDao.updatebook(id, title);
	}
	
	public void getOnebookData(int id) {
		bookDao.getOnebookData(id);	
	}
	
	public List<BookDto> getAllData(BookDto bookDto){
		return bookDao.getAllData(bookDto);
	}
	
}


package com.jsp.controller;

import com.jsp.dto.BookDto;

import com.jsp.service.LibrarianService;

public class BookLibrarianInsert {
	public static void main(String[] args) {
		
		LibrarianService librarianService=new LibrarianService();
		BookDto bookDto=new BookDto();
		bookDto.setAuthor_name("John Snow");
		bookDto.setTitle("Cricket Rebel");
		bookDto.setStatus("Available");
		librarianService.insertBookByLibrarian(bookDto);
	}

}


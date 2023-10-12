package com.jsp.controller;

import com.jsp.dto.BookDto;
import com.jsp.service.BookService;
public class BookInsertDataController {

		public static void main(String[] args) {
			BookDto bookDto=new BookDto();
			bookDto.setTitle("world");
			bookDto.setAuthor_name("abcde");
			bookDto.setStatus("Available");
			BookService bookService=new BookService();
			bookService.savebookData(bookDto);
		}

	}


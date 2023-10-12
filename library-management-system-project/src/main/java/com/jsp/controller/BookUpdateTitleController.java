package com.jsp.controller;

import com.jsp.service.BookService;
public class BookUpdateTitleController {

		public static void main(String[] args) {
			BookService bookService=new BookService();
			bookService.updatebook(2, "acvhbj");
		}

	}


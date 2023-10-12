package com.jsp.controller;

import com.jsp.service.BookService;
public class BookGetOneDataController {

		public static void main(String[] args) {
			BookService bookService=new BookService();
				bookService.getOnebookData(2);	
		}

	}


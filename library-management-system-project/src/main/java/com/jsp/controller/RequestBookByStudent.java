package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class RequestBookByStudent {
	public static void main(String[] args) {
		LibrarianService librarianService=new LibrarianService();
		librarianService.requestBookLibrarian(2, 1, 1);	//book,student,librarian id
	}
	

}

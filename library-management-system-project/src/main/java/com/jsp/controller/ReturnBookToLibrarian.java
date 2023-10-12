package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class ReturnBookToLibrarian {
	public static void main(String[] args) {
		LibrarianService librarianService=new LibrarianService();
		librarianService.returnBookToLibrarian(1);  //book id 
	}

}

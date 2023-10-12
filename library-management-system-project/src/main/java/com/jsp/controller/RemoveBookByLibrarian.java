package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class RemoveBookByLibrarian {
	public static void main(String[] args) {
		LibrarianService librarianService=new LibrarianService();
		librarianService.removeBook(3);
	}

}

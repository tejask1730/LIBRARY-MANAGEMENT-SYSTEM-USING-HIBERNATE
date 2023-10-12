package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class IssuedBookByLirarian {
	public static void main(String[] args) {
		LibrarianService librarianService=new LibrarianService();
		boolean res=	librarianService.issuedBookByLibrarian(2,1,1);   //book,student,library id
		System.out.println(res);
	}

}

package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class LibrarianLoginController {
	public static void main(String[] args) {
		LibrarianService librarianService=new LibrarianService();
		boolean res=	librarianService.validateLibrarian(3, "Mayur", "UnApproved");
		System.out.println(res);
	}

	
	
}

/*
true*/

package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class UPdateLibrarianStatusController {

	public static void main(String[] args) {
		LibrarianService librarianService=new LibrarianService();
		librarianService.updateByIdStatus(3, "Shyam");

	}

}
/*
1	Mayur	UnAuthorized
3	Shyam	UnAuthorized
4	Ram	UnAuthorized
*/

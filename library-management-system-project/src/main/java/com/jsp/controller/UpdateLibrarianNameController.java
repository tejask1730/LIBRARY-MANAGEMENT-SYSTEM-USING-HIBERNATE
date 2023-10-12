package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class UpdateLibrarianNameController {

	public static void main(String[] args) {
		LibrarianService librarianService=new LibrarianService();
		librarianService.updateById(4, "Ram");

	}

}
/*
1	Mayur	UnAuthorized
3	Rahul	UnAuthorized
4	Ram	UnAuthorized
		
*/

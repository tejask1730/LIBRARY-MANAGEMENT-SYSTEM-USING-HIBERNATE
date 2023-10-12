package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class LibrarianGetOneDataController {
	public static void main(String[] args) {
		LibrarianService librarianService=new  LibrarianService();
		librarianService.getOneData(3);
	}

}
/*

3
Shyam
UnAuthorized

*/

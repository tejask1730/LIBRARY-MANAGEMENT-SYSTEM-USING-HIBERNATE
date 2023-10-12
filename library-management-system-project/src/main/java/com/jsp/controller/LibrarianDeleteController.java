package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class LibrarianDeleteController {
	public static void main(String[] args) {
		LibrarianService librarianService=new LibrarianService();
		librarianService.deleteById(2);
		}

	}

	/*

	1	Mayur	UnAuthorized
	3	Rahul	UnAuthorized
	4	Pratik	UnAuthorized
			
	*/



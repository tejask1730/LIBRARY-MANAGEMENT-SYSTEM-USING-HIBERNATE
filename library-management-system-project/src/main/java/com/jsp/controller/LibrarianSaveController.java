package com.jsp.controller;

import com.jsp.dto.LibrarianDto;
import com.jsp.service.LibrarianService;

public class LibrarianSaveController {
	public static void main(String[] args) {
		LibrarianDto librarianDto=new LibrarianDto();
		librarianDto.setName("Tushar1");
		librarianDto.setStatus("UnApproved");
		
		LibrarianService librarianService=new LibrarianService();
		librarianService.saveLibrarianData(librarianDto);
	}

}


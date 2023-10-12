package com.jsp.controller;

import com.jsp.dto.StudentDto;
import com.jsp.service.StudentService;
public class StudentInsertDataController {

		public static void main(String[] args) {
			StudentDto studentDto=new StudentDto();
			studentDto.setName("Rohit");
			studentDto.setEmail("rohit@mail.com");
			
			StudentService studentService=new StudentService();
			
			
			studentService.saveStudentData(studentDto);

		}

	}


package com.jsp.controller;

import com.jsp.service.StudentService;
public class StudentGetOneDataController {
		public static void main(String[] args) {
			StudentService studentService=new StudentService();
				studentService.getOneStudentData(3);
			
		}

	}


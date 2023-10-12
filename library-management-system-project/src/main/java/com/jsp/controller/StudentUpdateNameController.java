package com.jsp.controller;

import com.jsp.service.StudentService;
public class StudentUpdateNameController {
		public static void main(String[] args) {
			StudentService studentService=new StudentService();
			studentService.updateStudent(2, "nsm");
		}

	}


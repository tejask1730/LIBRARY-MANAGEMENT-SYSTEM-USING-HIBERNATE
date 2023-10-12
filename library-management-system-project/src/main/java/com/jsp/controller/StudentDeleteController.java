package com.jsp.controller;

import com.jsp.service.StudentService;
public class StudentDeleteController {
		public static void main(String[] args) {
			StudentService studentService=new StudentService();
			boolean a=studentService.deleteStudentById(1);
			System.out.println(a);
		}

	}


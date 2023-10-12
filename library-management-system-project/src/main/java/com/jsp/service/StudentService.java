package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.StudentDto;

public class StudentService {
	
	StudentDao studentDao=new StudentDao();
	
	public StudentDto saveStudentData(StudentDto studentDto) {
		return studentDao.saveStudentData(studentDto);
	}

	public boolean deleteStudentById(int id) {
		return studentDao.deleteStudentById(id);
	}
	
	public void updateStudent(int id,String name) {
		studentDao.updateStudent(id, name);
	}
	
	public void getOneStudentData(int id) {
		studentDao.getOneStudentData(id);	
	}
	
	public List<StudentDto> getAllData(StudentDto studentDto){
		return studentDao.getAllData(studentDto);
	}
	
}

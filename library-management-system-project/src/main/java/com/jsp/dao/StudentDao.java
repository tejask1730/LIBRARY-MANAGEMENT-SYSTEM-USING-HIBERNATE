package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.StudentDto;

public class StudentDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("tejas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public StudentDto saveStudentData(StudentDto studentDto) {
		entityTransaction.begin();
		entityManager.persist(studentDto);
		entityTransaction.commit();
		return studentDto;
	}
	
	public boolean deleteStudentById(int id) {
	StudentDto s=	entityManager.find(StudentDto.class, id);
		
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();
			if(s!=null) {
			return true;
			}
			else {
				return false;
			}
	}
	
	public void updateStudent(int id,String name) {
		StudentDto s=	entityManager.find(StudentDto.class, id);
		
		s.setName(name);
		if(s!=null) {
			entityTransaction.begin();
			entityManager.merge(s);
			entityTransaction.commit();
		}	
	}
	
	public StudentDto getOneStudentData(int id) {
		StudentDto studentDto=	entityManager.find(StudentDto.class, id);
		
		System.out.println(studentDto.getId());	
		System.out.println(studentDto.getName());	
		System.out.println(studentDto.getEmail());
		return studentDto;	
	
	}
	
	public List<StudentDto> getAllData(StudentDto studentDto){
		String sql="SELECT s FROM StudentDto s";
		Query query=entityManager.createQuery(sql);
		List<StudentDto> studentDtos= query.getResultList();
		
		for(StudentDto s: studentDtos) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println("=================================");
		}
		return studentDtos;
		
	}
	

}

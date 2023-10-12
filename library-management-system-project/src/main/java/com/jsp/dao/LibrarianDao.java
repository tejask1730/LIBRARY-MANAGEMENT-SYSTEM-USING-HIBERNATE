package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.dto.BookDto;
import com.jsp.dto.LibrarianDto;
import com.jsp.service.BookService;

public class LibrarianDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tejas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// insert/save Librarian data
	public LibrarianDto saveLibrarianData(LibrarianDto librarianDto) {
		librarianDto.getId();
		librarianDto.getName();
		librarianDto.getStatus();

		entityTransaction.begin();
		entityManager.persist(librarianDto);
		entityTransaction.commit();
		return librarianDto;
	}

	// getById for validation
	public LibrarianDto getLibrarianById(int id) {
		return entityManager.find(LibrarianDto.class, id);
	}

	// delete/remove Librarian data
	public boolean deleteById(int id) {
		LibrarianDto l = entityManager.find(LibrarianDto.class, id);

		if (l != null) {
			entityTransaction.begin();
			entityManager.remove(l);
			entityTransaction.commit();
		}
		return false;
	}

	// update name in Librarian data
	public boolean updateByIdName(int id, String name) {
		LibrarianDto l = entityManager.find(LibrarianDto.class, id);

		l.setName(name);

		if (l != null) {
			entityTransaction.begin();
			entityManager.merge(l);
			entityTransaction.commit();
		}
		return false;
	}

	// update Status in Librarian data
	public boolean updateByIdStatus(int id, String status) {
		LibrarianDto l = entityManager.find(LibrarianDto.class, id);

		l.setStatus(status);

		if (l != null) {
			entityTransaction.begin();
			entityManager.merge(l);
			entityTransaction.commit();
		}
		return false;
	}

	// get one Librarian data by id
	public LibrarianDto getOneData(int id) {
		LibrarianDto librarianDto = entityManager.find(LibrarianDto.class, id);

		System.out.println(librarianDto.getId());
		System.out.println(librarianDto.getName());
		System.out.println(librarianDto.getStatus());
		return librarianDto;
	}

	// get all Librarian data
	public List<LibrarianDto> getAllData() {
		String sql = "SELECT a FROM LibrarianDto a";
		Query query = entityManager.createQuery(sql);
		List<LibrarianDto> librarianDto = query.getResultList();

		for (LibrarianDto l : librarianDto) {
			System.out.println(l.getId());
			System.out.println(l.getName());
			System.out.println(l.getStatus());
			System.out.println("====================================");
		}
		return librarianDto;

	}

	// Librarian approved by admin
	public LibrarianDto approve(LibrarianDto librarianDto) {
		entityTransaction.begin();
		entityManager.merge(librarianDto);
		entityTransaction.commit();
		return librarianDto;
	}
	
	//get all unapproved librarian data 
	public List<LibrarianDto> getAllUnapprovedLibrarian() {
		String sql = "SELECT a FROM LibrarianDto a";
		Query query = entityManager.createQuery(sql);
		List<LibrarianDto> librarianDto = query.getResultList();

		return librarianDto;

	}

}

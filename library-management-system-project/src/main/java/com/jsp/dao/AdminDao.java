package com.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.AdminDto;
import com.jsp.dto.LibrarianDto;
import com.jsp.service.LibrarianService;

public class AdminDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tejas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// insert/save Admin data
	public AdminDto saveAdminData(AdminDto adminDto) {
		entityTransaction.begin();
		entityManager.persist(adminDto);
		entityTransaction.commit();
		return adminDto;

	}

	// delete/remove Admin data
	public boolean deleteById(int id) {
		AdminDto a = entityManager.find(AdminDto.class, id);

		if (a != null) {
			entityTransaction.begin();
			entityManager.remove(a);
			entityTransaction.commit();
		}
		return false;
	}

	// update username in Admin data
	public boolean updateById(int id, String username) {
		AdminDto a = entityManager.find(AdminDto.class, id);

		a.setUsername(username);

		if (a != null) {
			entityTransaction.begin();
			entityManager.merge(a);
			entityTransaction.commit();
		}
		return false;
	}

	// update password in Admin data
	public boolean updateByIdPassword(int id, String password) {
		AdminDto a = entityManager.find(AdminDto.class, id);

		a.setPasssword(password);

		if (a != null) {
			entityTransaction.begin();
			entityManager.merge(a);
			entityTransaction.commit();
		}
		return false;
	}

	// getById for validation

	public AdminDto getAdminById(int id) {
		return entityManager.find(AdminDto.class, id);
	}

	// get one Admin data by id
	public void getOneData(int id) {
		AdminDto adminDto = entityManager.find(AdminDto.class, id);

		System.out.println(adminDto.getId());
		System.out.println(adminDto.getUsername());
		System.out.println(adminDto.getPasssword());
	}

	// get all Admin data
	public List<AdminDto> getAllData(AdminDto adminDto) {
		String sql = "SELECT a FROM AdminDto a";
		Query query = entityManager.createQuery(sql);
		List<AdminDto> adminDtos = query.getResultList();

		for (AdminDto a : adminDtos) {
			System.out.println(a.getId());
			System.out.println(a.getUsername());
			System.out.println(a.getPasssword());
			System.out.println("====================================");
		}
		return adminDtos;

	}

	// get All librarian data in Admin which is UnAuthorized
	LibrarianDao librarianDao = new LibrarianDao();

	public void getLibrarianData(LibrarianDto librarianDto) {
		librarianDao.getAllData();
	}

	// update/set the Unauthorized Librarian to Authorized Librarian By Admin
	public boolean updateStatusById(int id, String status) { // approve status
		LibrarianDto l = entityManager.find(LibrarianDto.class, id);

		l.setStatus(status);

		if (l != null) {
			entityTransaction.begin();
			entityManager.merge(l);
			entityTransaction.commit();
		}
		return false;
	}

	// update/set the Authorized Librarian to UnAuthorized Librarian By Admin
	public boolean unapprovedStatusById(int id, String status) { // Unapprove status
		LibrarianDto l = entityManager.find(LibrarianDto.class, id);

		l.setStatus(status);

		if (l != null) {
			entityTransaction.begin();
			entityManager.merge(l);
			entityTransaction.commit();
		}
		return false;
	}

	// Check status change by which admin
//	public LibrarianDto checkStatus(int id) {
//		return entityManager.find(LibrarianDto.class, id);
//	}

}

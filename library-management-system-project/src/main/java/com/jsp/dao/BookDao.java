package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.BookDto;


public class BookDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("tejas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public BookDto savebookData(BookDto bookDto) {
		entityTransaction.begin();
		entityManager.persist(bookDto);
		entityTransaction.commit();
		return bookDto;
	}
	
	public boolean deletebookById(int id) {
	BookDto b=	entityManager.find(BookDto.class, id);
		
			entityTransaction.begin();
			entityManager.remove(b);
			entityTransaction.commit();
			if(b!=null) {
			return true;
			}
			else {
				return false;
			}
	}
	
	public void updatebook(int id,String title) {
		BookDto b=	entityManager.find(BookDto.class, id);
		
		b.setTitle(title);
		if(b!=null) {
			entityTransaction.begin();
			entityManager.merge(b);
			entityTransaction.commit();
		}	
	}
	
	public BookDto getOnebookData(int id) {
		BookDto bookDto=	entityManager.find(BookDto.class, id);
		
		System.out.println(bookDto.getId());	
		System.out.println(bookDto.getTitle());	
		System.out.println(bookDto.getAuthor_name());
		return bookDto;	
	
	}
	
	public List<BookDto> getAllData(BookDto bookDto){
		String sql="SELECT b FROM BookDto b";
		Query query=entityManager.createQuery(sql);
		List<BookDto> bookDtos= query.getResultList();
		
		for(BookDto b: bookDtos) {
			System.out.println(b.getId());
			System.out.println(b.getTitle());
			System.out.println(b.getAuthor_name());
			System.out.println("=================================");
		}
		return bookDtos;
	}
	
	////////////
	
	
	//Book issued by Librarian
	public boolean issueBook(BookDto bookDto) {
		entityTransaction.begin();
		entityManager.merge(bookDto);
		entityTransaction.commit();
		return true;

	}

	//Book return to the Librarian
	public boolean returnBook(BookDto bookDto) {
		entityTransaction.begin();
		entityManager.merge(bookDto);
		entityTransaction.commit();
		return true;
	}
	
	//Book request by Student to Librarian
	public boolean requsetBook(BookDto bookDto) {
		entityTransaction.begin();
		entityManager.merge(bookDto);
		entityTransaction.commit();
		return true;

	}
	
}

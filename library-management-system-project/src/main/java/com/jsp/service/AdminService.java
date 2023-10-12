package com.jsp.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.AdminDao;
import com.jsp.dao.LibrarianDao;
import com.jsp.dto.AdminDto;
import com.jsp.dto.LibrarianDto;


public class AdminService {
	AdminDao adminDao=new AdminDao();  //create object of Dao class
	
	//insert/save Admin data
	public AdminDto saveAdminData(AdminDto adminDto) {
		
		return adminDao.saveAdminData(adminDto);
		
	}

	//login validation condition
	public boolean validateAdmin(int id,String username,String pwd) {
	AdminDto a	=adminDao.getAdminById(id);
		if(a!=null && a.getUsername().equalsIgnoreCase(username) && a.getPasssword().equals(pwd)) {	//IT checks condition 
			return true;
		}else {
			return false;
		}
	}
	
	
	// delete/remove Admin data
	public boolean deleteById(int id) {
		return adminDao.deleteById(id);
	}
	
	
	//update username in Admin data
	public boolean updateById(int id,String username) {
		return adminDao.updateById(id, username);
	}
	
	
	//update password in Admin data
	public boolean updateByIdPassword(int id,String password) {
		return adminDao.updateByIdPassword(id, password);
	}
	
	
	//get one Admin data by id
	public void getOneData(int id) {
		adminDao.getOneData(id);
	}
	
	//get all Admin data 
	public List<AdminDto> getAllData(AdminDto adminDto) {
		return adminDao.getAllData(adminDto);
	}
	
	
	// get All librarian data in Admin which is UnAuthorized
	public void getLibrarianData(LibrarianDto librarianDto) {
		adminDao.getLibrarianData(librarianDto);
	}
	
	
	
	
	LibrarianDao librarianDao=new LibrarianDao();
	// update/set the Unauthorized Librarian to Authorized Librarian By Admin
	public LibrarianDto updateStatusById(int libid,int admin_id) {	//approve status of librarian to aaproved
		AdminDto adminDto=adminDao.getAdminById(admin_id);
		LibrarianDto librarianDto =librarianDao.getLibrarianById(libid);
		if(adminDto!=null && librarianDto!=null) {
			librarianDto.setStatus("Approved");
			librarianDto.setAdminDto(adminDto);
		}
		return librarianDao.approve(librarianDto);
		
		
	}
	
	//unapproved status
	public LibrarianDto unapprovedStatusById(int libid,int admin_id) {	//unapproved status
		AdminDto adminDto=adminDao.getAdminById(admin_id);
		LibrarianDto librarianDto =librarianDao.getLibrarianById(libid);
		if(adminDto!=null && librarianDto!=null) {
			librarianDto.setStatus("UnApproved");
			librarianDto.setAdminDto(adminDto);
		}
		return librarianDao.approve(librarianDto);
	}
	
	
	
	//get all list of unapproved librarian by admin
	public void getAllUnapproveLibrarian(){
		LibrarianDao librarianDao=new LibrarianDao();
		List<LibrarianDto> l=	librarianDao.getAllUnapprovedLibrarian();
		for(LibrarianDto librarianDto: l) {
			if(librarianDto.getStatus().equals("UnApproved")) {
			System.out.println(librarianDto.getId());	
			System.out.println(librarianDto.getName());	
			System.out.println(librarianDto.getStatus());
			System.out.println("=================================");
				
			}
		
		
		}
		
	}
}

	
	
	
	


package com.jsp.dto;

//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;

@Entity
public class AdminDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String passsword;
	

	//private LibrarianDto librarianDtos;
	
	//getter & setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
//	public LibrarianDto getLibrarianDtos() {
//		return librarianDtos;
//	}
//	public void setLibrarianDtos(LibrarianDto librarianDtos) {
//		this.librarianDtos = librarianDtos;
//	}
//	
	

}

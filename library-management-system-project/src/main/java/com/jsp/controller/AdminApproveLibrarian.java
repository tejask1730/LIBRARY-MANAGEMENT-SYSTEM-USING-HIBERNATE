package com.jsp.controller;


import com.jsp.service.AdminService;

public class AdminApproveLibrarian {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
		 adminService.updateStatusById(1,3); 	//lib,admin id
		
	}

}

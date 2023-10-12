package com.jsp.controller;

import com.jsp.service.AdminService;

public class AdminUnapprovedLibrarian {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
		adminService.unapprovedStatusById(1, 1);
	}

}
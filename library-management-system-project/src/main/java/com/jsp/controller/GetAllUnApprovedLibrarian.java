package com.jsp.controller;

import com.jsp.service.AdminService;

public class GetAllUnApprovedLibrarian {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
		adminService.getAllUnapproveLibrarian();
	}

}

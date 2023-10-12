package com.jsp.controller;

import com.jsp.service.AdminService;

public class AdminUpdatePasswordController {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
		adminService.updateByIdPassword(5, "35467");
	}

}

package com.jsp.controller;

import com.jsp.service.AdminService;

public class AdminLoginController {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
		boolean res= adminService.validateAdmin(1, "Tushar", "1234");
		System.out.println(res);
	}

}

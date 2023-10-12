package com.jsp.controller;

import com.jsp.service.AdminService;

public class AdminUpdateController {

	public static void main(String[] args) {
		AdminService adminService=new AdminService();
		adminService.updateById(5, "viraj");

	}

}


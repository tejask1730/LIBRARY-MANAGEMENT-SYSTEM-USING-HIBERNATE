package com.jsp.controller;

import com.jsp.dto.AdminDto;
import com.jsp.service.AdminService;

public class AdminGetAllDataController {

	public static void main(String[] args) {
		AdminDto adminDto=new AdminDto();
		AdminService adminService=new AdminService();
		adminService.getAllData(adminDto);

	}

}

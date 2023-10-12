package com.jsp.controller;

import com.jsp.dto.AdminDto;
import com.jsp.service.AdminService;

public class AdminSaveController {

	public static void main(String[] args) {

		AdminDto adminDto = new AdminDto();
		adminDto.setUsername("naik");
		adminDto.setPasssword("9083");

		AdminService adminService = new AdminService();

		adminService.saveAdminData(adminDto);

	}
}

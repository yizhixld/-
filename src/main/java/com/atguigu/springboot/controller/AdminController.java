package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.sercice.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@ResponseBody
	@RequestMapping("/getAdmin/{id}")
	public TAdmin getAdmin(@PathVariable("id") Integer id) {
		return adminService.getAdminById(id);
	}
	
	
}

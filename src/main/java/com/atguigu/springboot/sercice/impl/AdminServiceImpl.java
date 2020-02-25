package com.atguigu.springboot.sercice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.mapper.AdminMapper;
import com.atguigu.springboot.sercice.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;
	
	
	@Override
	public TAdmin getAdminById(Integer id) {
		TAdmin admin = adminMapper.getAdminById(id);
		return admin;
	}

}

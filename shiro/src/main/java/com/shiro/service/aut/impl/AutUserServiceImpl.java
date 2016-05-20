package com.shiro.service.aut.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiro.dao.aut.AutUserMapper;
import com.shiro.mode.User;
import com.shiro.service.aut.AutUserService;

@Service("autUserService")
public class AutUserServiceImpl implements AutUserService {
	
    @Autowired
	private AutUserMapper autUserMapper;

	@Override
	public User findUserByAccount(String account, String password) {
		return autUserMapper.findUserByAccount(account, password);
	}
	

}

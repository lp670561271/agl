package com.shiro.service.aut;

import com.shiro.mode.User;

public interface AutUserService {
	public User findUserByAccount(String account,String password);
}

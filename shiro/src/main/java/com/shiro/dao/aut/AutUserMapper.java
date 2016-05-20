package com.shiro.dao.aut;

import org.apache.ibatis.annotations.Param;

import com.shiro.mode.User;

public interface AutUserMapper {
	
	public User findUserByAccount(@Param("account")String account,@Param("password")String password);
}
 
package com.shiro.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shiro.service.aut.AutUserService;

@Controller
public class ShiroController {
	
	@Autowired
	private AutUserService autUserService;
	
	@RequestMapping(value = { "/", "/index" })
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response, Model model) throws Exception {
		System.out.println("进入shiroweb中");
		autUserService.findUserByAccount("zhangsan", "abcd");
		return null;
	}
	
}

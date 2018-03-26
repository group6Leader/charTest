package net.javavideotutorials.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.javavideotutorials.dao.UsersDAO;
import net.javavideotutorials.vo.Users;

@Controller
public class LoginController
{
	
	@Autowired
	UsersDAO dao;
	
	@RequestMapping(value="/loginPage", method=RequestMethod.GET)
	public String loginPage (ModelMap model)
	{
		
		System.out.println("loginPage");
	
		return "loginPage";
	}
	
	/*@RequestMapping(value="/loginPage", method=RequestMethod.POST)
	public String loginPage (Users u) {
	
		System.out.println("loginResult");
		System.out.println(u);
	
		return "loginPage";
	}*/
}

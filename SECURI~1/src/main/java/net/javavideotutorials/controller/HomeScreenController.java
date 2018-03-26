package net.javavideotutorials.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/app")
@Controller
public class HomeScreenController
{
  
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String homeScreen (ModelMap model, Principal principal)
	{
		
		System.out.println("home");
		model.put("principal", principal);
		return "/app/home";
	}
}

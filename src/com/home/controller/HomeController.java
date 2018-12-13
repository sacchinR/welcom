package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String goHome(Model theModel) {
		theModel.addAttribute("message","Welcome to Spring");
		return "home";	
	}
}

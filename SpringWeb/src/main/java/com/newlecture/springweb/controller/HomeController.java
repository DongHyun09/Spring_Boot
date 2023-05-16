package com.newlecture.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	

	@RequestMapping("/index")
	public String index() {
		
		return "home.index";
	}
	
	@RequestMapping("/help")
	public String aaa() {
		return "home.help";
	}
}

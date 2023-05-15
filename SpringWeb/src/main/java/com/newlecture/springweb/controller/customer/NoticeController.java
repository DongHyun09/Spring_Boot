package com.newlecture.springweb.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {

	@GetMapping("list")//list,detail,edit,reg,del
	public String list(Model model) {
		
		model.addAttribute("test", "Hello~! Devtools");

		return "customer/notice/list";
	}
	
	@RequestMapping("detail")//list,detail,edit,reg,del
	public String detail() {
		return "/customer/notice/detail";
	}
}

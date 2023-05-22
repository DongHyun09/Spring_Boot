package com.newlecture.springweb.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.springweb.entity.NoticeView;
import com.newlecture.springweb.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;	
	
	@GetMapping("list")//list,detail,edit,reg,del
	public String list(Model model) {
		
		int page = 1;
		String field = "title";
		String query = "";
		
		List<NoticeView> list = service.getList(page,field,query);
		
		model.addAttribute("list", list);

		return "customer.notice.list";
	}
	
	@RequestMapping("detail")//list,detail,edit,reg,del
	public String detail() {
		return "customer.notice.detail";
	}
}

package com.kdh.web.controller.people;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kdh.web.entity.PeopleInfo;
import com.kdh.web.service.PeopleService;

@Controller
@RequestMapping("/peop/all/")
public class PeopController {
	
	@Autowired
	private PeopleService service;
	
	@GetMapping("list")
	public String list(Model model) {
		
		List<PeopleInfo> list = service.getPeopList();
		model.addAttribute("List" , list);
		return "peop.all.list";
	}
}

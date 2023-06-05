package com.kdh.web.controller.people;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kdh.web.entity.PeopleInfo;
import com.kdh.web.service.PeopleService;

@Controller
@RequestMapping("/peop/all/")
public class PeopController {
	
	@Autowired
	private PeopleService service;
	
	private void detailupdate(int num, Model model) {
		  PeopleInfo people = service.getNumPeop(num);
		   model.addAttribute("People", people);
	}

	@GetMapping("list")
	public String list(Model model) {
		
		List<PeopleInfo> list = service.getPeopList();
		model.addAttribute("List" , list);
		return "peop.all.list";
	}
	@GetMapping("add")
	public String add(Model model) {
		 int num = service.getMaxNum();
		 model.addAttribute("NUM", num);
		return "peop.all.add";
	}
	@PostMapping("add")
	public String add2(@ModelAttribute PeopleInfo pe){
		service.putAllPeop(pe);
		return "redirect:list";
	}

	@GetMapping("detail")
	public String detail(@RequestParam("num") int num, Model model) {
			detailupdate(num,model);
	    return "peop.all.detail";
	}
	@GetMapping("update")
	public String update(@RequestParam("num") int num, Model model) {
			detailupdate(num,model);
		return "peop.all.update";
	}
	@PostMapping("update")
	public String update(@ModelAttribute PeopleInfo p) {
		service.updatePeop(p);
		return "redirect:list";
	}
	@GetMapping("delete")
	public String delete(@RequestParam("num") int num) {
	    service.deletePeop(num);
	    return "redirect:list";
	}
}

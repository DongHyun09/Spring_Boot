package com.kdh.web.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user/acc/")
public class UserController {
	
	@GetMapping("join")
	public String joinForm() {
		return "user.acc.joinForm";
	}
	@PostMapping("join")
	public String joingForm2() {
		return "user.acc.joinForm";
	}
}

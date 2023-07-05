package com.kdh.web.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/user/acc/join")
	public String joinForm() {
		return "user.acc.joinForm";
	}
}

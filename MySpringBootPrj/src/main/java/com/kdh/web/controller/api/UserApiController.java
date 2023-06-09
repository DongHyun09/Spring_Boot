package com.kdh.web.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kdh.web.dto.ResponseDto;
import com.kdh.web.entity.User;

@RestController
public class UserApiController {
	
	@PostMapping("/api/user")
	public ResponseDto<Integer> save(@RequestBody User user) {
		System.out.println("UserApiController : save 호출 됨");
		//실제로 DB에 insert를 하고 아래에서 return이 되면 된다.
		return new ResponseDto<Integer>(HttpStatus.OK, 1);
	}
}

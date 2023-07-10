package com.kdh.web.service;

import org.springframework.stereotype.Service;

import com.kdh.web.entity.User;

@Service
public interface UserService {
	int getUser(User user);
}

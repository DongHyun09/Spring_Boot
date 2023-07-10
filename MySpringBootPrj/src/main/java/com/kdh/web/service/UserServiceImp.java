package com.kdh.web.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.kdh.web.dao.UserDao;
import com.kdh.web.entity.User;

public class UserServiceImp implements UserService {

	   private final UserDao userdao;

	    @Autowired
	    public UserServiceImp(UserDao userdao) {
	        this.userdao = userdao;
	    }
	
	
	@Override
	public int getUser(User user) {
		return userdao.getUser(user);
	}

}

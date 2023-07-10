package com.kdh.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.kdh.web.entity.User;

@Mapper
public interface UserDao {
	int getUser(User user);
}

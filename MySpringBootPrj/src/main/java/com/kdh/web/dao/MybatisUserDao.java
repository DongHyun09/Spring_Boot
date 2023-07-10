package com.kdh.web.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kdh.web.entity.User;

@Repository
public class MybatisUserDao implements UserDao {
	
	private UserDao mapper;
	
	@Autowired
	public MybatisUserDao (SqlSession sqlSession) {
		mapper = sqlSession.getMapper(UserDao.class);
	}
	
	@Override
	public int getUser(User user) {
		
		return mapper.getUser(user);
	}

}

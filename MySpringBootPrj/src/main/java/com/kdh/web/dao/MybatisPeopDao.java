package com.kdh.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kdh.web.entity.PeopleInfo;

@Repository
public class MybatisPeopDao implements PeopDao {
	
	private PeopDao mapper;
	
	@Autowired
	public MybatisPeopDao (SqlSession sqlSession) {
		
	}
	
	@Override
	public List<PeopleInfo> getPeopList() {
		// TODO Auto-generated method stub
		return mapper.getPeopList();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mapper.getCount();
	}

	@Override
	public PeopleInfo getInfo(int num) {
		// TODO Auto-generated method stub
		return null;
	}

}

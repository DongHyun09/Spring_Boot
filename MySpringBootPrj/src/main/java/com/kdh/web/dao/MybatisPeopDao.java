package com.kdh.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.kdh.web.entity.PeopleInfo;

@Primary
@Repository
public class MybatisPeopDao implements PeopDao {
	
	private PeopDao mapper;
	
	@Autowired
	public MybatisPeopDao (SqlSession sqlSession) {
		mapper = sqlSession.getMapper(PeopDao.class);
	}
	
	@Override
	public List<PeopleInfo> getPeopList() {
		// TODO Auto-generated method stub
		return mapper.getPeopList();
	}

	@Override
	public int putAllPeop(PeopleInfo peopleinfo) {
		// TODO Auto-generated method stub
		return mapper.putAllPeop(peopleinfo);
	}

	@Override
	public int getMaxNum() {
		// TODO Auto-generated method stub
		return mapper.getMaxNum();
	}

	@Override
	public PeopleInfo getNumPeop(int num) {
		// TODO Auto-generated method stub
		return mapper.getNumPeop(num);
	}

	@Override
	public int updatePeop(PeopleInfo p) {
		// TODO Auto-generated method stub
		return mapper.updatePeop(p);
	}

	@Override
	public int deletePeop(int num) {
		// TODO Auto-generated method stub
		return mapper.deletePeop(num);
	}

}

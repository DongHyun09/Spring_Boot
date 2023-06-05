package com.kdh.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kdh.web.entity.PeopleInfo;

@Mapper
public interface PeopDao {
	
	List<PeopleInfo> getPeopList();
	int putAllPeop(PeopleInfo peopleinfo);
	int getMaxNum();
	PeopleInfo getNumPeop(int num);
	int updatePeop(PeopleInfo p);
	int deletePeop(int num);
	
}

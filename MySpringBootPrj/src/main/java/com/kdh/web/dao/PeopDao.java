package com.kdh.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kdh.web.entity.PeopleInfo;

@Mapper
public interface PeopDao {
	
	List<PeopleInfo> getPeopList();
//	int getCount();
//	PeopleInfo getInfo(int num);
}
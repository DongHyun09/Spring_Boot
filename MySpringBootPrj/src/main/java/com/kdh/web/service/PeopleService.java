package com.kdh.web.service;

import java.util.List;

import com.kdh.web.entity.PeopleInfo;

public interface PeopleService {
	
	//목록 요청
	List<PeopleInfo> getPeopList();
	int getCount();
}

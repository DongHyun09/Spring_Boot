package com.newlecture.springweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.newlecture.springweb.dao.NoticeDao;
import com.newlecture.springweb.entity.Notice;

public class NoticeServiceImp implements NoticeService{

	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<Notice> getList() {
		
		List<Notice> list = noticeDao.getList();
		
		return list;
	}

	@Override
	public Notice get(int id) {
		
		Notice notice = noticeDao.get(id);
		
		return notice;
	}

}

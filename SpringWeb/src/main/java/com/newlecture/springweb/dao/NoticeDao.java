package com.newlecture.springweb.dao;

import java.util.List;

import com.newlecture.springweb.entity.Notice;

public interface NoticeDao {

	List<Notice> getList();

	Notice get(int id);

}

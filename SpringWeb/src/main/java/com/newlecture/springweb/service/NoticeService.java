package com.newlecture.springweb.service;

import java.util.List;

import com.newlecture.springweb.entity.Notice;

public interface NoticeService {

	List<Notice> getList();

	Notice get(int id);

}

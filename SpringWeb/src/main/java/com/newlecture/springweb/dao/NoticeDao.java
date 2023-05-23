package com.newlecture.springweb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newlecture.springweb.entity.Notice;
import com.newlecture.springweb.entity.NoticeView;

@Mapper
public interface NoticeDao { 
		

	List<NoticeView> getViewList(int offset, int size, String field, String query);
	int getCount(String field, String query);	
	NoticeView getView(int id);
	
	
	Notice getNext(int id);
	Notice getPrev(int id);
	

	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);
	
	
//	int updatePubAll(int[] pubIds, int[] closeIds);
	int updatePubAll(int[] ids, boolean pub);
	int deleteAll(int[] ids);
}

package com.newlecture.springweb.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.springweb.dao.NoticeDao;
import com.newlecture.springweb.entity.Notice;
import com.newlecture.springweb.entity.NoticeView;


@Repository
public class MybatisNoticeDao implements NoticeDao{
	
	private NoticeDao mapper;
	
	@Autowired
	public MybatisNoticeDao(SqlSession sqlSessionl) {
		
	}
	
	@Override
	public List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub) {
		
		return mapper.getViewList(offset, size, field, query, pub);
	}

	@Override
	public int getCount(String field, String query) {
	
		return mapper.getCount(field, query);
	}

	@Override
	public NoticeView getView(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice getNext(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice getPrev(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePubAll(int[] ids, boolean pub) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll(int[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}

}
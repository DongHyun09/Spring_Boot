package com.newlecture.springweb.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.newlecture.springweb.dao.NoticeDao;
import com.newlecture.springweb.entity.Notice;
import com.newlecture.springweb.entity.NoticeView;


@Repository
public class MybatisNoticeDao implements NoticeDao{
	
	
	private SqlSession sqlSession;
	
	@Override
	public List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub) {
		NoticeDao noticeDao= sqlSession.getMapper(NoticeDao.class);
		return noticeDao.getViewList(offset, size, field, query, pub);
	}

	@Override
	public int getCount(String field, String query) {
		// TODO Auto-generated method stub
		return 0;
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
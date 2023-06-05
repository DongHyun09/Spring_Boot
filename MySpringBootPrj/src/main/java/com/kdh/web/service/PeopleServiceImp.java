package com.kdh.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdh.web.dao.PeopDao;
import com.kdh.web.entity.PeopleInfo;

@Service
public class PeopleServiceImp implements PeopleService{

	   private final PeopDao peopdao;

	    @Autowired
	    public PeopleServiceImp(PeopDao peopdao) {
	        this.peopdao = peopdao;
	    }
	
	@Override
	public List<PeopleInfo> getPeopList() {
		// TODO Auto-generated method stub
		return peopdao.getPeopList();
	}

	@Override
	public int putAllPeop(PeopleInfo peopleinfo) {
		// TODO Auto-generated method stub
		return peopdao.putAllPeop(peopleinfo);
	}

	@Override
	public int getMaxNum() {
		int num = peopdao.getMaxNum() + 1;
		return num;
	}

	@Override
	public PeopleInfo getNumPeop(int num) {
		// TODO Auto-generated method stub
		return peopdao.getNumPeop(num);
	}

	@Override
	public int updatePeop(PeopleInfo p) {
		// TODO Auto-generated method stub
		return peopdao.updatePeop(p);
	}

	@Override
	public int deletePeop(int num) {
		// TODO Auto-generated method stub
		return peopdao.deletePeop(num);
	}

}

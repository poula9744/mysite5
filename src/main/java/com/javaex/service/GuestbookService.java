package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;

@Service
public class GuestbookService {
	
	@Autowired
	private GuestbookDao guestbookDao;
	
	//등록
	public void exeInsert(GuestbookVo guestbookVo) {
		System.out.println("GuestbookService.exeInsert()");
		
		guestbookDao.guestbookInsert(guestbookVo);
	}
	
	
	//삭제
	public void exeDelete(GuestbookVo guestbookVo) {
		System.out.println("GuestbookService.exeDelete()");
		
		guestbookDao.guestbookDelete(guestbookVo);
	}
	
	//리스트
	public List<GuestbookVo> exeList(){
		System.out.println("GuestbookService.exeList()");
		
		List<GuestbookVo> guestbookList = guestbookDao.guestbookSelect();
		
		return guestbookList;
	}
	
}

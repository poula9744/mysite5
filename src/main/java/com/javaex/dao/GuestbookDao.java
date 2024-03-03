package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestbookVo;

@Repository
public class GuestbookDao {

	@Autowired
	private SqlSession sqlSession;

	// 등록
	public int guestbookInsert(GuestbookVo guestbookVo) {
		System.out.println("GusetbookDao.guestbookInsert()");

		int count = sqlSession.insert("guestbook.insert", guestbookVo);

		return count;
	}

	// 삭제
	public int guestbookDelete(GuestbookVo guestbookVo) {
		System.out.println("GuestbookDao.guestbookDelete()");

		int count = sqlSession.delete("guestbook.delete", guestbookVo);
		System.out.println(count);
		return count;
	}

	// 리스트
	public List<GuestbookVo> guestbookSelect() {
		System.out.println("GuestbookDao.guestSelect()");

		List<GuestbookVo> guestbookList = sqlSession.selectList("guestbook.select");
		System.out.println(guestbookList);

		return guestbookList;
	}

}

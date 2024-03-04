package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;
	
	//로그인
	public UserVo userSelectByIdPw(UserVo userVo) {
		System.out.println("UserDao.userSelectByIdPw()");
		
		UserVo authUser = sqlSession.selectOne("login", userVo);
		System.out.println(authUser);
		
		return authUser;
	}
	
	//회원가입
	public int userJoin(UserVo userVo) {
		System.out.println("UserDao.userJoin()");
		
		int count = sqlSession.insert("join", userVo);
		
		return count;
	}
	
	//회원 정보 수정
	public int userModify(UserVo userVo) {
		System.out.println("UserDao.userModify()");
		
		int count = sqlSession.update("user.modify", userVo);
		System.out.println(count);
		
		return count;
	}
	
}

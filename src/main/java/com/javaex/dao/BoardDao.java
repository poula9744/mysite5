package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.BoardVo;

@Repository
public class BoardDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//list
	public List<BoardVo> boardSelect(){
		System.out.println("BoardDao.boardSelect()");
		
		List<BoardVo> boardList = sqlSession.selectList("board.select");
		System.out.println(boardList);
		
		return boardList;
	}
	
	//삭제
	public int boardDelete(BoardVo boardVo) {
		System.out.println("BoardDao.boardDelete()");
		
		int count = sqlSession.delete("board.delete", boardVo);
		System.out.println(count);
		
		return count;
	}
	
	//등록
	public int boardInsert(BoardVo boardVo) {
		System.out.println("BoardDao.boardInsert()");
		
		int count = sqlSession.insert("board.insert", boardVo);
		System.out.println(count);
		
		return count;
	}
	
	//read
	public BoardVo boardSelectOne(int no) {
		System.out.println("BoardDao.boardSelect()");
		
		BoardVo boardVo = sqlSession.selectOne("board.selectOne", no);
		
		return boardVo;
	}
	
	//수정
	public int boardModify(BoardVo boardVo) {
		System.out.println("BoardDao.boardModify()");
		
		int count = sqlSession.update("board.modify", boardVo);
		System.out.println(count);
		
		return count;
	}
	
}

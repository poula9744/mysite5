package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BoardDao;
import com.javaex.vo.BoardVo;

@Service
public class BoardService {
	
	@Autowired	
	private BoardDao boardDao;
	
	//list
	public List<BoardVo> exeList(){
		System.out.println("BoardService.exeList()");
		
		List<BoardVo> boardList = boardDao.boardSelect();
		
		return boardList;
	}
	
	//삭제
	public int exeDelete(BoardVo boardVo) {
		System.out.println("BoardService.exeDelete()");
		
		int count = boardDao.boardDelete(boardVo);
		
		return count;
	}
	
	//등록
	public int exeInsert(BoardVo boardVo) {
		System.out.println("BoardService.exeDelete()");
		
		int count = boardDao.boardInsert(boardVo);
		
		return count;
	}
	
	//read
	public BoardVo exeSelectOne(int no) {
		System.out.println("BoardService.exeSelectOne()");
		
		BoardVo boardVo = boardDao.boardSelectOne(no);
		
		return boardVo;
	}
	
	//수정
	public int exeModify(BoardVo boardVo) {
		System.out.println("BoardService.exeModify()");
		
		int count = boardDao.boardModify(boardVo);
		
		return count;
	}
	
	//조회수 업데이트
	public int exeHitsUpdate(BoardVo boardVo) {
		System.out.println("BoardService.exeHitsUpdate()");
		
		int count = boardDao.boardModify(boardVo);
		
		return count;
	}
}

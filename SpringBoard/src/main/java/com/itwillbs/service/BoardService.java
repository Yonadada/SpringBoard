package com.itwillbs.service;

import java.util.List;

import com.itwillbs.domain.BoardVO;

public interface BoardService {
	
	//글쓰기 동작 
	//사용자가 실제로 사용하는 이름으로 사용하는 것이 좋다
	public void regist(BoardVO vo) throws Exception;
	
	//글 전체 목록 조회
	public List<BoardVO> listALL() throws Exception;
	
}

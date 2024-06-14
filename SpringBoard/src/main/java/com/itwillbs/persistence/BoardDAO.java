package com.itwillbs.persistence;

import java.util.List;

import com.itwillbs.domain.BoardVO;

public interface BoardDAO {
	
	//게시판 글 작성 
	public void create(BoardVO vo) throws Exception; //예외처리 위임


	//게시판 리스트(ALL)
	public List<BoardVO> listAll() throws Exception; //타입이 정해져있기 때문에 불필요한 데이터 저장 x 
	
}
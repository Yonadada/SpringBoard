package com.itwillbs.service;

import com.itwillbs.domain.BoardVO;

public interface BoardService {
	
	//글쓰기 동작 
	//사용자가 실제로 사용하는 이름으로 사용하는 것이 좋다
	public void regist(BoardVO vo) throws Exception;
	
	
}

package com.itwillbs.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.service.BoardService;


//http://localhost:8088/boar

@Controller
@RequestMapping(value = "/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	//서비스 사용하려면 서비스객체 주입해야함!!
	@Inject
	private BoardService bservice;
	
	
	//게시판 글쓰기 - GET
	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public void registGET() throws Exception{
		logger.debug("게시판 글쓰기 GET - 사용자의 정보를 입력 받는다");
		
		logger.debug("연결된 view 페이지 이동");
	}
	
	
	//게시판 글쓰기 - POST
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String registPOST(BoardVO vo) throws Exception {
		logger.debug("게시판 글쓰기 POST - 입력된 데이터 처리");
		//한글 인코딩(필터 처리)
		
		//전달정보 저장 
		logger.debug("vo" + vo);
		
		
		//서비스를 통해 -> DAO에 동작을 호출 
		bservice.regist(vo);
		
		
		//페이지 이동!!
		
		return"redirect:/board/list";
	}
	
	
}
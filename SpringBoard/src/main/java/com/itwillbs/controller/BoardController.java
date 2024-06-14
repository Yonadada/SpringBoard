package com.itwillbs.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.service.BoardService;


//http://localhost:8088/board/regist
//http://localhost:8088/board/listALL

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
	public String registPOST(BoardVO vo, RedirectAttributes rttr) throws Exception {
		logger.debug("게시판 글쓰기 POST - 입력된 데이터 처리");
		//한글 인코딩(필터 처리)
		
		//전달정보 저장 
		logger.debug("vo" + vo);
		logger.debug("vo : {}", vo); //{ }중괄호에 vo 값이 들어간다
		
		
		//서비스를 통해 -> DAO에 동작을 호출 
		bservice.regist(vo);
		
		//글쓰기 성공 정보를 전달 
		rttr.addFlashAttribute("msg", "createOk");
		
		
		//페이지 이동!!
		
		return"redirect:/board/listALL?msg=createOk";
//		return "/board/list"; 
	}
	
	// * 정보조회 동작, 사용자 정보 입력 =>GET 방식!
	// * 정보를 처리하는 동작(Update, delete, insert) => POST 방식!
	
	//게시판 글 목록 조회 - GET
//	@RequestMapping(value = "", method = RequestMethod.GET)
	@GetMapping(value = "/listALL")
	public String listALLGET(Model model) throws Exception{
		logger.debug("listALLGET()실행"); 
		
		//서비스 -> DB정보를 가져오기
		List<BoardVO> boardList = bservice.listALL();
		logger.debug("size :" + boardList.size());

		//연결된 뷰페이지로 정보 전달
		model.addAttribute("boardList", boardList);
		
	return "/board/list";
	}
	
}// Controller 
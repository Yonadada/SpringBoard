package com.itwillbs.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
   
   private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
   
   // DAO 객체를 주입
   @Inject
   private BoardDAO bdao;
   
   @Override
   public void regist(BoardVO vo) throws Exception {
      logger.debug("연결된 DAO 메서드를 호출");
      
      // DAO에서 생성한 메서드 호출
      bdao.create(vo);
      
      logger.debug(" 글쓰기 완료 ");
      
   }

   @Override
   public List<BoardVO> listALL() throws Exception {
      logger.debug(" 게시판 글목록 조회");
      
      
      return bdao.listAll();
   
   }

   @Override
   public void updateReadCnt(int bno) throws Exception {
      logger.debug("게시글 조회수 + 1");
      
      bdao.updateReadCnt(bno);
      
   }

   @Override
   public BoardVO getBoard(int bno) throws Exception {
      logger.debug("getBoard(int bno) 실행");
      
      return bdao.getBoard(bno);
   }

   @Override
   public void updateBoard(BoardVO vo) throws Exception {
      logger.debug("updateBoard(BoardVO vo) 실행");
      
      bdao.updateBoard(vo);
   }

   @Override
   public void deleteBoard(int bno) throws Exception {
      logger.debug("deleteBoard(int bno) 실행");
      
      bdao.deleteBoard(bno);
   }

   

   
   
}

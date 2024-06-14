package com.itwillbs.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.BoardVO;


@Repository 
public class BoardDAOImpl implements BoardDAO{

	private static final Logger logger = LoggerFactory.getLogger(BoardDAOImpl.class);

	//디비 연결정보를 객체 주입을 통해 사용-> root-context.xml -> sqlSession이 그 역할 (Mapper, mybatis 접근가능)
	@Inject	
	private SqlSession sqlSession;
	
	//mapper의 NAMESPACE 정보 저장 
	private static final String NAMESPACE="com.itwillbs.mapper.BoardMapper.";
	
	
	@Override
	public void create(BoardVO vo) throws Exception {
		logger.debug("연결된 mapper에 SQL 구문 실행 ");
		sqlSession.insert(NAMESPACE +"create", vo);
	}


	@Override
	public List<BoardVO> listAll() throws Exception {
		logger.debug("listAll() 실행");
		//mapper에 설정된 SQL 쿼리 구문을 실행(+디비 연결)
		
//		List<BoardVO>boardList = sqlSession.selectList(statement);
		
											// mapper의 아이디
		return sqlSession.selectList(NAMESPACE+"listALL");
	}
	
	
	
	

}

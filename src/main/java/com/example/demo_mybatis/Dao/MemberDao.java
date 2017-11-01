package com.example.demo_mybatis.Dao;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo_mybatis.Entity.Member;

@Component
public class MemberDao {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private SqlSession sqlSession;
	
	public MemberDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public Member serarchMember(String Id) {
		return sqlSession.selectOne("searchMember", Id);
	}
}

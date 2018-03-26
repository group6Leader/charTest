package net.javavideotutorials.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.javavideotutorials.mapper.UsersMapper;
import net.javavideotutorials.vo.Users;

@Repository
public class UsersDAO {

	@Autowired
	SqlSession sqlSession;
	
	public int insert(Users u) {

		int result = 0;
		try {
			UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
			result = mapper.insert(u);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public Users login(HashMap<String, String> map) {

		Users users = null;
		try {
			UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
			users = mapper.login(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}
}

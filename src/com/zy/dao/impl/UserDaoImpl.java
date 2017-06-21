package com.zy.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zy.dao.UserDao;
import com.zy.entity.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	
	
	
	@Override
	public List<User> selectUser() {
		
//		User user = new User();
//		user.setName("¡ı…Ÿ");
//		user.setPassword("666888");
//		sqlSession.insert("com.zy.entity.user.mapper.add", user);
//		sqlSession.delete("com.zy.entity.user.mapper.remove", 6);
		return getSqlSession().selectList("com.zy.entity.user.mapper.selectAll");
	}

}

package com.zy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zy.dao.UserDao;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao)context.getBean("userDao");
		System.out.println(userDao.selectUser());
	}
}

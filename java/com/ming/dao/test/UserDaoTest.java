package com.ming.dao.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ming.entity.User;
import com.ming.mapper.UserMapper;

/**
 * ����spring��junit���ϣ�junit����ʱ����springIOC���� spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// ����junit spring�����ļ�
@ContextConfiguration({ "classpath:spring-common.xml" })

public class UserDaoTest {
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void insertUserTest() {
		User user = new User();
		user.setPhoneNum("1142341");
		user.setGender(1);
		user.setAge(23);
		user.setIdentityCard("12312");
		user.setPhotoUrl("2332");
		user.setDuty("1231");
		user.setRegTime("2017-03-08");
		user.setNote("12312");
		System.out.println(user);
		userMapper.addUser(user);
		
	}

}

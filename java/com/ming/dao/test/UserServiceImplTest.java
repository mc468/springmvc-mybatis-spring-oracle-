package com.ming.dao.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ming.entity.User;
import com.ming.service.UserService;

/**
 * ����spring��junit���ϣ�junit����ʱ����springIOC���� spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// ����junit spring�����ļ�
@ContextConfiguration({ "classpath:spring-common.xml", "classpath:spring-mvc.xml" })

public class UserServiceImplTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void findAllTest() {
		User user = new User();
		userService.findAll();
		for(User users: userService.findAll()) {
			System.out.println(users);
		}
		}
	}
	



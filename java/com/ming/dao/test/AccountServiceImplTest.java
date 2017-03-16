package com.ming.dao.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ming.entity.Account;
import com.ming.service.AccountService;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-common.xml", "classpath:spring-mvc.xml" })

public class AccountServiceImplTest {
	@Autowired
	private AccountService accountService;
	
	@Test
	public void findAccountByIdTest() {
		String userId = "1";
		List<Account> list = accountService.findAccountById(userId);
		for(Account account:list) {
			System.out.println(account);
		} 
	}

}

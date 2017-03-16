package com.ming.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ming.entity.Account;
import com.ming.mapper.AccountMapper;
import com.ming.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	
	@Resource
	private AccountMapper accountMapper;
	public List<Account> findAccountById(String userId) {
		List<Account> list = accountMapper.findAccountById(userId);
		return list;
		
	}
	public void payAccount(String userAcctCode) {
		accountMapper.payAccount(userAcctCode);
	}

}

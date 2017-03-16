package com.ming.service;

import java.util.List;

import com.ming.entity.Account;

public interface AccountService {
	List<Account> findAccountById(String userId);
	void payAccount(String userAcctCode);

}

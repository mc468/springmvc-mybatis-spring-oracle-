package com.ming.mapper;

import java.util.List;

import com.ming.entity.Account;

public interface AccountMapper {
	List<Account> findAccountById(String userId);
	void payAccount(String userAcctCode);

}

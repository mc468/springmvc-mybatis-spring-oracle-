package com.ming.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ming.entity.Account;
import com.ming.service.AccountService;

@Controller
@RequestMapping("/account")

public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/findAccountById")
	public String findAccountById(HttpServletRequest request, Model model, String userId) {
		List<Account> account = accountService.findAccountById(userId);
		model.addAttribute("accountList", account);
		request.setAttribute("accountList", account);
		return "/account";
	}
	
	@RequestMapping("/payAccount")
	public String payAccount(String userAcctCode) {
		accountService.payAccount(userAcctCode);
		return "redirect:/user/findAll";
	}
	

}

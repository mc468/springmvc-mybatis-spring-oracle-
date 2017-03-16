package com.ming.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ming.entity.User;
import com.ming.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * ��ȡ�����û���
	 * @param request
	 * @return
	 */
	@RequestMapping("/findAll")
	public String findAll(HttpServletRequest request,Model model) {
		List<User> user = userService.findAll();
		model.addAttribute("userList", user);
		request.setAttribute("userList", user);
		return "/allUser";
	}
	/**
	 * ��ת������û�����
	 * @param request
	 * @return
	 */
	@RequestMapping("/toAddUser")
	public String toAddUser() {
		return "/addUser";
	}
	/**
	 * ����û�
	 */
	@RequestMapping("/addUser")
	public String addUser(User user, Model model) {
		userService.addUser(user);
		return "redirect:/user/findAll";
	}
	/**
	 * �޸��û�
	 * @param request
	 * @return
	 */
	@RequestMapping("/modifyUser")
	public String modifyUser(User user, HttpServletRequest request, Model model) {
		if(userService.modifyUser(user)) {
			user = userService.findById(user.getUserId());
			request.setAttribute("user", user);
			model.addAttribute("user", user);
			return "redirect:/user/findAll";
		}else {
			return "/error";
		}
	}
	/**
	 * ��ѯ�����û�
	 * @param userId
	 * @param request
	 * @return
	 */
	@RequestMapping("/findById")
	public String findById(HttpServletRequest request, String userId, Model model) {
		request.setAttribute("user", userService.findById(userId));
		model.addAttribute("user", userService.findById(userId));
		return "/editUser";
		
	}
	/**
	 * ɾ���û�
	 * @param userId
	 * @param request
	 * @response
	 */
	@RequestMapping("/deleteUser")
	public String deleteUser(String userId, HttpServletRequest request, HttpServletResponse response) {
		userService.deleteUser(userId);
		return "redirect:/user/findAll";
	}
}

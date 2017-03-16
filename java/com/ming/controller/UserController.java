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
	 * 获取所有用户表
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
	 * 跳转到添加用户界面
	 * @param request
	 * @return
	 */
	@RequestMapping("/toAddUser")
	public String toAddUser() {
		return "/addUser";
	}
	/**
	 * 添加用户
	 */
	@RequestMapping("/addUser")
	public String addUser(User user, Model model) {
		userService.addUser(user);
		return "redirect:/user/findAll";
	}
	/**
	 * 修改用户
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
	 * 查询单个用户
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
	 * 删除用户
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

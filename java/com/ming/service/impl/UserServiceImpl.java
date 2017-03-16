package com.ming.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ming.entity.User;
import com.ming.mapper.UserMapper;
import com.ming.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	/**
	 * 根据id删除数据
	 */
	public boolean deleteUser(String userId) {
		return userMapper.deleteUser(userId);
	}
	/**
	 * 查询User的全部数据
	 */
	public List<User> findAll() {
		return userMapper.findAll();
	}
	/**
	 * 根据id查询对应数据
	 */
	public User findById(String userId) {
		return userMapper.findById(userId);
	}
	/**
	 * 新增数据
	 */
	public void addUser(User user) {
		userMapper.addUser(user);
	}
	/**
	 * 根据id修改数据
	 */
	public boolean modifyUser(User user) {
		return userMapper.modifyUser(user);
	}

}

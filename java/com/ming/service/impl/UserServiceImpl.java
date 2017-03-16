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
	 * ����idɾ������
	 */
	public boolean deleteUser(String userId) {
		return userMapper.deleteUser(userId);
	}
	/**
	 * ��ѯUser��ȫ������
	 */
	public List<User> findAll() {
		return userMapper.findAll();
	}
	/**
	 * ����id��ѯ��Ӧ����
	 */
	public User findById(String userId) {
		return userMapper.findById(userId);
	}
	/**
	 * ��������
	 */
	public void addUser(User user) {
		userMapper.addUser(user);
	}
	/**
	 * ����id�޸�����
	 */
	public boolean modifyUser(User user) {
		return userMapper.modifyUser(user);
	}

}

package com.ming.service;

import java.util.List;

import com.ming.entity.User;

public interface UserService {
	void addUser(User user);
	List<User> findAll();
	User findById(String userId);
	boolean modifyUser(User user);
	boolean deleteUser(String userId);

}

package com.ming.mapper;

import java.util.List;

import com.ming.entity.User;
/** 
* 做为 DAO的接口 
* @author 
*/  
public interface UserMapper {
	void addUser(User user);
	List<User> findAll();
	User findById(String userId);
	boolean modifyUser(User user);
	boolean deleteUser(String userId);

}

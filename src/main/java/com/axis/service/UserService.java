package com.axis.service;

import com.axis.entity.User;

public interface UserService {
	 public User getUserById(int userId);

	public User getUserByUserName(String userName);

	public boolean updateByUser(User user)  throws Exception;

	public boolean signUp(User user); 
}

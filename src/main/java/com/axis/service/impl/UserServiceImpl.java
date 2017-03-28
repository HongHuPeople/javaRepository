package com.axis.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.axis.dao.UserDao;
import com.axis.entity.User;
import com.axis.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
    private UserDao userDao;
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId); 
	}
	@Override
	public User getUserByUserName(String userName) {
		return userDao.selectEntity("selectUserByUserName", userName);
	}
}

package com.axis.service.impl;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.axis.dao.UserDao;
import com.axis.dao.UserLoginRecordDao;
import com.axis.entity.User;
import com.axis.entity.UserLoginRecord;
import com.axis.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
    private UserDao userDao;
	@Autowired
	private UserLoginRecordDao userLoginRecordDao;
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId); 
	}
	@Override
	public User getUserByUserName(String userName) {
		return userDao.selectEntity("selectUserByUserName", userName);
	}
	@Override
	public boolean updateByUser(User user) throws Exception{
		UserLoginRecord userLoginRecord = new UserLoginRecord();
		userLoginRecord.setUserId(user.getId());
		userLoginRecord.setLoginDate(user.getLastLoginDate());
		userLoginRecord.setLoginIp(user.getLastLoginIp());
		if(userLoginRecordDao.insertSelective(userLoginRecord) && userDao.updateByPrimaryKeySelective(user)){
			return true;
		}else{
			throw new RuntimeException("登录信息记录失败");
		}
	}
}

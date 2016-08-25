package com.axis.dao.impl;

import org.springframework.stereotype.Repository;

import com.axis.base.BaseDaoImpl;
import com.axis.dao.UserDao;
import com.axis.entity.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

}

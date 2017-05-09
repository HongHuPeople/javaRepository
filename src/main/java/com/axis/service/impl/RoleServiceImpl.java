package com.axis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.axis.dao.RoleDao;
import com.axis.entity.Role;
import com.axis.entity.User;
import com.axis.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleDao roleDao;

	@Override
	public List<Role> selectRoleByUserId(Integer userId) {
		return roleDao.select("selectByUserId", userId);
	}

	@Override
	public boolean createRole(Role role) {
		List<Role> roles = roleDao.select("validateRole", role);
		if(roles == null || roles.isEmpty()){
			return false;
		}
		return roleDao.insertSelective(role);
	}

	@Override
	public Role selectRoleById(Integer id) {
		return roleDao.selectByPrimaryKey(id);
	}
	
}

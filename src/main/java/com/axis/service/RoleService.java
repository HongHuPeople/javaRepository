package com.axis.service;

import java.util.List;

import com.axis.entity.Role;

public interface RoleService {

	List<Role> selectRoleByUserId(Integer id);

	boolean createRole(Role role);

}

package com.axis.service;

import java.util.List;
import java.util.Map;

import com.axis.entity.Backpack;
import com.axis.utils.PageModel;

public interface BackpackService {

	List<Backpack> selectBackpackByRoleId(Integer roleId);

	Backpack selectByKey(Integer id);

	Integer selectFZ(Integer id);

	Integer selectTotalRecord(Integer id);

	PageModel selectByPage(Map<String, Object> map , PageModel page);

}

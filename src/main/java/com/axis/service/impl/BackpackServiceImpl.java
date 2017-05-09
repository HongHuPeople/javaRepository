package com.axis.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.axis.dao.BackpackDao;
import com.axis.entity.Backpack;
import com.axis.service.BackpackService;
import com.axis.utils.PageModel;

@Service
@Transactional
public class BackpackServiceImpl implements BackpackService{
	@Autowired
	private BackpackDao backpackDao;

	@Override
	public List<Backpack> selectBackpackByRoleId(Integer roleId) {
		return backpackDao.select("selectByRoleId", roleId);
	}

	@Override
	public Backpack selectByKey(Integer id) {
		return backpackDao.selectByPrimaryKey(id);
	}

	@Override
	public Integer selectFZ(Integer id) {
		return backpackDao.selectInteger("selectFZ", id);
	}

	@Override
	public Integer selectTotalRecord(Integer id) {
		return backpackDao.selectInteger("selectTotalRecord", id);
	}

	@Override
	public PageModel selectByPage(Map<String, Object> map,PageModel page) {
		return backpackDao.selectByPage("selectBackpackByPage", "selectBackpackByPageCount", map, page);
	}
}

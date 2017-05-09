package com.axis.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.axis.base.BaseSession;
import com.axis.entity.Backpack;
import com.axis.entity.Role;
import com.axis.service.BackpackService;
import com.axis.service.RoleService;
import com.axis.utils.GoodsUtils;
import com.axis.utils.PageModel;

@Controller
@RequestMapping("/game")
public class GameController extends BaseSession {

	@Autowired
	private RoleService roleService;
	@Autowired
	private BackpackService backpackService;

	@RequestMapping("/toNoticePage")
	public ModelAndView toNoticePage(Integer id, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Role role = roleService.selectRoleById(id);
		mv.addObject("role", role);
		mv.setViewName("godWorld/noticePage");
		return mv;
	}

	@RequestMapping("/toGameWorld")
	public ModelAndView toGameWorld(Integer id, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Role role = roleService.selectRoleById(id);
		if (role != null) {
			mv.addObject("role", role);
			mv.setViewName("godWorld/map/start");
		} else {

		}
		return mv;
	}

//	@RequestMapping("/showBackpack")
//	public ModelAndView showBackpack(Integer id, HttpServletRequest request) {
//		ModelAndView mv = new ModelAndView();
//		Role role = roleService.selectRoleById(id);
//		if (role != null) {
//			mv.addObject("role", role);
//		}
//		Integer totalRecord = backpackService.selectTotalRecord(id);
//		List<Backpack> backpackList = backpackService.selectBackpackByRoleId(id);
//		if (backpackList != null && !backpackList.isEmpty()) {
//			Integer fz = backpackService.selectFZ(id);
//			mv.addObject("backpackList", backpackList);
//			mv.addObject("fz", fz);
//			mv.addObject("thisPage", 1);
//			mv.addObject("totalPage", totalRecord % 10 == 0 ? totalRecord / 10 : totalRecord / 10 + 1);
//			mv.addObject("totalRecord", totalRecord);
//		}
//		mv.setViewName("godWorld/backpack");
//		return mv;
//	}

	@RequestMapping("/showBackpack")
	public ModelAndView showBackpack(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String roleId = request.getParameter("roleId");
		String type = request.getParameter("type");
		Integer thisPage = StringUtils.isBlank(request.getParameter("thisPage")) ? 1
				: Integer.valueOf(request.getParameter("thisPage"));//获取目标页面
		PageModel page = new PageModel(thisPage);
		Map<String, Object> map = new HashMap<>();
		if(StringUtils.isNotBlank(roleId)){
			map.put("roleId", request.getParameter("roleId"));
			Role role = roleService.selectRoleById(Integer.valueOf(roleId));
			if (role != null) {
				mv.addObject("role", role);
			}
			Integer fz = backpackService.selectFZ(Integer.valueOf(roleId));
			mv.addObject("fz", fz);
		}
		if(StringUtils.isNotBlank(type)){
			map.put("type", request.getParameter("type"));
		}
		map.put("startRow", page.getStartRow());
		map.put("pageSize", page.getPageSize());
		page = backpackService.selectByPage(map,page);
		mv.addObject("page", page);
		mv.setViewName("godWorld/backpack");
		return mv;
	}

	@RequestMapping("/showGoodsDetil")
	public ModelAndView showGoodsDetil(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		// Role role = roleService.selectRoleById(id);
		Backpack backpack = backpackService.selectByKey(Integer.valueOf(request.getParameter("id")));
		String showDetil = GoodsUtils.analysisGoodsDeltil(backpack.getGoodsId().getDetailed());
		mv.addObject("backpack", backpack);
		mv.addObject("showDetil", showDetil);
		mv.addObject("thisPage", request.getParameter("thisPage"));
		mv.setViewName("godWorld/showGoodsDetil");
		return mv;
	}

}

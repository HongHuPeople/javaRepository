package com.axis.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.axis.base.BaseSession;
import com.axis.base.Constants;
import com.axis.base.ResponseMsg;
import com.axis.entity.Role;
import com.axis.entity.User;
import com.axis.service.RoleService;

@Controller
@RequestMapping("/gRole")
public class RoleController extends BaseSession{
	private static Log log = LogFactory.getLog(RoleController.class);
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/toRolePage")
	public ModelAndView toRolePage(HttpServletRequest request){
		User user = (User)request.getSession().getAttribute(Constants.USER_SESSION);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		List<Role> roleList = roleService.selectRoleByUserId(user.getId());
		if(roleList!=null && !roleList.isEmpty()){
			mv.addObject("roleList", roleList);
			mv.setViewName("godWorld/rolePage");
		}else{
			mv.setViewName("godWorld/createRole");
		}
		return mv;
	}
	
	@RequestMapping("/createRole")
	public ResponseMsg createRole(HttpServletRequest request){
		User user = (User)request.getSession().getAttribute(Constants.USER_SESSION);
		ResponseMsg rm = new ResponseMsg();
		String roleName = request.getParameter("roleName");
		Role role = new Role();
		role.setRoleName(roleName);
		role.setUserId(user.getId());
		role.setCreateDate(new Date());
		boolean b = roleService.createRole(role);
		if(b){
			rm.setMsg("创建成功");
		}else{
			rm.setCode(400);
			rm.setMsg("创建失败");
		}
		return rm;
	}
}

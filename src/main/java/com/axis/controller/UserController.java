package com.axis.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.axis.base.BaseSession;
import com.axis.base.Constants;
import com.axis.base.ResponseMsg;
import com.axis.entity.User;
import com.axis.service.UserService;
import com.axis.utils.IPUtil;
import com.axis.utils.MD5Util;

@Controller
@RequestMapping("/user")
public class UserController extends BaseSession {
	private static Log log = LogFactory.getLog(UserController.class);
	@Autowired
	private UserService userService;
	
	public static Map<String, String> loginUserSeesionId = new HashMap<String, String>();

	@RequestMapping("/homePage")  
    public String toIndex(HttpServletRequest request,Model model){  
		User user = (User)request.getSession().getAttribute(Constants.USER_SESSION);
        model.addAttribute("user", user);  
        model.addAttribute("hh", "啊里巴巴");
        return "homePage";  
    }
	
	@RequestMapping("/signIn")
	@ResponseBody
	public ResponseMsg signIn(HttpServletRequest request){
		log.info(new Date() + "=>>" +"登录开始 =>>");
		ResponseMsg rm = new ResponseMsg();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if(StringUtils.isNotBlank(password)){
			password = MD5Util.getMD5Code(password);
		}
		User user = userService.getUserByUserName(userName); 
		if(user != null){
			if(user.getPassword().equals(password)){
				loginUserSeesionId.put(Constants.USER_ID+user.getId(), request.getSession().getId());
				request.getSession().setAttribute(Constants.USER_SESSION, user);
				try {
					String loginIp = IPUtil.getIpAddr(request);
					user.setLastLoginIp(loginIp);
					user.setLastLoginDate(new Date());
					userService.updateByUser(user);
				} catch (Exception e) {
					e.printStackTrace();
					rm.setCode(400);
					rm.setMsg("网络异常,请稍后重试");
					return rm;
				}
				rm.setMsg("登陆成功");
			}else{
				rm.setCode(400);
				rm.setMsg("登陆失败");
			}
		}else{
			rm.setCode(400);
			rm.setMsg("用户名不存在");
		}
		return rm;
	}
	
	@RequestMapping("/toSignUp")
	@ResponseBody
	public String toSignUp(){
		return "signUp";
	}
	
	@RequestMapping("/signUp")
	@ResponseBody
	public ResponseMsg signUp(@RequestBody User user){
		ResponseMsg rm = new ResponseMsg();
		return rm;
	}
	
	@RequestMapping("/signOut")
	@ResponseBody
	public ResponseMsg signOut(HttpServletRequest request){
		ResponseMsg rm = new ResponseMsg();
		User user = (User)request.getAttribute(Constants.USER_SESSION);
		if(user!=null){
			loginUserSeesionId.remove(Constants.USER_ID+user.getId());
			request.removeAttribute(Constants.USER_SESSION);
		}
		rm.setMsg("退出成功");
		return rm;
	}
}
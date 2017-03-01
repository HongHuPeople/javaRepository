package com.axis.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

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

@Controller
@RequestMapping("/user")
public class UserController extends BaseSession {
	private static Log log = LogFactory.getLog(UserController.class);
	@Autowired
	private UserService userService;

	@RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
		User user = (User)request.getSession().getAttribute(Constants.USER_SESSION);
        model.addAttribute("user", user);  
        model.addAttribute("hh", "啊里巴巴");
        return "showUser";  
    }
	
	@RequestMapping("/signIn")
	@ResponseBody
	public ResponseMsg signIn(HttpServletRequest request){
		log.info(new Date() + "=>>" +"登录开始 =>>");
		ResponseMsg rm = new ResponseMsg();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		User user = userService.getUserByUserName(userName); 
		if(user.getPassword().equals(password)){
			request.getSession().setAttribute(Constants.USER_SESSION, user);
			rm.setMsg("登陆成功");
		}else{
			rm.setCode(400);
			rm.setMsg("登陆失败");
		}
		return rm;
	}
	
	@RequestMapping("/signUp")
	@ResponseBody
	public ResponseMsg signUp(@RequestBody User user){
		ResponseMsg rm = new ResponseMsg();
		
		return rm;
	}
}
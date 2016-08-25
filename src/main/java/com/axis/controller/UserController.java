package com.axis.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axis.base.BaseSession;
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
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        model.addAttribute("hh", "啊里巴巴");
        return "showUser";  
    }
}
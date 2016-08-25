package com.axis.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public abstract class BaseSession {
	public static HttpSession getSession() {
		HttpSession session = null;
		try {
		    session = getRequest().getSession();
		} catch (Exception e) {}
		    return session;
		}

		public static HttpServletRequest getRequest() {
		ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder
		.getRequestAttributes();
		return attrs.getRequest();
		} 
}

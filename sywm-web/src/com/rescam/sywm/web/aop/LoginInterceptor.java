package com.rescam.sywm.web.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.rescam.common.web.vo.UserSO;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		Object user = request.getSession().getAttribute(UserSO.SESSION_KEY);
		if (user == null) {
			response.sendRedirect(request.getContextPath() + "/login/view");
			return false;
		}
		return true;
	}
}

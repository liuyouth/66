package com.rescam.syhz.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {

	@RequestMapping(value = "**/view", method = RequestMethod.GET)
	public String getView(HttpServletRequest request) {
		String uri = request.getRequestURI();
		int beginIndex = uri.indexOf("/", 1) + 1;
		int endIndex = uri.lastIndexOf("/");
		return uri.substring(beginIndex, endIndex);
	}

	@RequestMapping(value = "to", method = RequestMethod.GET)
	public String toView(String url) {
		return url;
	}

}

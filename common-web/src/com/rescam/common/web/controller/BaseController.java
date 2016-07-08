package com.rescam.common.web.controller;

import java.lang.reflect.Field;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.rescam.common.web.service.BaseService;
import com.rescam.common.web.vo.UserSO;

public class BaseController {

	@ModelAttribute
	public void setUid(HttpSession session) {
		UserSO userSO = (UserSO) session.getAttribute(UserSO.SESSION_KEY);
		if (userSO == null) {
			return;
		}
		Field[] fields = getClass().getDeclaredFields();
		for (Field field : fields) {
			if (BaseService.class.isAssignableFrom(field.getType())) {
				field.setAccessible(true);
				try {
					BaseService baseService = (BaseService) field.get(this);
					baseService.setUid(userSO.getUid());
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

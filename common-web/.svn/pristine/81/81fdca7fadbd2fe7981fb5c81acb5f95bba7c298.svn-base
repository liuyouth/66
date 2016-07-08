package com.rescam.common.web.service.impl;

import java.lang.reflect.Field;

import com.rescam.common.rs.Client;
import com.rescam.common.web.service.BaseService;

public class BaseServiceImpl implements BaseService {

	@Override
	public void setUid(Integer uid) {
		Field[] fields = getClass().getDeclaredFields();
		for (Field field : fields) {
			if (Client.class.isAssignableFrom(field.getType())) {
				field.setAccessible(true);
				try {
					Client client = (Client) field.get(this);
					client.setUidValue(uid);
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

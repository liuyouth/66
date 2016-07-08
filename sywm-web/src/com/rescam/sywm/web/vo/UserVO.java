package com.rescam.sywm.web.vo;

import java.util.List;
import java.util.Map;

import com.rescam.common.web.vo.UserSO;

public class UserVO extends UserSO {

	private static final long serialVersionUID = 1L;
	private List<Map<String, Object>> authList;

	public List<Map<String, Object>> getAuthList() {
		return authList;
	}

	public void setAuthList(List<Map<String, Object>> authList) {
		this.authList = authList;
	}
}

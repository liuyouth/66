package com.rescam.sywm.server.service.system;

import java.util.List;
import java.util.Map;

import com.rescam.sywm.server.entity.UserAuth;
import com.rescam.sywm.server.vo.SystemFunctionVo;

public interface SystemFunctionService {
	SystemFunctionVo authList(Map<String, String> params);

	void add(int[] read, int[] write, int userGroupId);

	List<UserAuth> ReadAuth(Map<String, String> params);
}

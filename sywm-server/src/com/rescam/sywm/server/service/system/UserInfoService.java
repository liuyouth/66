package com.rescam.sywm.server.service.system;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.rescam.sywm.server.entity.UserAuth;
import com.rescam.sywm.server.entity.UserInfo;

public interface UserInfoService {
	Serializable add(UserInfo userInfo);

	List<UserInfo> uniqueLoginName(Map<String, String> params) throws Exception;

	List<UserInfo> search(Map<String, String> params);

	Long count(Map<String, String> params);

	void del(Map<String, String> params);

	UserInfo read(Map<String, String> params);

	void update(Map<String, String> params) throws Exception;

	List<UserInfo> loginIn(Map<String, String> params) throws Exception;

	List<UserAuth> getAuth(int userGroupId) throws Exception;

	UserInfo modifyPwd(Map<String, String> params) throws Exception;

}

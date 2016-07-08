package com.rescam.sywm.web.service.system;

import java.util.List;
import java.util.Map;

import com.rescam.common.web.service.BaseService;

public interface UserInfoService extends BaseService {
	String add(Map<String, String> params) throws Exception;

	String queryKV() throws Exception;

	String uniqueLoginname(Map<String, String> params) throws Exception;

	List<Map<String, Object>> search(Map<String, String> params) throws Exception;

	Long count(Map<String, String> params) throws Exception;

	void del(String userInfoId) throws Exception;

	String read(String userInfoId) throws Exception;

	String update(Map<String, String> params) throws Exception;

	String loginIn(Map<String, String> params) throws Exception;

	String modifyPwd(Map<String, String> params) throws Exception;
}

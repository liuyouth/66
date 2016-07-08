package com.rescam.sywm.web.service.system.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rescam.common.rs.Client;
import com.rescam.common.web.service.impl.BaseServiceImpl;
import com.rescam.sywm.rs.path.system.SYWMUserGroupPath;
import com.rescam.sywm.rs.path.system.SYWMUserInfoPath;
import com.rescam.sywm.web.service.system.UserInfoService;

@Service
@Scope("prototype")
public class UserInfoServiceImpl extends BaseServiceImpl implements UserInfoService {
	@Autowired
	private Client sywmClient;

	@Override
	public String add(Map<String, String> params) throws Exception {
		return sywmClient.post(SYWMUserInfoPath.Add, params);
	}

	@Override
	public String queryKV() throws Exception {
		return sywmClient.post(SYWMUserGroupPath.KV);
	}

	@Override
	public String uniqueLoginname(Map<String, String> params) throws Exception {
		return sywmClient.post(SYWMUserInfoPath.UniqueLoginName, params);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Map<String, Object>> search(Map<String, String> params) throws Exception {
		String filterString = "[\"userInfoId\",\"loginName\",\"userName\",\"userMobile\",{\"userGroup\":[\"userGroupName\"]}]";
		params.put("filterString", filterString);
		String result = sywmClient.post(SYWMUserInfoPath.Search, params);
		ObjectMapper mapper = new ObjectMapper();
		return (List<Map<String, Object>>) mapper.readValue(result, new TypeReference<List<Map<String, Object>>>() {
		});

	}

	@Override
	public Long count(Map<String, String> params) throws Exception {
		String count = sywmClient.post(SYWMUserInfoPath.Count, params);
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(count, Long.class);
	}

	@Override
	public void del(String userInfoId) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("userInfoId", userInfoId);
		sywmClient.post(SYWMUserInfoPath.Del, map);
	}

	@Override
	public String read(String userInfoId) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		String filterString = "[\"userInfoId\",\"loginName\",\"userName\",\"userMobile\",{\"userGroup\":[\"userGroupName\",\"userGroupId\"]}]";
		map.put("filterString", filterString);
		map.put("userInfoId", userInfoId);
		return sywmClient.post(SYWMUserInfoPath.Read, map);
	}

	@Override
	public String update(Map<String, String> params) throws Exception {
		return sywmClient.post(SYWMUserInfoPath.Update, params);
	}

	@Override
	public String loginIn(Map<String, String> params) throws Exception {
		return sywmClient.post(SYWMUserInfoPath.LoginIn, params);
	}

	@Override
	public String modifyPwd(Map<String, String> params) throws Exception {
		return sywmClient.post(SYWMUserInfoPath.ModifyPwd, params);
	}
}

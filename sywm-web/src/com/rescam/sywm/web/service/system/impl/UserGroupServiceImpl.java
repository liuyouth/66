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
import com.rescam.sywm.web.service.system.UserGroupService;

@Service
@Scope("prototype")
public class UserGroupServiceImpl extends BaseServiceImpl implements UserGroupService {
	@Autowired
	private Client sywmClient;

	@Override
	public String add(Map<String, String> params) throws Exception {
		return sywmClient.post(SYWMUserGroupPath.Add, params);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Map<String, Object>> search(Map<String, String> params) throws Exception {
		String filterString = "[\"userGroupId\",\"userGroupName\",\"userGroupRemark\"]";
		params.put("filterString", filterString);
		String result = sywmClient.post(SYWMUserGroupPath.Search, params);
		ObjectMapper mapper = new ObjectMapper();
		return (List<Map<String, Object>>) mapper.readValue(result, new TypeReference<List<Map<String, Object>>>() {
		});

	}

	@Override
	public Long count(Map<String, String> params) throws Exception {
		String count = sywmClient.post(SYWMUserGroupPath.Count, params);
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(count, Long.class);
	}

	@Override
	public void del(String userGroupId) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("userGroupId", userGroupId);
		sywmClient.post(SYWMUserGroupPath.Del, map);
	}

	@Override
	public String read(String userGroupId) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		String filterString = "[\"userGroupId\",\"userGroupName\",\"userGroupRemark\"]";
		map.put("filterString", filterString);
		map.put("userGroupId", userGroupId);
		return sywmClient.post(SYWMUserGroupPath.Read, map);
	}

	@Override
	public String update(Map<String, String> params) throws Exception {
		return sywmClient.post(SYWMUserGroupPath.Update, params);
	}

	@Override
	public String uniqueUserGroupName(Map<String, String> params) throws Exception {
		return sywmClient.post(SYWMUserGroupPath.UniqueUserGroupName, params);
	}

}

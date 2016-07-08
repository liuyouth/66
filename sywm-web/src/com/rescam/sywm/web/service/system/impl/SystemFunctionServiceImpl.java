package com.rescam.sywm.web.service.system.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.rescam.common.rs.Client;
import com.rescam.common.web.service.impl.BaseServiceImpl;
import com.rescam.sywm.rs.path.system.SYWMSystemFunctionPath;
import com.rescam.sywm.web.service.system.SystemFunctionService;

@Service
@Scope("prototype")
public class SystemFunctionServiceImpl extends BaseServiceImpl implements SystemFunctionService {
	@Autowired
	private Client sywmClient;

	@Override
	public String authList(Map<String, String> params) throws Exception {
		return sywmClient.post(SYWMSystemFunctionPath.AuthList, params);

	}

	@Override
	public String add(@RequestParam Map<String, String> params) throws Exception {
		return sywmClient.post(SYWMSystemFunctionPath.Add, params);
	}

	@Override
	public String readAuth(String userGroupId) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		String filterString = "[{\"systemFunction\":[\"systemFunctionId\"]},\"userAuth\"]";
		map.put("filterString", filterString);
		map.put("userGroupId", userGroupId);
		return sywmClient.post(SYWMSystemFunctionPath.ReadAuth, map);
	}

}

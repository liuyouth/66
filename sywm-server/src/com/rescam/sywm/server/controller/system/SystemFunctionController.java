package com.rescam.sywm.server.controller.system;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rescam.common.server.util.EntityUtils;
import com.rescam.sywm.rs.uri.system.SYWMSystemFunctionURI;
import com.rescam.sywm.server.entity.UserAuth;
import com.rescam.sywm.server.service.system.SystemFunctionService;
import com.rescam.sywm.server.vo.SystemFunctionVo;

@RestController
@RequestMapping(value = SYWMSystemFunctionURI.Base, method = RequestMethod.POST)
public class SystemFunctionController {
	@Autowired
	SystemFunctionService systemFunctionService;

	@RequestMapping(value = SYWMSystemFunctionURI.AuthList)
	public SystemFunctionVo authList(@RequestParam Map<String, String> params) throws Exception {
		return systemFunctionService.authList(params);

	}

	@RequestMapping(value = SYWMSystemFunctionURI.Add)
	public void add(int[] read, int[] write, int userGroupId) throws Exception {
		systemFunctionService.add(read, write, userGroupId);
	}

	@RequestMapping(value = SYWMSystemFunctionURI.ReadAuth)
	public List<Map<String, Object>> readAuth(@RequestParam Map<String, String> params) throws Exception {
		String filterString = params.get("filterString");
		List<UserAuth> list = systemFunctionService.ReadAuth(params);
		return EntityUtils.filter(list, filterString);

	}
}

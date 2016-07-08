package com.rescam.sywm.web.controller.system;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rescam.common.vo.ResultInfo;
import com.rescam.common.web.controller.BaseController;
import com.rescam.sywm.web.service.system.SystemFunctionService;
import com.rescam.sywm.web.util.MessageConst;

@RestController
@Scope("prototype")
@RequestMapping("systemFunction")
public class SystemFunctionController extends BaseController {
	@Autowired
	SystemFunctionService systemFunctionService;

	@RequestMapping("authList")
	public String authList(@RequestParam Map<String, String> params) throws Exception {

		return systemFunctionService.authList(params);

	}

	@RequestMapping("add")
	public ResultInfo add(@RequestParam Map<String, String> params) {
		ResultInfo resultInfo = new ResultInfo();
		try {

			systemFunctionService.add(params);
			resultInfo.setSuccess(true);
			resultInfo.setMsg(MessageConst.OPERATE_SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo.setSuccess(false);
			resultInfo.setMsg(MessageConst.OPERATE_FAIL);
		}
		return resultInfo;
	}

	@RequestMapping("/readAuth/{userGroupId}")
	public String readAuth(@PathVariable("userGroupId") String userGroupId) throws Exception {
		return systemFunctionService.readAuth(userGroupId);

	}

}

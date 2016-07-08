package com.rescam.sywm.web.controller.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rescam.common.vo.DataTableInfo;
import com.rescam.common.vo.ResultInfo;
import com.rescam.common.web.controller.BaseController;
import com.rescam.sywm.web.service.system.UserGroupService;
import com.rescam.sywm.web.util.MessageConst;
import com.rescam.sywm.web.vo.ValidInfo;

@RestController
@Scope("prototype")
@RequestMapping("userGroup")
public class UserGroupController extends BaseController{
	@Autowired
	UserGroupService userGroupService;

	@RequestMapping("add")
	public ResultInfo add(@RequestParam Map<String, String> params) {
		ResultInfo info = new ResultInfo();
		try {
			userGroupService.add(params);
			info.setSuccess(true);
			info.setMsg(MessageConst.OPERATE_SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
			info.setSuccess(false);
			info.setMsg(MessageConst.OPERATE_FAIL);
		}
		return info;
	}

	@RequestMapping(value = "/search")
	public DataTableInfo search(@RequestParam Map<String, String> params, HttpServletRequest request) throws Exception {
		DataTableInfo dataTableInfo = new DataTableInfo();

		int draw = Integer.valueOf(params.get("draw"));
		// 当前第几页，datatables从0开始算第一页
		int start = Integer.valueOf(params.get("start"));
		// 每页显示的数据量
		int length = Integer.valueOf(params.get("length"));
		// 转换为page
		int page = start / length + 1;
		// 模糊查询
		params.put("page", String.valueOf(page));
		// 保存返回数据
		HashMap<String, Object> hm = new HashMap<String, Object>();
		dataTableInfo.setDraw(draw);
		// 数据量
		Long rows = userGroupService.count(params);
		if (rows == null || rows == 0) {
			dataTableInfo.setRecordsFiltered(0);
			dataTableInfo.setRecordsTotal(0);
			dataTableInfo.setData(new ArrayList<Object>());
			return dataTableInfo;
		}
		// 数据
		List list = userGroupService.search(params);
		dataTableInfo.setData(list);
		dataTableInfo.setRecordsFiltered(rows);
		dataTableInfo.setRecordsTotal(rows);

		return dataTableInfo;

	}

	@RequestMapping(value = "/del/{userGroupId}")
	public void del(@PathVariable("userGroupId") String userGroupId) throws Exception {
		userGroupService.del(userGroupId);
	}

	@RequestMapping(value = "/read/{userGroupId}")
	public String read(@PathVariable("userGroupId") String userGroupId) throws Exception {
		return userGroupService.read(userGroupId);
	}

	@RequestMapping("update")
	public ResultInfo update(@RequestParam Map<String, String> params) {
		ResultInfo info = new ResultInfo();
		try {
			userGroupService.update(params);
			info.setSuccess(true);
			info.setMsg(MessageConst.OPERATE_SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
			info.setSuccess(false);
			info.setMsg(MessageConst.OPERATE_FAIL);
		}
		return info;
	}

	@RequestMapping("/uniqueUserGroupName")
	public ValidInfo uniqueUserGroupName(@RequestParam Map<String, String> params) {
		ValidInfo validInfo = new ValidInfo();
		try {
			String rusult = userGroupService.uniqueUserGroupName(params);
			ObjectMapper mapper = new ObjectMapper();
			ResultInfo resultInfo = mapper.readValue(rusult, ResultInfo.class);
			if (resultInfo.isSuccess()) {
				validInfo.setInfo("");
				validInfo.setStatus("y");
			} else {
				validInfo.setInfo("该分类名称已存在！");
				validInfo.setStatus("n");
			}
		} catch (Exception e) {
			e.printStackTrace();

			validInfo.setStatus("n");
			validInfo.setInfo("系统异常，请稍后再试！");
		}
		return validInfo;
	}
}

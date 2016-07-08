package com.rescam.sywm.web.controller.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rescam.common.vo.DataTableInfo;
import com.rescam.common.vo.ResultInfo;
import com.rescam.common.web.controller.BaseController;
import com.rescam.common.web.vo.UserSO;
import com.rescam.sywm.web.service.system.UserInfoService;
import com.rescam.sywm.web.util.MessageConst;
import com.rescam.sywm.web.vo.UserVO;
import com.rescam.sywm.web.vo.ValidInfo;

@RestController
@Scope("prototype")
@RequestMapping("userInfo")
public class UserInfoController extends BaseController {
	@Autowired
	UserInfoService userInfoService;

	@RequestMapping("add")
	public ResultInfo add(@RequestParam Map<String, String> params) {
		ResultInfo info = new ResultInfo();
		try {
			userInfoService.add(params);
			info.setSuccess(true);
			info.setMsg(MessageConst.OPERATE_SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
			info.setSuccess(false);
			info.setMsg(MessageConst.OPERATE_FAIL);
		}
		return info;
	}

	@RequestMapping("kv")
	public String queryKV() throws Exception {

		return userInfoService.queryKV();
	}

	@RequestMapping("/uniqueUserGroupName")
	public ValidInfo uniqueUserGroupName(@RequestParam Map<String, String> params) {
		ValidInfo validInfo = new ValidInfo();
		try {
			String rusult = userInfoService.uniqueLoginname(params);
			ObjectMapper mapper = new ObjectMapper();
			ResultInfo resultInfo = mapper.readValue(rusult, ResultInfo.class);
			if (resultInfo.isSuccess()) {
				validInfo.setInfo("");
				validInfo.setStatus("y");
			} else {
				validInfo.setInfo("该登录名已存在！");
				validInfo.setStatus("n");
			}
		} catch (Exception e) {
			e.printStackTrace();

			validInfo.setStatus("n");
			validInfo.setInfo("系统异常，请稍后再试！");
		}
		return validInfo;
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
		Long rows = userInfoService.count(params);
		if (rows == null || rows == 0) {
			dataTableInfo.setRecordsFiltered(0);
			dataTableInfo.setRecordsTotal(0);
			dataTableInfo.setData(new ArrayList<Object>());
			return dataTableInfo;
		}
		// 数据
		List list = userInfoService.search(params);
		dataTableInfo.setData(list);
		dataTableInfo.setRecordsFiltered(rows);
		dataTableInfo.setRecordsTotal(rows);

		return dataTableInfo;

	}

	@RequestMapping(value = "/del/{userInfoId}")
	public void del(@PathVariable("userInfoId") String userInfoId) throws Exception {
		userInfoService.del(userInfoId);
	}

	@RequestMapping(value = "/read/{userInfoId}")
	public String read(@PathVariable("userInfoId") String userInfoId) throws Exception {
		return userInfoService.read(userInfoId);
	}

	@RequestMapping("update")
	public ResultInfo update(@RequestParam Map<String, String> params) {
		ResultInfo info = new ResultInfo();
		try {
			userInfoService.update(params);
			info.setSuccess(true);
			info.setMsg(MessageConst.OPERATE_SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
			info.setSuccess(false);
			info.setMsg(MessageConst.OPERATE_FAIL);
		}
		return info;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping("loginIn")
	public ResultInfo loginIn(@RequestParam Map<String, String> params, HttpSession session) throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		UserVO userVO = new UserVO();
		String result = userInfoService.loginIn(params);
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> map = new HashMap<String, Object>();
		map = mapper.readValue(result, new TypeReference<Map<String, Object>>() {
		});
		List<Map<String, Object>> userInfo = (List<Map<String, Object>>) map.get("userInfo");
		if (userInfo != null) {
			userVO.setUid((int) userInfo.get(0).get("userInfoId"));
			userVO.setName((String) userInfo.get(0).get("loginName"));
			userVO.setAuthList((List<Map<String, Object>>) map.get("authList"));
			session.setAttribute(UserSO.SESSION_KEY, userVO);
			resultInfo.setSuccess(true);
			resultInfo.setMsg("");
		} else {
			resultInfo.setSuccess(false);
			resultInfo.setMsg("用户名或密码错误");
		}
		return resultInfo;

	}

	@RequestMapping("loginOut")
	public ResultInfo loginOut(HttpSession session) throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		session.removeAttribute(UserSO.SESSION_KEY);
		resultInfo.setSuccess(true);
		return resultInfo;
	}

	@RequestMapping("modifyPwd")
	public ResultInfo modifyPwd(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		String result = userInfoService.modifyPwd(params);
		ObjectMapper mapper = new ObjectMapper();
		resultInfo = mapper.readValue(result, ResultInfo.class);
		return resultInfo;
	}
}

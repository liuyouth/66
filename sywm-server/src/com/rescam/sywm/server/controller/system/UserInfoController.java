package com.rescam.sywm.server.controller.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rescam.common.server.util.EntityUtils;
import com.rescam.common.vo.ResultInfo;
import com.rescam.sywm.rs.uri.system.SYWMUserInfoURI;
import com.rescam.sywm.server.entity.UserAuth;
import com.rescam.sywm.server.entity.UserInfo;
import com.rescam.sywm.server.service.system.UserInfoService;
import com.rescam.sywm.server.utils.CryptoUtils;

@RestController
@RequestMapping(value = SYWMUserInfoURI.Base, method = RequestMethod.POST)
public class UserInfoController {
	@Autowired
	UserInfoService userInfoService;

	@RequestMapping(value = SYWMUserInfoURI.Add)
	public void add(@ModelAttribute UserInfo userInfo) throws Exception {
		if (userInfo.getUserGroup().getUserGroupId() == -1) {

			userInfo.setUserGroup(null);
		}
		String saltString = CryptoUtils.getSalt();
		String pwdString = CryptoUtils.getHash("123456", saltString);
		userInfo.setLoginPwd(pwdString);
		userInfo.setPwdSalt(saltString);
		userInfoService.add(userInfo);
	}

	@RequestMapping(value = SYWMUserInfoURI.UniqueLoginName)
	public ResultInfo uniqueLoginName(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		List<UserInfo> list = userInfoService.uniqueLoginName(params);
		if (list.size() > 0) {
			resultInfo.setSuccess(false);
		} else {
			resultInfo.setSuccess(true);
		}
		return resultInfo;

	}

	@RequestMapping(value = SYWMUserInfoURI.Search)
	public List<Map<String, Object>> search(@RequestParam Map<String, String> params) throws Exception {
		List<UserInfo> list = userInfoService.search(params);
		String filterString = params.get("filterString");
		return EntityUtils.filter(list, filterString);

	}

	@RequestMapping(value = SYWMUserInfoURI.Count)
	public Long count(@RequestParam Map<String, String> params) throws Exception {
		Long count = userInfoService.count(params);
		return count;

	}

	@RequestMapping(value = SYWMUserInfoURI.Del)
	@Transactional
	public void del(@RequestParam Map<String, String> params) {
		userInfoService.del(params);
	}

	@RequestMapping(value = SYWMUserInfoURI.Read)
	public Map<String, Object> read(@RequestParam Map<String, String> params) throws Exception {
		UserInfo userInfo = userInfoService.read(params);
		String filterString = params.get("filterString");
		return EntityUtils.filter(userInfo, filterString);

	}

	@RequestMapping(value = SYWMUserInfoURI.Update)
	@Transactional
	public void update(@RequestParam Map<String, String> params) throws Exception {
		userInfoService.update(params);
	}

	@RequestMapping(value = SYWMUserInfoURI.LoginIn)
	public Map<String, Object> loginIn(@RequestParam Map<String, String> params) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		List<UserInfo> list = userInfoService.loginIn(params);
		map.put("userInfo", list);
		if (list != null) {
			List<UserAuth> authList = userInfoService.getAuth(list.get(0).getUserGroup().getUserGroupId());
			map.put("authList", authList);
		}

		return map;
	}

	@RequestMapping(value = SYWMUserInfoURI.ModifyPwd)
	public ResultInfo modifyPwd(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		UserInfo userInfo = userInfoService.modifyPwd(params);
		if (userInfo == null) {
			resultInfo.setMsg("您输入的旧密码错误");
			resultInfo.setSuccess(false);
		} else {
			resultInfo.setMsg("");
			resultInfo.setSuccess(true);
		}
		return resultInfo;
	}

}

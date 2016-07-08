package com.rescam.sywm.server.service.system.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rescam.common.server.dao.BaseDAO;
import com.rescam.common.server.util.EntityUtils;
import com.rescam.sywm.server.entity.UserAuth;
import com.rescam.sywm.server.entity.UserInfo;
import com.rescam.sywm.server.service.system.UserInfoService;
import com.rescam.sywm.server.utils.CryptoUtils;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private BaseDAO<UserInfo> userInfoDao;
	@Autowired
	private BaseDAO<UserAuth> userAuthDao;

	@Override
	public Serializable add(UserInfo userInfo) {
		return userInfoDao.save(userInfo);
	}

	@Override
	public List<UserInfo> uniqueLoginName(Map<String, String> params) throws Exception {
		return userInfoDao.find("from UserInfo where loginName=? ", new Object[] { params.get("param") });
	}

	@Override
	public List<UserInfo> search(Map<String, String> params) {
		String hql = "from UserInfo where isDelete=0";
		if (params.get("searchParam") != null & params.get("searchParam") != "") {
			String searchParam = params.get("searchParam");
			hql += "and (loginName like '%" + searchParam + "%' or userName like '%" + searchParam + "%')";
		}

		// 每页显示的数据量
		int length = Integer.valueOf(params.get("length"));
		// 转换为page
		int page = Integer.valueOf(params.get("page"));
		return userInfoDao.find(hql, new Object[0], page, length);
	}

	@Override
	public Long count(Map<String, String> params) {
		String hql = "select count(1) from UserInfo where isDelete=0";
		if (params.get("searchParam") != null & params.get("searchParam") != "") {
			String searchParam = params.get("searchParam");
			hql += "and (loginName like '%" + searchParam + "%' or userName like '%" + searchParam + "%')";
		}
		return userInfoDao.count(hql);
	}

	@Override
	public void del(Map<String, String> params) {
		int userInfoId = Integer.valueOf(params.get("userInfoId"));
		String hql = "update UserInfo set isDelete=1 where userInfoId=" + userInfoId + "";
		userInfoDao.executeHql(hql);

	}

	@Override
	public UserInfo read(Map<String, String> params) {
		int userInfoId = Integer.valueOf(params.get("userInfoId"));
		return userInfoDao.get(UserInfo.class, userInfoId);
	}

	@Override
	public void update(Map<String, String> params) throws Exception {
		UserInfo userInfo = userInfoDao.get(UserInfo.class, Integer.valueOf(params.get("userInfoId")));

		EntityUtils.populate(userInfo, params);

		userInfoDao.update(userInfo);

	}

	@Override
	public List<UserInfo> loginIn(Map<String, String> params) throws Exception {
		String loginName = params.get("loginName");
		String loginPawrd = params.get("loginPwd");
		List<UserInfo> userInfoList = userInfoDao.find("from UserInfo where loginName=?", new Object[] { loginName });
		if (userInfoList == null || userInfoList.size() > 1 || userInfoList.size() == 0) {
			List<UserInfo> list = null;
			return list;
		} else {
			String salt = userInfoList.get(0).getPwdSalt();
			String loginPwd = userInfoList.get(0).getLoginPwd();
			boolean flag = CryptoUtils.verify(loginPwd, loginPawrd, salt);
			if (flag) {
				return userInfoList;
			} else {
				List<UserInfo> list = null;
				return list;
			}
		}

	}

	@Override
	public List<UserAuth> getAuth(int userGroupId) throws Exception {
		return userAuthDao.find("from UserAuth where userGroup.userGroupId=" + userGroupId + "");
	}

	@Override
	public UserInfo modifyPwd(Map<String, String> params) throws Exception {
		int userInfoId = Integer.valueOf(params.get("userInfoId"));
		String loginPawrd = params.get("loginPwd");
		String newloginPawrd = params.get("newloginPawrd");
		UserInfo userInfo = userInfoDao.get(UserInfo.class, userInfoId);
		if (userInfo == null) {
			return userInfo;
		} else {
			String salt = userInfo.getPwdSalt();
			String loginPwd = userInfo.getLoginPwd();
			boolean flag = CryptoUtils.verify(loginPwd, loginPawrd, salt);
			if (flag) {
				String saltString = CryptoUtils.getSalt();
				String pwdString = CryptoUtils.getHash(newloginPawrd, saltString);
				userInfo.setPwdSalt(saltString);
				userInfo.setLoginPwd(pwdString);
				userInfoDao.update(userInfo);
				return userInfo;
			} else {
				UserInfo userInfo1 = null;
				return userInfo1;
			}
		}

	}

}

package com.rescam.sywm.server.service.system.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rescam.common.server.dao.BaseDAO;
import com.rescam.sywm.server.entity.UserGroup;
import com.rescam.sywm.server.service.system.UserGroupService;
import com.rescam.sywm.server.vo.OptionKV;

@Service
public class UserGroupServiceImpl implements UserGroupService {
	@Autowired
	private BaseDAO<UserGroup> userGroupDao;

	@Override
	public Serializable add(UserGroup userGroup) {
		return userGroupDao.save(userGroup);
	}

	@Override
	public List<UserGroup> search(Map<String, String> params) {
		String hql = "from UserGroup where isDelete=0";
		if (params.get("userGroupName") != null & params.get("userGroupName") != "") {
			String userGroupName = params.get("userGroupName");
			hql += "and userGroupName like '%" + userGroupName + "%'";
		}

		// 每页显示的数据量
		int length = Integer.valueOf(params.get("length"));
		// 转换为page
		int page = Integer.valueOf(params.get("page"));
		return userGroupDao.find(hql, new Object[0], page, length);
	}

	@Override
	public Long count(Map<String, String> params) {
		String hql = "select count(1) from UserGroup  where isDelete=0";
		if (params.get("userGroupName") != null & params.get("userGroupName") != "") {
			String userGroupName = params.get("userGroupName");
			hql += "and userGroupName like '%" + userGroupName + "%'";
		}
		return userGroupDao.count(hql);
	}

	@Override
	public void del(Map<String, String> params) {
		int userGroupId = Integer.valueOf(params.get("userGroupId"));
		String hql = "update UserGroup set isDelete=1 where userGroupId=" + userGroupId + "";
		userGroupDao.executeHql(hql);
	}

	@Override
	public UserGroup read(Map<String, String> params) {
		int userGroupId = Integer.valueOf(params.get("userGroupId"));
		return userGroupDao.get(UserGroup.class, userGroupId);
	}

	@Override
	public void update(Map<String, String> params) throws Exception {
		UserGroup userGroup = userGroupDao.get(UserGroup.class, Integer.valueOf(params.get("userGroupId")));

		BeanUtils.populate(userGroup, params);

		userGroupDao.update(userGroup);
	}

	@Override
	public List<UserGroup> uniqueuserGroupName(Map<String, String> params) throws Exception {
		// String param=params.get("param");
		return userGroupDao.find("from UserGroup where userGroupName=? and isDelete = 0",
				new Object[] { params.get("param") });
	}

	@Override
	public List<OptionKV> queryKV() throws Exception {
		List<OptionKV> result = new ArrayList<OptionKV>();
		String hql = "from UserGroup where isDelete = false ";
		List<UserGroup> userGroupList = userGroupDao.find(hql);

		for (UserGroup userGroup : userGroupList) {

			OptionKV option = new OptionKV();
			option.setText(userGroup.getUserGroupName());
			option.setValue(userGroup.getUserGroupId());

			result.add(option);
		}
		return result;
	}

}

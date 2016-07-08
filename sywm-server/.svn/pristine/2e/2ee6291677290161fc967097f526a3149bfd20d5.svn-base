package com.rescam.sywm.server.service.system.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rescam.common.server.dao.BaseDAO;
import com.rescam.sywm.server.entity.SystemFunction;
import com.rescam.sywm.server.entity.UserAuth;
import com.rescam.sywm.server.entity.UserGroup;
import com.rescam.sywm.server.service.system.SystemFunctionService;
import com.rescam.sywm.server.vo.SystemFunctionVo;

@Service
public class SystemFunctionServiceImpl implements SystemFunctionService {
	@Autowired
	private BaseDAO<SystemFunction> baseDAO;
	@Autowired
	private BaseDAO<UserGroup> userGroupDao;
	@Autowired
	private BaseDAO<UserAuth> userAuthDao;

	@Override
	public SystemFunctionVo authList(Map<String, String> params) {

		String hql = "from SystemFunction where systemFunctionParentId=-1";
		SystemFunction systemFunction = baseDAO.get(hql, new Object[0]);
		SystemFunctionVo functionVo = new SystemFunctionVo();
		if (systemFunction != null) {
			functionVo.setSystemFunctionId(systemFunction.getSystemFunctionId());
			functionVo.setSystemFunctionName(systemFunction.getSystemFunctionName());
			int systemFunctionParentId = systemFunction.getSystemFunctionId();
			List<SystemFunctionVo> children = new ArrayList<SystemFunctionVo>();
			List<SystemFunction> childenList = baseDAO.find(
					"from SystemFunction where isShow=true and systemFunctionParentId=" + systemFunctionParentId + "");
			for (int i = 0; i < childenList.size(); i++) {
				SystemFunctionVo childVo = new SystemFunctionVo();
				int systemFunctionParentId1 = childenList.get(i).getSystemFunctionId();
				List<SystemFunction> childList = baseDAO
						.find("from SystemFunction where isShow=true and systemFunctionParentId="
								+ systemFunctionParentId1 + "");
				childVo.setSystemFunctionId(childenList.get(i).getSystemFunctionId());
				childVo.setSystemFunctionName(childenList.get(i).getSystemFunctionName());
				List<SystemFunctionVo> children2 = new ArrayList<SystemFunctionVo>();
				for (int j = 0; j < childList.size(); j++) {
					SystemFunctionVo childVo2 = new SystemFunctionVo();
					childVo2.setSystemFunctionId(childList.get(j).getSystemFunctionId());
					childVo2.setSystemFunctionName(childList.get(j).getSystemFunctionName());
					children2.add(childVo2);
				}
				childVo.setChildren(children2);
				children.add(childVo);

			}
			functionVo.setChildren(children);
		}
		return functionVo;
	}

	@Override
	public void add(int[] read, int[] write, int userGroupId) {
		String hql = "delete from UserAuth where userGroup.userGroupId=" + userGroupId + "";
		baseDAO.executeHql(hql);
		if (write.length > 0) {
			for (int i = 0; i < write.length; i++) {
				UserAuth userAuth = new UserAuth();
				SystemFunction systemFunction = baseDAO.get(SystemFunction.class, write[i]);
				UserGroup userGroup = userGroupDao.get(UserGroup.class, userGroupId);
				userAuth.setSystemFunction(systemFunction);
				userAuth.setUserGroup(userGroup);
				userAuth.setUserAuth(1);
				userAuthDao.save(userAuth);

			}
		}
		if (read.length > 0) {
			for (int j = 0; j < read.length; j++) {
				UserAuth userAuth = new UserAuth();
				SystemFunction systemFunction = baseDAO.get(SystemFunction.class, read[j]);
				UserGroup userGroup = userGroupDao.get(UserGroup.class, userGroupId);
				userAuth.setSystemFunction(systemFunction);
				userAuth.setUserGroup(userGroup);
				userAuth.setUserAuth(0);
				userAuthDao.save(userAuth);
			}
		}

	}

	@Override
	public List<UserAuth> ReadAuth(Map<String, String> params) {
		int userGroupId = Integer.valueOf(params.get("userGroupId"));
		return userAuthDao.find("from UserAuth where userGroup.userGroupId=" + userGroupId + "");
	}

}

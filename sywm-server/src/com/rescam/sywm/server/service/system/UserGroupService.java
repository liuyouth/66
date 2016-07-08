package com.rescam.sywm.server.service.system;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.rescam.sywm.server.entity.UserGroup;
import com.rescam.sywm.server.vo.OptionKV;

public interface UserGroupService {
	Serializable add(UserGroup userGroup);

	List<UserGroup> search(Map<String, String> params);

	Long count(Map<String, String> params);

	void del(Map<String, String> params);

	UserGroup read(Map<String, String> params);

	void update(Map<String, String> params) throws Exception;

	List<UserGroup> uniqueuserGroupName(Map<String, String> params) throws Exception;

	public List<OptionKV> queryKV() throws Exception;
}
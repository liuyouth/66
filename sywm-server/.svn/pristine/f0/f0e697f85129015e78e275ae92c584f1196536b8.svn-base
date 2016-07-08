package com.rescam.sywm.server.service.warehouse.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rescam.common.server.dao.BaseDAO;
import com.rescam.common.server.util.EntityUtils;
import com.rescam.sywm.server.entity.StorageRacks;
import com.rescam.sywm.server.service.warehouse.StorageRacksService;

@Service
public class StorageRacksServerImpl implements StorageRacksService {

	@Autowired
	private BaseDAO<StorageRacks> storageRacksDAO;

	@Override
	public Long getCount(Map<String, String> params) throws Exception {
		String hql = "select count(1) from StorageRacks ";
		String searchParam = params.get("searchParam");
		if (searchParam != null & searchParam != "") {
			hql += "where storageRacksCode like '%" + searchParam + "%' ";
		}

		return storageRacksDAO.count(hql);
	}

	@Override
	public List<StorageRacks> search(Map<String, String> params) throws Exception {
		String hql = "from StorageRacks ";
		String searchParam = params.get("searchParam");
		int page = Integer.valueOf((params.get("page")));
		int rows = Integer.valueOf((params.get("length")));
		if (searchParam != null & searchParam != "") {
			hql += "where storageRacksCode like '%" + searchParam + "%' ";
		}

		return storageRacksDAO.find(hql, new Object[0], page, rows);
	}

	@Override
	public StorageRacks edit(Integer storageRacksId) throws Exception {
		StorageRacks storageRacks = storageRacksDAO.get(StorageRacks.class, storageRacksId);
		return storageRacks;
	}

	@Override
	@Transactional
	public void addToAreas(Map<String, String> params) throws Exception {
		String storageRacksIds = params.get("selectedRacksIds");
		String storageAreasId = params.get("storageAreasId");
		String[] ids = storageRacksIds.split(",");
		int[] racksIds = new int[ids.length];
		for (int i = 0; i < ids.length; i++) {
			racksIds[i] = Integer.parseInt(ids[i]);
		}
		Map<String, String> updateData = new HashMap<String, String>();
		updateData.put("storageAreas.storageAreasId", storageAreasId);
		for (int i = 0; i < racksIds.length; i++) {
			StorageRacks storageRacks = storageRacksDAO.get(StorageRacks.class, racksIds[i]);
			EntityUtils.populate(storageRacks, updateData);
			storageRacksDAO.update(storageRacks);
		}
	}

	@Override
	@Transactional
	public void update(Map<String, String> params) throws Exception {

		StorageRacks storageRacks = storageRacksDAO.get(StorageRacks.class,
				Integer.valueOf(params.get("storageRacksId")));

		BeanUtils.populate(storageRacks, params);

		storageRacksDAO.update(storageRacks);
	}

	@Override
	public List<StorageRacks> selectAllRacks(Map<String, String> params) throws Exception {

		String hql = "from StorageRacks where isEnable = 1 ";
		return storageRacksDAO.find(hql);
	}

}

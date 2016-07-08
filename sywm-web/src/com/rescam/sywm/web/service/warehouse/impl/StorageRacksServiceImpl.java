package com.rescam.sywm.web.service.warehouse.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rescam.common.rs.Client;
import com.rescam.common.vo.ResultInfo;
import com.rescam.common.web.service.impl.BaseServiceImpl;
import com.rescam.sywm.rs.path.warehouse.SYWMStorageRacksPath;
import com.rescam.sywm.web.service.warehouse.StorageRacksService;

@Service()
@Scope("prototype")
public class StorageRacksServiceImpl extends BaseServiceImpl implements StorageRacksService {

	@Autowired
	private Client sywmClient;

	@Override
	public long count(String searchParam) throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("searchParam", searchParam);
		String response = sywmClient.post(SYWMStorageRacksPath.Count, params);
		ObjectMapper objectMapper = new ObjectMapper();
		ResultInfo info = new ResultInfo();
		info = objectMapper.readValue(response, ResultInfo.class);
		if (info.isSuccess()) {

			return Double.valueOf(info.getMsg().toString()).longValue();
		} else {

			return 0L;
		}
	}

	@Override
	public List search(int page, int length, String searchParam) throws Exception {
		String filterString = "[\"storageRacksId\",\"storageRacksCode\",\"storageRacksType\",\"goodsLocatorCount\",\"storageRacksArea\",\"isEnable\",{\"storageAreas\":[\"areasName\"]}]";
		Map<String, String> params = new HashMap<String, String>();
		params.put("page", String.valueOf(page));
		params.put("length", String.valueOf(length));
		params.put("searchParam", searchParam);
		params.put("filterString", filterString);
		String response = sywmClient.post(SYWMStorageRacksPath.Search, params);
		ObjectMapper objectMapper = new ObjectMapper();
		ResultInfo info = new ResultInfo();
		info = objectMapper.readValue(response, ResultInfo.class);
		if (info.isSuccess()) {

			return (List) info.getMsg();
		} else {

			return new ArrayList();
		}

	}

	@Override
	public String edit(Map<String, String> params) throws Exception {
		return sywmClient.post(SYWMStorageRacksPath.Edit, params);
	}

	@Override
	public void addToAreas(Map<String, String> params) throws Exception {
		sywmClient.post(SYWMStorageRacksPath.AddToAreas, params);
	}

	@Override
	public void update(Map<String, String> params) throws Exception {
		sywmClient.post(SYWMStorageRacksPath.Update, params);
	}

	@Override
	public String selectAllRacks(Map<String, String> params) throws Exception {
		String filterString = "[\"storageRacksId\",{\"storageAreas\":[\"areasColor\"]},\"storageRacksType\"]";
		params.put("filterString", filterString);
		return sywmClient.post(SYWMStorageRacksPath.SelectAllRacks, params);
	}
}

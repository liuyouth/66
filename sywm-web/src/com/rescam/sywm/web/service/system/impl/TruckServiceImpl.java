package com.rescam.sywm.web.service.system.impl;

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
import com.rescam.sywm.rs.path.system.SYWMTruckPath;
import com.rescam.sywm.web.service.system.TruckService;

@Service
@Scope("prototype")
public class TruckServiceImpl implements TruckService {

	@Autowired
	private Client sywmClient;

	@Override
	public void setUid(Integer uid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Map<String, String> params) throws Exception {
		sywmClient.post(SYWMTruckPath.Add, params);

	}

	@Override
	public String unique(Map<String, String> params) throws Exception {
		String response = sywmClient.post(SYWMTruckPath.Unique, params);
		return response;
	}

	@Override
	public Long count(Map<String, String> params) throws Exception {
		String response = sywmClient.post(SYWMTruckPath.Count, params);
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
	public List<Map<String, String>> search(Map<String, String> params) throws Exception {
		String response = sywmClient.post(SYWMTruckPath.Search, params);
		ObjectMapper objectMapper = new ObjectMapper();
		ResultInfo info = new ResultInfo();
		info = objectMapper.readValue(response, ResultInfo.class);
		if (info.isSuccess()) {

			@SuppressWarnings("unchecked")
			List<Map<String, String>> msg = (List<Map<String, String>>) info.getMsg();
			return msg;
		} else {

			return new ArrayList<Map<String, String>>();
		}

	}

	@Override
	public void del(String truckId) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("truckId", truckId);
		sywmClient.post(SYWMTruckPath.Del, map);

	}

}

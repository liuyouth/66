package com.rescam.sywm.web.service.goodsOwner.impl;

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
import com.rescam.sywm.rs.path.goodsOwner.SYWMGoodsOwnerPath;
import com.rescam.sywm.web.service.goodsOwner.GoodsOwnerService;

@Service
@Scope("prototype")
public class GoodsOwnerServiceImpl implements GoodsOwnerService {

	@Autowired
	private Client sywmClient;

	@Override
	public void setUid(Integer uid) {
		// TODO Auto-generated method stub

	}

	@Override
	public String unique(Map<String, String> params) throws Exception {
		String response = sywmClient.post(SYWMGoodsOwnerPath.Unique, params);
		return response;
	}

	@Override
	public void add(Map<String, String> params) throws Exception {
		sywmClient.post(SYWMGoodsOwnerPath.Add, params);

	}

	@Override
	public Long count(Map<String, String> params) throws Exception {
		String response = sywmClient.post(SYWMGoodsOwnerPath.Count, params);
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
		String response = sywmClient.post(SYWMGoodsOwnerPath.Search, params);
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
	public void del(String goodsOwnerId) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("goodsOwnerId", goodsOwnerId);
		sywmClient.post(SYWMGoodsOwnerPath.Del, map);

	}

	@Override
	public String read(Map<String, String> params) throws Exception {
		String response = sywmClient.post(SYWMGoodsOwnerPath.Read, params);
		return response;
	}

	@Override
	public String updata(Map<String, String> params) throws Exception {
		String response = sywmClient.post(SYWMGoodsOwnerPath.Update, params);
		return response;
	}

}

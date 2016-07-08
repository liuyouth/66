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
import com.rescam.sywm.rs.path.warehouse.SYWMGoodsLocatorPath;
import com.rescam.sywm.web.service.warehouse.GoodsLocatorService;

@Service()
@Scope("prototype")
public class GoodsLocatorServiceImpl extends BaseServiceImpl implements GoodsLocatorService {

	@Autowired
	private Client sywmClient;

	@Override
	public long count(String searchParam) throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("searchParam", searchParam);
		String response = sywmClient.post(SYWMGoodsLocatorPath.Count, params);
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
		String filterString = "[\"locatorCode\",\"locatorType\",\"maxStorageWeight\",\"palletsContainingCount\",\"isEnable\",\"goodsLocatorId\"]";
		Map<String, String> params = new HashMap<String, String>();
		params.put("page", String.valueOf(page));
		params.put("length", String.valueOf(length));
		params.put("searchParam", searchParam);
		params.put("filterString", filterString);
		String response = sywmClient.post(SYWMGoodsLocatorPath.Search, params);
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
		return sywmClient.post(SYWMGoodsLocatorPath.Edit, params);
	}

	@Override
	public void update(Map<String, String> params) throws Exception {
		sywmClient.post(SYWMGoodsLocatorPath.Update, params);
	}
}

package com.rescam.sywm.web.service.commodityBase.impl;

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
import com.rescam.sywm.rs.path.commodityBase.SYWMBrandPath;
import com.rescam.sywm.web.service.commodityBase.BrandService;

@Service
@Scope("prototype")
public class BrandServiceImpl extends BaseServiceImpl implements BrandService {

	@Autowired
	private Client sywmClient;

	@Override
	public void add(Map<String, String> params) throws Exception {
		sywmClient.post(SYWMBrandPath.Add, params);

	}

	@Override
	public String read(Map<String, String> params) throws Exception {
		// String response = sywmClient.post(SYWMBrandPath.Search);
		String response = sywmClient.post(SYWMBrandPath.Read, params);
		return response;
	}

	@Override
	public Long count(Map<String, String> params) throws Exception {

		String response = sywmClient.post(SYWMBrandPath.Count, params);
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
		String response = sywmClient.post(SYWMBrandPath.Search, params);
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
	public void del(String brandsId) throws Exception {

		Map<String, String> map = new HashMap<String, String>();
		map.put("brandsId", brandsId);
		sywmClient.post(SYWMBrandPath.Del, map);

	}

	@Override
	public String unique(Map<String, String> params) throws Exception {

		String response = sywmClient.post(SYWMBrandPath.Unique, params);
		return response;
	}

	@Override
	public String updata(Map<String, String> params) throws Exception {

		String response = sywmClient.post(SYWMBrandPath.Updata, params);
		return response;

	}

	@Override
	public String queryKV() throws Exception {
		return sywmClient.post(SYWMBrandPath.Kv);
	}

}
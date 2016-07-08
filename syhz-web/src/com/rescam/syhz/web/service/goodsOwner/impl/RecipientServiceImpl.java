package com.rescam.syhz.web.service.goodsOwner.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rescam.common.rs.Client;
import com.rescam.common.vo.ResultInfo;
import com.rescam.common.web.service.impl.BaseServiceImpl;
import com.rescam.syhz.web.service.goodsOwner.RecipientService;
import com.rescam.sywm.rs.path.goodsOwner.SYWMRecipientPath;

@Service()
@Scope("prototype")
public class RecipientServiceImpl extends BaseServiceImpl implements
		RecipientService {
	@Autowired
	private Client sywmClient;

	@Override
	public long count(Map<String, String> params) throws Exception {
		String response = sywmClient.post(SYWMRecipientPath.Count, params);
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
	public List<Map<String, String>> search(Map<String, String> params)
			throws Exception {

		String response = sywmClient.post(SYWMRecipientPath.Search, params);
		ObjectMapper objectMapper = new ObjectMapper();
		ResultInfo info = new ResultInfo();
		info = objectMapper.readValue(response, ResultInfo.class);
		if (info.isSuccess()) {

			@SuppressWarnings("unchecked")
			List<Map<String, String>> msg = (List<Map<String, String>>) info
					.getMsg();
			return msg;
		} else {

			return new ArrayList<Map<String, String>>();
		}

	}

	@Override
	public String read(Map<String, String> params) throws Exception {

		String response = sywmClient.post(SYWMRecipientPath.Read, params);

		return response;
	}

	@Override
	public String delete(Map<String, String> params) throws Exception {

		String response = sywmClient.post(SYWMRecipientPath.Delete, params);

		return response;
	}

	@Override
	public String add(Map<String, String> params) throws Exception {

		String response = sywmClient.post(SYWMRecipientPath.Add, params);

		return response;
	}

	@Override
	public String update(Map<String, String> params) throws Exception {

		String response = sywmClient.post(SYWMRecipientPath.Update, params);

		return response;
	}

	@Override
	public String unique(Map<String, String> params) throws Exception {

		String response = sywmClient.post(SYWMRecipientPath.Unique, params);

		return response;
	}
}

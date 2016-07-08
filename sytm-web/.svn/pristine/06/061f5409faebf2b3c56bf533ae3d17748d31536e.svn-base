package com.rescam.sytm.web.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.rescam.common.rs.Client;
import com.rescam.common.web.service.impl.BaseServiceImpl;
import com.rescam.sytm.web.service.SampleService;
import com.rescam.sywm.rs.path.SYWMSamplePath;

@Service
@Scope("prototype")
public class SampleServiceImpl extends BaseServiceImpl implements SampleService {

	@Autowired
	private Client sywmClient;

	@Override
	public void search() throws Exception {
		sywmClient.post(SYWMSamplePath.Search);
	}

	@Override
	public void add() throws Exception {
		sywmClient.post(SYWMSamplePath.Add, "{\"userId\":0}");
	}

	@Override
	public void save(Map<String, String> map) throws Exception {
		sywmClient.post(SYWMSamplePath.Add, map);
	}

}

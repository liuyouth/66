package com.rescam.sytm.web.service;

import java.util.Map;

import com.rescam.common.web.service.BaseService;

public interface SampleService extends BaseService {

	public void search() throws Exception;

	public void add() throws Exception;

	public void save(Map<String, String> map) throws Exception;

}

package com.rescam.sywm.web.service.system;

import java.util.List;
import java.util.Map;

import com.rescam.common.web.service.BaseService;

public interface TruckService extends BaseService {

	public void add(Map<String, String> params) throws Exception;

	public String unique(Map<String, String> params) throws Exception;

	public Long count(Map<String, String> params) throws Exception;

	public List<Map<String, String>> search(Map<String, String> params) throws Exception;

	public void del(String truckId) throws Exception;

}
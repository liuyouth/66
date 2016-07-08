package com.rescam.sywm.web.service.warehouse;

import java.util.List;
import java.util.Map;

import com.rescam.common.web.service.BaseService;

public interface StorageRacksService extends BaseService {

	public long count(String searchParam) throws Exception;

	public List search(int page, int length, String searchParam) throws Exception;

	public String edit(Map<String, String> params) throws Exception;

	public void addToAreas(Map<String, String> params) throws Exception;

	public void update(Map<String, String> params) throws Exception;

	public String selectAllRacks(Map<String, String> params) throws Exception;
}

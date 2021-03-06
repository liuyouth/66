package com.rescam.sywm.web.service.commodityBase;

import java.util.List;
import java.util.Map;

import com.rescam.common.web.service.BaseService;

public interface CommodityPackingService extends BaseService {
	long count(Map<String, String> params) throws Exception;

	List<Map<String, String>> search(Map<String, String> params)
			throws Exception;

	String delete(Map<String, String> param) throws Exception;

	String add(Map<String, String> params) throws Exception;

}

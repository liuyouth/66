package com.rescam.sywm.web.service.commodityBase;

import java.util.Map;

import com.rescam.common.web.service.BaseService;

public interface CommodityTypeService extends BaseService {

	public String queryTree() throws Exception;

	public String read(String commodityTypeId) throws Exception;

	public void add(Map<String, String> params) throws Exception;

	public void update(Map<String, String> params) throws Exception;

	public void delete(String commodityTypeId) throws Exception;

	public String uniqueCommodityTypeName(Map<String, String> params) throws Exception;

	public String uniqueCommodityTypeCode(Map<String, String> params) throws Exception;
}

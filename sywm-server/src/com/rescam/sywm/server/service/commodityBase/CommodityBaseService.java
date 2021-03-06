package com.rescam.sywm.server.service.commodityBase;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.rescam.sywm.server.entity.CommodityBase;

public interface CommodityBaseService {

	Long getCount(Map<String, String> params) throws Exception;

	List<CommodityBase> search(Map<String, String> params) throws Exception;

	CommodityBase read(Map<String, String> params) throws Exception;

	void delete(String commodityBaseId) throws Exception;

	Serializable add(CommodityBase commodityBase);

	Boolean update(Map<String, Object> params) throws Exception;

	Boolean unique(Map<String, String> params) throws Exception;
}

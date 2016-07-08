package com.rescam.sywm.server.service.warehouse.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rescam.common.server.dao.BaseDAO;
import com.rescam.sywm.server.entity.GoodsLocator;
import com.rescam.sywm.server.service.warehouse.GoodsLocatorService;

@Service
public class GoodsLocatorServiceImpl implements GoodsLocatorService {

	@Autowired
	private BaseDAO<GoodsLocator> GoodsLocatorDAO;

	@Override
	public Long getCount(Map<String, String> params) throws Exception {
		String hql = "select count(1) from GoodsLocator ";
		String searchParam = params.get("searchParam");
		if (searchParam != null & searchParam != "") {
			hql += "where locatorCode like '%" + searchParam + "%' ";
		}

		return GoodsLocatorDAO.count(hql);
	}

	@Override
	public List<GoodsLocator> search(Map<String, String> params) throws Exception {
		String hql = "from GoodsLocator ";
		String searchParam = params.get("searchParam");
		int page = Integer.valueOf((params.get("page")));
		int rows = Integer.valueOf((params.get("length")));
		if (searchParam != null & searchParam != "") {
			hql += "where locatorCode like '%" + searchParam + "%' ";
		}

		return GoodsLocatorDAO.find(hql, new Object[0], page, rows);
	}

	@Override
	public GoodsLocator edit(Integer goodsLocatorId) throws Exception {
		GoodsLocator goodsLocator = GoodsLocatorDAO.get(GoodsLocator.class, goodsLocatorId);
		return goodsLocator;
	}

	@Override
	@Transactional
	public void update(Map<String, String> params) throws Exception {

		GoodsLocator goodsLocator = GoodsLocatorDAO.get(GoodsLocator.class,
				Integer.valueOf(params.get("goodsLocatorId")));

		BeanUtils.populate(goodsLocator, params);

		GoodsLocatorDAO.update(goodsLocator);
	}

}

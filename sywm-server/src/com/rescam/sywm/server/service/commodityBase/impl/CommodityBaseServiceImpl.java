package com.rescam.sywm.server.service.commodityBase.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rescam.common.server.dao.BaseDAO;
import com.rescam.common.server.util.EntityUtils;
import com.rescam.sywm.server.entity.Brands;
import com.rescam.sywm.server.entity.CommodityBase;
import com.rescam.sywm.server.service.commodityBase.CommodityBaseService;

@Transactional
@Service()
public class CommodityBaseServiceImpl implements CommodityBaseService {
	@Resource
	BaseDAO<CommodityBase> dao;
	@Resource
	BaseDAO<Brands> daoBrands;

	@Override
	public Long getCount(Map<String, String> params) throws Exception {
		String hql = "select count(1) from CommodityBase where isDelete = 0 ";
		String searchKey = params.get("searchKey");
		if (searchKey != null & searchKey != "") {
			hql += "and (commodityName like '%" + searchKey
					+ "%' or commodityBarcode like '%" + searchKey + "%') ";
		}
		/* hql += " order by commodityBaseId desc "; */
		return dao.count(hql);
	}

	@Override
	public List<CommodityBase> search(Map<String, String> params)
			throws Exception {
		String hql = "from CommodityBase  where isDelete = 0 ";
		String searchKey = params.get("searchKey");
		int page = Integer.valueOf((params.get("page")));
		int rows = Integer.valueOf((params.get("length")));
		if (searchKey != null & searchKey != "") {
			hql += "and (commodityName like '%" + searchKey
					+ "%' or commodityBarcode like '%" + searchKey + "%') ";
		}

		/* hql += " order by commodityBaseId desc "; */
		return dao.find(hql, new Object[0], page, rows);
	}

	@Override
	public CommodityBase read(Map<String, String> params) throws Exception {

		return dao.get(CommodityBase.class,
				Integer.valueOf(params.get("commodityBaseId")));

	}

	@Override
	public void delete(String id) {

		CommodityBase CommodityBase = dao.get(CommodityBase.class,
				Integer.valueOf(id));

		CommodityBase.setIsDelete(true);

		dao.update(CommodityBase);
	}

	@Override
	public Serializable add(CommodityBase commodityBase) {
		Brands brands;
		brands = daoBrands.get(Brands.class, commodityBase.getBrands()
				.getBrandsId());
		commodityBase.setBrands(brands);
		commodityBase.setBrandsCode(brands.getBrandsCode());
		commodityBase.setBrandsName(brands.getBrandsName());
		Serializable serializable = dao.save(commodityBase);

		return serializable;

	}

	@Override
	@Transactional
	public Boolean update(Map<String, Object> params) throws Exception {

		Boolean result = false;
		CommodityBase commodityBase = dao.get(CommodityBase.class,
				Integer.valueOf(params.get("commodityBaseId").toString()));

		EntityUtils.populate(commodityBase, params);

		dao.update(commodityBase);
		result = true;
		return result;
	}

	@Override
	public Boolean unique(Map<String, String> params) throws Exception {
		Boolean flg = true;
		String param = params.get("param");
		String hql = "from CommodityBase ";
		List<CommodityBase> list = dao.find(hql);
		for (int i = 0; i < list.size(); i++) {
			CommodityBase commodityBase = list.get(i);
			if (commodityBase.getCommodityBarcode().equals(param)) {
				flg = false;
				break;
			}
		}
		return flg;
	}
}
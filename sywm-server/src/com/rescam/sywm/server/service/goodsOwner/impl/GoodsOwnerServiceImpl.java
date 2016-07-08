package com.rescam.sywm.server.service.goodsOwner.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rescam.common.server.dao.BaseDAO;
import com.rescam.common.server.util.EntityUtils;
import com.rescam.sywm.server.entity.GoodsOwner;
import com.rescam.sywm.server.service.goodsOwner.GoodsOwnerService;

@Service
@Transactional
public class GoodsOwnerServiceImpl implements GoodsOwnerService {

	@Autowired
	private BaseDAO<GoodsOwner> dao;

	@Override
	public boolean unique(Map<String, String> params) throws Exception {
		Boolean flg = true;
		String goodsOwnerName = params.get("param");
		String hql = "from GoodsOwner ";
		List<GoodsOwner> list = dao.find(hql);
		for (int i = 0; i < list.size(); i++) {
			GoodsOwner goodsOwner = list.get(i);
			if (goodsOwner.getGoodsOwnerName().equals(goodsOwnerName)) {
				flg = false;
				break;
			}
		}
		return flg;
	}

	@Override
	public void addGoodsOwner(GoodsOwner goodsOwner) throws Exception {
		dao.save(goodsOwner);

	}

	@Override
	public Long getCount(Map<String, String> params) throws Exception {
		String hql = "select count(1) from GoodsOwner";
		String goodsOwnerName = params.get("searchCode");
		if (goodsOwnerName != null & goodsOwnerName != "") {
			hql = "select count(1) from GoodsOwner where goodsOwnerName like '%" + goodsOwnerName + "%'";
		}
		return dao.count(hql);
	}

	@Override
	public List<GoodsOwner> search(Map<String, String> params) throws Exception {
		String hql = "from GoodsOwner ORDER BY isEnable DESC";
		String searchCode = params.get("searchCode");
		int page = Integer.valueOf((params.get("page")));
		int rows = Integer.valueOf((params.get("length")));
		if (searchCode != null & searchCode != "") {
			hql = "from GoodsOwner where goodsOwnerName like '%" + searchCode + "%' ORDER BY isEnable DESC ";
		}

		return dao.find(hql, new Object[0], page, rows);
	}

	@Override
	public void del(Map<String, String> params) throws Exception {
		GoodsOwner goodsOwner = dao.get(GoodsOwner.class, Integer.valueOf(params.get("goodsOwnerId")));

		goodsOwner.setIsEnable(false);

		dao.update(goodsOwner);

	}

	@Override
	public GoodsOwner read(Map<String, String> params) throws Exception {
		Integer id = Integer.valueOf(params.get("goodsOwnerId"));
		return dao.get(GoodsOwner.class, id);
	}

	@Override
	public boolean update(Map<String, String> params) throws Exception {
		Integer goodsOwnerId = Integer.valueOf(params.get("goodsOwnerId"));
		Boolean result = false;
		GoodsOwner goodsOwner = dao.get(GoodsOwner.class, goodsOwnerId);

		EntityUtils.populate(goodsOwner, params);

		dao.update(goodsOwner);
		result = true;
		return result;
	}

}

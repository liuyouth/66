package com.rescam.sywm.server.service.commodityBase.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rescam.common.server.dao.BaseDAO;
import com.rescam.sywm.server.entity.Brands;
import com.rescam.sywm.server.service.commodityBase.BrandService;
import com.rescam.sywm.server.vo.OptionKV;

@Transactional
@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BaseDAO<Brands> dao;

	@Override
	public void addBrand(Brands brands) {

		dao.save(brands);
	}

	@Override
	public Long getCount(Map<String, String> params) throws Exception {
		String hql = "select count(1) from Brands where isDelete = 0";
		String brandsId = params.get("searchCode");
		if (brandsId != null & brandsId != "") {
			hql = "select count(1) from Brands where isDelete = false and brandsName like '%" + brandsId
					+ "%' or isDelete = false and brandsCode like '%" + brandsId + "%' ";
		}
		return dao.count(hql);
	}

	@Override
	public List<Brands> search(Map<String, String> params) throws Exception {
		String hql = "from Brands where isDelete = 0";
		String searchCode = params.get("searchCode");
		int page = Integer.valueOf((params.get("page")));
		int rows = Integer.valueOf((params.get("length")));
		if (searchCode != null & searchCode != "") {

			hql = " from Brands where isDelete = false and brandsName like '%" + searchCode
					+ "%' or isDelete = false and brandsCode like '%" + searchCode + "%' ";

		}

		return dao.find(hql, new Object[0], page, rows);
	}

	@Override
	public void del(Map<String, String> params) throws Exception {

		Brands brands = dao.get(Brands.class, Integer.valueOf(params.get("brandsId")));

		brands.setIsDelete(true);

		dao.update(brands);
	}

	@Override
	public boolean unique(Map<String, String> params) throws Exception {
		Boolean flg = true;
		String brandsName = params.get("param");
		String hql = "from Brands ";
		List<Brands> list = dao.find(hql);
		for (int i = 0; i < list.size(); i++) {
			Brands brands = list.get(i);
			if (brands.getBrandsName().equals(brandsName)) {
				flg = false;
				break;
			}
		}
		return flg;
	}

	@Override
	public void updata(Brands brands) throws Exception {

		dao.update(brands);

	}

	@Override
	public List<OptionKV> queryKV() throws Exception {
		List<OptionKV> result = new ArrayList<OptionKV>();

		String hql = "from Brands where isDelete = 0 ";
		List<Brands> brandslists = dao.find(hql);

		for (Brands brandslist : brandslists) {

			OptionKV option = new OptionKV();
			option.setText(brandslist.getBrandsName());
			option.setValue(brandslist.getBrandsId());

			result.add(option);
		}
		return result;
	}

	@Override
	public Brands read(Map<String, String> params) throws Exception {

		Integer id = Integer.valueOf(params.get("brandsId"));
		return dao.get(Brands.class, id);
	}

}

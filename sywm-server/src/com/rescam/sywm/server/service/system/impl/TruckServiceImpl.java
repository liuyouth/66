package com.rescam.sywm.server.service.system.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rescam.common.server.dao.BaseDAO;
import com.rescam.sywm.server.entity.Truck;
import com.rescam.sywm.server.service.system.TruckService;

@Transactional
@Service
public class TruckServiceImpl implements TruckService {

	@Autowired
	private BaseDAO<Truck> dao;

	@Override
	public void addTruck(Truck truck) throws Exception {
		dao.save(truck);

	}

	@Override
	public boolean unique(Map<String, String> params) throws Exception {
		Boolean flg = true;
		String truckNumber = params.get("param");
		String hql = "from Truck ";
		List<Truck> list = dao.find(hql);
		for (int i = 0; i < list.size(); i++) {
			Truck truck = list.get(i);
			if (truck.getTruckNumber().equals(truckNumber)) {
				flg = false;
				break;
			}
		}
		return flg;
	}

	@Override
	public Long getCount(Map<String, String> params) throws Exception {
		String hql = "select count(1) from Truck where isDelete = false";
		String truckNumber = params.get("searchCode");
		if (truckNumber != null & truckNumber != "") {
			hql = "select count(1) from Truck where isDelete = false and truckNumber like '%" + truckNumber + "%' ";
		}
		return dao.count(hql);
	}

	@Override
	public List<Truck> search(Map<String, String> params) throws Exception {
		String hql = "from Truck where isDelete = 0";
		String searchCode = params.get("searchCode");
		int page = Integer.valueOf((params.get("page")));
		int rows = Integer.valueOf((params.get("length")));
		if (searchCode != null & searchCode != "") {
			hql = "from Truck where isDelete = false and truckNumber like '%" + searchCode + "%' ";
		}

		return dao.find(hql, new Object[0], page, rows);
	}

	@Override
	public void del(Map<String, String> params) throws Exception {
		Truck truck = dao.get(Truck.class, Integer.valueOf(params.get("truckId")));

		truck.setIsDelete(true);

		dao.update(truck);

	}

}

package com.rescam.sywm.server.service.system.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rescam.common.server.dao.BaseDAO;
import com.rescam.common.server.util.EntityUtils;
import com.rescam.sywm.server.entity.Driver;
import com.rescam.sywm.server.service.system.DriverService;

@Transactional
@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private BaseDAO<Driver> dao;

	@Override
	public void addDriver(Driver driver) throws Exception {

		dao.save(driver);
	}

	@Override
	public boolean unique(Map<String, String> params) throws Exception {
		Boolean flg = true;
		String loginName = params.get("param");
		String hql = "from Driver ";
		List<Driver> list = dao.find(hql);
		for (int i = 0; i < list.size(); i++) {
			Driver driver = list.get(i);
			if (driver.getLoginName().equals(loginName)) {
				flg = false;
				break;
			}
		}
		return flg;
	}

	@Override
	public Long getCount(Map<String, String> params) throws Exception {
		String hql = "select count(1) from Driver where isDelete = false";
		String loginName = params.get("searchCode");
		if (loginName != null & loginName != "") {
			hql = "select count(1) from Driver where isDelete = false and loginName like '%" + loginName + "%' "
					+ " or isDelete = false and driverName like '%" + loginName + "%'";
		}
		return dao.count(hql);
	}

	@Override
	public List<Driver> search(Map<String, String> params) throws Exception {
		String hql = "from Driver where isDelete = 0";
		String searchCode = params.get("searchCode");
		int page = Integer.valueOf((params.get("page")));
		int rows = Integer.valueOf((params.get("length")));
		if (searchCode != null & searchCode != "") {
			hql = "from Driver where isDelete = false and loginName like '%" + searchCode + "%' "
					+ " or isDelete = false and driverName like '%" + searchCode + "%'";
		}

		return dao.find(hql, new Object[0], page, rows);
	}

	@Override
	public void del(Map<String, String> params) throws Exception {
		Driver driver = dao.get(Driver.class, Integer.valueOf(params.get("driverId")));

		driver.setIsDelete(true);

		dao.update(driver);

	}

	@Override
	public Driver read(Map<String, String> params) throws Exception {
		Integer id = Integer.valueOf(params.get("driverId"));
		return dao.get(Driver.class, id);
	}

	@Override
	public boolean update(Map<String, String> params) throws Exception {

		Integer driverId = Integer.valueOf(params.get("driverId"));
		Boolean result = false;
		Driver driver = dao.get(Driver.class, driverId);

		EntityUtils.populate(driver, params);

		dao.update(driver);
		result = true;
		return result;

	}

}

package com.rescam.sywm.server.service.commodityBase.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rescam.common.server.dao.BaseDAO;
import com.rescam.common.server.util.EntityUtils;
import com.rescam.common.vo.ResultInfo;
import com.rescam.sywm.server.entity.CommodityType;
import com.rescam.sywm.server.service.commodityBase.CommodityTypeService;
import com.rescam.sywm.server.vo.ZTreeNode;

@Service
public class CommodityTypeServiceImpl implements CommodityTypeService {

	@Autowired
	private BaseDAO<CommodityType> commodityTypeDAO;

	@Override
	public ZTreeNode queryTree() throws Exception {

		CommodityType commodityType = commodityTypeDAO.get("from CommodityType where commodityTypeId = 1",
				new Object[] {});

		ZTreeNode root = new ZTreeNode();
		root.setId(commodityType.getCommodityTypeId());
		root.setpId(commodityType.getCommodityTypeParentId());
		root.setName(commodityType.getCommodityTypeName());
		root.setOpen(true);

		List<ZTreeNode> children = getNodeChildren(root);

		root.setChildren(children);

		return root;
	}

	private List<ZTreeNode> getNodeChildren(ZTreeNode node) {

		List<ZTreeNode> rootChildren = new ArrayList<ZTreeNode>();

		String hql = "from CommodityType where commodityTypeParentId = ? and isDelete = 0";
		List<CommodityType> CommodityTypeList = commodityTypeDAO.find(hql, new Object[] { node.getId() });

		for (CommodityType commodityType : CommodityTypeList) {

			ZTreeNode child = new ZTreeNode();
			child.setId(commodityType.getCommodityTypeId());
			child.setpId(commodityType.getCommodityTypeParentId());
			child.setName(commodityType.getCommodityTypeCode() + " " + commodityType.getCommodityTypeName());
			child.setOpen(true);

			List<ZTreeNode> children = getNodeChildren(child);

			child.setChildren(children);

			rootChildren.add(child);
		}

		return rootChildren;
	}

	@Override
	public CommodityType read(Map<String, String> params) throws Exception {

		return commodityTypeDAO.get(CommodityType.class, Integer.valueOf(params.get("commodityTypeId")));
	}

	@Override
	@Transactional
	public void add(CommodityType commodityType) throws Exception {

		commodityTypeDAO.save(commodityType);
	}

	@Override
	@Transactional
	public void update(Map<String, String> params) throws Exception {

		CommodityType commodityType = commodityTypeDAO.get(CommodityType.class,
				Integer.valueOf(params.get("commodityTypeId")));

		EntityUtils.populate(commodityType, params);

		commodityTypeDAO.update(commodityType);
	}

	@Override
	@Transactional
	public void delete(Map<String, String> params) throws Exception {

		CommodityType commodityType = commodityTypeDAO.get(CommodityType.class,
				Integer.valueOf(params.get("commodityTypeId")));

		commodityType.setIsDelete(true);

		commodityTypeDAO.update(commodityType);
	}

	@Override
	public ResultInfo uniqueCommodityTypeName(Map<String, String> params) throws Exception {

		ResultInfo info = new ResultInfo();

		String hql = "from CommodityType where commodityTypeName = ? and isDelete = 0";
		CommodityType commodityType = commodityTypeDAO.get(hql, new Object[] { params.get("param") });

		if (commodityType != null) {

			info.setSuccess(false);
		} else {

			info.setSuccess(true);
		}

		return info;
	}

	@Override
	public ResultInfo uniqueCommodityTypeCode(Map<String, String> params) throws Exception {

		ResultInfo info = new ResultInfo();

		String hql = "from CommodityType where commodityTypeCode = ? and isDelete = 0";
		CommodityType commodityType = commodityTypeDAO.get(hql, new Object[] { params.get("param") });

		if (commodityType != null) {

			info.setSuccess(false);
		} else {

			info.setSuccess(true);
		}

		return info;
	}
}

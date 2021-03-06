package com.rescam.sywm.server.service.goodsOwner.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rescam.common.server.dao.BaseDAO;
import com.rescam.common.server.util.EntityUtils;
import com.rescam.sywm.server.entity.GoodsOwner;
import com.rescam.sywm.server.entity.Recipient;
import com.rescam.sywm.server.service.goodsOwner.RecipientService;

@Transactional
@Service()
public class RecipientServiceImpl implements RecipientService {
	@Resource
	BaseDAO<Recipient> dao;

	@Override
	public Long getCount(Map<String, String> params) throws Exception {
		String hql = "select count(1) from Recipient ";
		String searchKey = params.get("searchKey");
		if (searchKey != null & searchKey != "") {
			hql += "where recipientCode like '%" + searchKey + "%' or recipientName like '%" + searchKey + "%' ";
		}
		/* hql += " order by recipientId desc "; */
		return dao.count(hql);
	}

	@Override
	public List<Recipient> search(Map<String, String> params) throws Exception {
		String hql = "from Recipient ";
		String searchKey = params.get("searchKey");
		int page = Integer.valueOf((params.get("page")));
		int rows = Integer.valueOf((params.get("length")));
		if (searchKey != null & searchKey != "") {
			hql += "where recipientCode like '%" + searchKey + "%' or recipientName like '%" + searchKey + "%' ";
		}
		/* hql += " order by recipientId desc "; */
		return dao.find(hql, new Object[0], page, rows);
	}

	@Override
	public Recipient read(Map<String, String> params) throws Exception {
		Integer id = Integer.valueOf(params.get("recipientId"));
		return dao.get(Recipient.class, id);

	}

	@Override
	public void delete(String id) {
		String hql = "delete from Recipient where recipientId = " + id;
		dao.executeHql(hql);
	}

	@Override
	public Serializable add(Recipient recipient) {
		GoodsOwner goodsOwner = new GoodsOwner();
		goodsOwner.setGoodsOwnerId(1);
		recipient.setGoodsOwner(goodsOwner);
		// 以上代码为临时数据正式时候需删除
		Serializable serializable = dao.save(recipient);

		return serializable;

	}

	@Override
	@Transactional
	public Boolean update(Map<String, Object> params) throws Exception {
		Recipient recipient = dao.get(Recipient.class, Integer.valueOf(params.get("recipientId").toString()));

		EntityUtils.populate(recipient, params);
		GoodsOwner goodsOwner = new GoodsOwner();
		goodsOwner.setGoodsOwnerId(1);
		recipient.setGoodsOwner(goodsOwner);
		// 以上代码为临时数据正式时候需删除
		Boolean result = false;
		dao.update(recipient);
		result = true;

		return result;
	}

	@Override
	public Boolean unique(Map<String, String> params) throws Exception {
		Boolean flg = true;
		String goodsOwnerId = params.get("goodsOwnerId");
		String recipientName = params.get("param");
		String hql = "from Recipient ";
		/*
		 * where goodsOwner.goodsOwnerId =" + goodsOwnerId
		 */
		List<Recipient> list = dao.find(hql);
		for (int i = 0; i < list.size(); i++) {
			Recipient recipient = list.get(i);
			if (recipient.getRecipientName().equals(recipientName)) {
				flg = false;
				break;
			}
		}
		return flg;
	}
}

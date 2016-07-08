package com.rescam.sywm.server.controller.warehouse;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rescam.common.server.util.EntityUtils;
import com.rescam.common.vo.ResultInfo;
import com.rescam.sywm.rs.uri.warehouse.SYWMGoodsLocatorURI;
import com.rescam.sywm.server.entity.GoodsLocator;
import com.rescam.sywm.server.service.warehouse.GoodsLocatorService;

@RestController
@RequestMapping(value = SYWMGoodsLocatorURI.Base, method = RequestMethod.POST)
public class GoodsLocatorController {

	@Resource
	GoodsLocatorService service;

	@RequestMapping(SYWMGoodsLocatorURI.Count)
	public ResultInfo getCount(@RequestParam Map<String, String> params) {
		ResultInfo result = new ResultInfo();
		try {
			Long count = service.getCount(params);
			result.setSuccess(true);
			result.setMsg(count);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setMsg("系统异常");
		}

		return result;
	}

	@RequestMapping(SYWMGoodsLocatorURI.Search)
	public ResultInfo search(@RequestParam Map<String, String> params) {
		ResultInfo result = new ResultInfo();
		try {
			List<GoodsLocator> list = service.search(params);
			String filterString = params.get("filterString");
			List<Map<String, Object>> list1 = EntityUtils.filter(list, filterString);
			result.setSuccess(true);
			result.setMsg(list1);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setMsg("系统异常");
		}

		return result;
	}

	@RequestMapping(SYWMGoodsLocatorURI.Edit)
	public ResultInfo edit(@RequestParam Integer goodsLocatorId) throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		try {
			GoodsLocator goodsLocator = service.edit(goodsLocatorId);
			resultInfo.setMsg(goodsLocator);
			resultInfo.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo.setMsg("系统错误！");
		}

		return resultInfo;
	}

	@RequestMapping(SYWMGoodsLocatorURI.Update)
	public void update(@RequestParam Map<String, String> params) throws Exception {

		service.update(params);
	}
}

package com.rescam.sywm.server.controller.commodityBase;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rescam.common.vo.ResultInfo;
import com.rescam.sywm.rs.uri.commodityBase.SYWMCommodityPackingURI;
import com.rescam.sywm.server.entity.CommodityPacking;
import com.rescam.sywm.server.service.commodityBase.CommodityPackingService;

@RestController
@RequestMapping(value = SYWMCommodityPackingURI.Base, method = RequestMethod.POST)
public class CommodityPackingController {
	@Resource
	CommodityPackingService service;

	/**
	 * 按条件查询数据列表数量
	 * 
	 * @throws Exception
	 */
	@RequestMapping(SYWMCommodityPackingURI.Count)
	public ResultInfo getCount(@RequestParam Map<String, String> params)
			throws Exception {
		ResultInfo result = new ResultInfo();

		Long count = service.getCount(params);
		result.setSuccess(true);
		result.setMsg(count);

		return result;
	}

	/**
	 * 按条件查询数据列表
	 * 
	 * @throws Exception
	 */
	@RequestMapping(SYWMCommodityPackingURI.Search)
	public ResultInfo search(@RequestParam Map<String, String> params)
			throws Exception {
		ResultInfo result = new ResultInfo();
		List<CommodityPacking> list = service.search(params);
		result.setSuccess(true);
		result.setMsg(list);

		return result;
	}

	@RequestMapping(SYWMCommodityPackingURI.Delete)
	public ResultInfo delete(@RequestParam Map<String, String> params,
			HttpServletRequest request) throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		service.delete(params.get("commodityPackingId"));
		resultInfo.setMsg("删除成功！");
		resultInfo.setSuccess(true);
		return resultInfo;
	}

	@RequestMapping(SYWMCommodityPackingURI.Add)
	public ResultInfo add(@ModelAttribute CommodityPacking commodityPacking) {
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setMsg(service.add(commodityPacking));
		resultInfo.setSuccess(true);
		return resultInfo;

	}

}

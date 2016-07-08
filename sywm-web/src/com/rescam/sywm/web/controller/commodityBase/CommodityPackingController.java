package com.rescam.sywm.web.controller.commodityBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rescam.common.vo.DataTableInfo;
import com.rescam.common.vo.ResultInfo;
import com.rescam.common.web.controller.BaseController;
import com.rescam.sywm.web.service.commodityBase.CommodityPackingService;
import com.rescam.sywm.web.util.MessageConst;

@RestController
@RequestMapping("commodityPacking")
@Scope("prototype")
public class CommodityPackingController extends BaseController {
	@Resource
	public CommodityPackingService service;

	/**
	 * 按条件查询数据列表
	 */
	@RequestMapping(value = "/search")
	public DataTableInfo search(@RequestParam Map<String, String> params,
			HttpServletRequest request) throws Exception {
		DataTableInfo dataTableInfo = new DataTableInfo();

		int draw = Integer.valueOf(params.get("draw"));
		// 当前第几页，datatables从0开始算第一页
		int start = Integer.valueOf(params.get("start"));
		// 每页显示的数据量
		int length = Integer.valueOf(params.get("length"));
		// 转换为page
		int page = start / length + 1;
		params.put("page", String.valueOf(page));
		// 保存返回数据
		dataTableInfo.setDraw(draw);
		// 数据量
		Long rows = service.count(params);
		if (rows == null || rows == 0) {
			dataTableInfo.setRecordsFiltered(0);
			dataTableInfo.setRecordsTotal(0);
			dataTableInfo.setData(new ArrayList<Object>());
			return dataTableInfo;
		}
		// 数据
		List<Map<String, String>> list = service.search(params);
		dataTableInfo.setData(list);
		dataTableInfo.setRecordsFiltered(rows);
		dataTableInfo.setRecordsTotal(rows);

		return dataTableInfo;

	}

	@RequestMapping("/add")
	public ResultInfo add(@RequestParam Map<String, String> params,
			HttpServletRequest request) {
		ResultInfo resultInfo = new ResultInfo();
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String result = service.add(params);
			resultInfo = objectMapper.readValue(result, ResultInfo.class);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = new ResultInfo();
			resultInfo.setMsg(MessageConst.OPERATE_FAIL);
		}
		return resultInfo;

	}

	// 批量删除
	@RequestMapping("/delete/{commodityPackingId}")
	public ResultInfo dels(
			@PathVariable("commodityPackingId") String commodityPackingId) {
		ResultInfo resultInfo;
		try {
			Map<String, String> params = new HashMap<String, String>();
			params.put("commodityPackingId", commodityPackingId);
			ObjectMapper objectMapper = new ObjectMapper();
			String result = service.delete(params);
			resultInfo = objectMapper.readValue(result, ResultInfo.class);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = new ResultInfo();
			resultInfo.setMsg(MessageConst.OPERATE_FAIL);
		}

		return resultInfo;
	}

}

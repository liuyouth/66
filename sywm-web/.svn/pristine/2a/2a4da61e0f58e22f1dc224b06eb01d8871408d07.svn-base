package com.rescam.sywm.web.controller.goodsOwner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rescam.common.vo.DataTableInfo;
import com.rescam.common.vo.ResultInfo;
import com.rescam.common.web.controller.BaseController;
import com.rescam.sywm.web.service.goodsOwner.GoodsOwnerService;
import com.rescam.sywm.web.util.MessageConst;
import com.rescam.sywm.web.vo.ValidInfo;

@RestController
@Scope("prototype")
@RequestMapping("goods_owner")
public class GoodsOwnerController extends BaseController {

	@Autowired
	private GoodsOwnerService goodsOwnerService;

	@RequestMapping("unique")
	public ValidInfo unique(@RequestParam Map<String, String> params) {
		ValidInfo info = new ValidInfo();
		ResultInfo resultInfo = new ResultInfo();
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			resultInfo = objectMapper.readValue(goodsOwnerService.unique(params), ResultInfo.class);
			if (resultInfo.isSuccess()) {

				info.setStatus("y");
				info.setInfo("");
			} else {

				info.setStatus("n");
				info.setInfo("该登录名已存在！");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			info.setStatus("n");
			info.setInfo("系统异常，请稍后再试！");
		}

		return info;
	}

	@RequestMapping("add")
	public ResultInfo addDriver(@RequestParam Map<String, String> params) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			goodsOwnerService.add(params);
			resultInfo.setMsg(MessageConst.OPERATE_SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo.setMsg(MessageConst.OPERATE_FAIL);
		}

		return resultInfo;

	}

	@RequestMapping("search")
	public DataTableInfo search(@RequestParam Map<String, String> params) throws Exception {
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
		Long rows = goodsOwnerService.count(params);
		if (rows == null || rows == 0) {
			dataTableInfo.setRecordsFiltered(0);
			dataTableInfo.setRecordsTotal(0);
			dataTableInfo.setData(new ArrayList<Object>());
			return dataTableInfo;
		}
		// 数据
		List<Map<String, String>> list = goodsOwnerService.search(params);
		dataTableInfo.setData(list);
		dataTableInfo.setRecordsFiltered(rows);
		dataTableInfo.setRecordsTotal(rows);

		return dataTableInfo;

	}

	@RequestMapping("del/{goodsOwnerId}")
	public ResultInfo del(@PathVariable("goodsOwnerId") String goodsOwnerId) {

		ResultInfo resultInfo = new ResultInfo();
		try {
			goodsOwnerService.del(goodsOwnerId);
			resultInfo.setSuccess(true);
			resultInfo.setMsg(MessageConst.OPERATE_SUCCESS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultInfo.setSuccess(false);
			resultInfo.setMsg(MessageConst.OPERATE_FAIL);
		}
		return resultInfo;

	}

	@RequestMapping("read/{goodsOwnerId}")
	public ResultInfo read(@PathVariable("goodsOwnerId") String goodsOwnerId) {

		ResultInfo resultInfo = new ResultInfo();
		try {
			Map<String, String> params = new HashMap<String, String>();
			params.put("goodsOwnerId", goodsOwnerId);
			ObjectMapper objectMapper = new ObjectMapper();
			String result = goodsOwnerService.read(params);
			resultInfo = objectMapper.readValue(result, ResultInfo.class);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = new ResultInfo();
			resultInfo.setMsg(MessageConst.OPERATE_FAIL);
		}
		return resultInfo;

	}

	@RequestMapping("updata")
	public ResultInfo updata(@RequestParam Map<String, String> params) {

		ResultInfo resultInfo = new ResultInfo();
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			resultInfo = objectMapper.readValue(goodsOwnerService.updata(params), ResultInfo.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultInfo.setMsg(MessageConst.OPERATE_FAIL);
		}
		return resultInfo;
	}

}

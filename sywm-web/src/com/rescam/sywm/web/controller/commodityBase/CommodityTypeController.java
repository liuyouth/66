package com.rescam.sywm.web.controller.commodityBase;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rescam.common.vo.ResultInfo;
import com.rescam.common.web.controller.BaseController;
import com.rescam.sywm.web.service.commodityBase.CommodityTypeService;
import com.rescam.sywm.web.util.MessageConst;
import com.rescam.sywm.web.vo.ValidInfo;

@RestController
@Scope("prototype")
@RequestMapping("commodityType")
public class CommodityTypeController extends BaseController {

	@Autowired
	private CommodityTypeService commodityTypeService;

	@RequestMapping("queryTree")
	public String queryTree() throws Exception {

		return commodityTypeService.queryTree();
	}

	@RequestMapping("read/{commodityTypeId}")
	public String read(@PathVariable("commodityTypeId") String commodityTypeId) throws Exception {

		return commodityTypeService.read(commodityTypeId);
	}

	@RequestMapping("add")
	public ResultInfo add(@RequestParam Map<String, String> params) throws Exception {

		ResultInfo info = new ResultInfo();

		try {

			commodityTypeService.add(params);
			info.setSuccess(true);
			info.setMsg(MessageConst.OPERATE_SUCCESS);
		} catch (Exception e) {

			e.printStackTrace();

			info.setSuccess(false);
			info.setMsg(MessageConst.OPERATE_FAIL);
		}
		return info;
	}

	@RequestMapping("update")
	public ResultInfo update(@RequestParam Map<String, String> params) throws Exception {

		ResultInfo info = new ResultInfo();

		try {

			commodityTypeService.update(params);
			info.setSuccess(true);
			info.setMsg(MessageConst.OPERATE_SUCCESS);
		} catch (Exception e) {

			e.printStackTrace();

			info.setSuccess(false);
			info.setMsg(MessageConst.OPERATE_FAIL);
		}
		return info;
	}

	@RequestMapping("delete/{commodityTypeId}")
	public ResultInfo delete(@PathVariable("commodityTypeId") String commodityTypeId) throws Exception {

		ResultInfo info = new ResultInfo();

		try {

			commodityTypeService.delete(commodityTypeId);
			info.setSuccess(true);
			info.setMsg(MessageConst.OPERATE_SUCCESS);
		} catch (Exception e) {

			e.printStackTrace();

			info.setSuccess(false);
			info.setMsg(MessageConst.OPERATE_FAIL);
		}
		return info;
	}

	@RequestMapping("unique/commodityTypeName")
	public ValidInfo uniqueCommodityTypeName(@RequestParam Map<String, String> params) throws Exception {

		ValidInfo info = new ValidInfo();

		try {

			String result = commodityTypeService.uniqueCommodityTypeName(params);

			ObjectMapper objectMapper = new ObjectMapper();
			ResultInfo resultInfo = objectMapper.readValue(result, ResultInfo.class);

			if (resultInfo.isSuccess()) {

				info.setStatus("y");
				info.setInfo("");
			} else {

				info.setStatus("n");
				info.setInfo("该分类名称已存在！");
			}
		} catch (Exception e) {

			e.printStackTrace();

			info.setStatus("n");
			info.setInfo("系统异常，请稍后再试！");
		}
		return info;
	}

	@RequestMapping("unique/commodityTypeCode")
	public ValidInfo uniqueCommodityTypeCode(@RequestParam Map<String, String> params) throws Exception {

		ValidInfo info = new ValidInfo();

		try {

			String result = commodityTypeService.uniqueCommodityTypeCode(params);

			ObjectMapper objectMapper = new ObjectMapper();
			ResultInfo resultInfo = objectMapper.readValue(result, ResultInfo.class);

			if (resultInfo.isSuccess()) {

				info.setStatus("y");
				info.setInfo("");
			} else {

				info.setStatus("n");
				info.setInfo("该分类编号已存在！");
			}
		} catch (Exception e) {

			e.printStackTrace();

			info.setStatus("n");
			info.setInfo("系统异常，请稍后再试！");
		}
		return info;
	}
}

package com.rescam.sywm.web.controller.warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rescam.common.vo.DataTableInfo;
import com.rescam.common.vo.ResultInfo;
import com.rescam.common.web.controller.BaseController;
import com.rescam.sywm.web.service.warehouse.StorageAreasService;
import com.rescam.sywm.web.util.MessageConst;
import com.rescam.sywm.web.vo.ValidInfo;

@RestController
@Scope("prototype")
@RequestMapping("storageAreas")
public class StorageAreasController extends BaseController {

	@Autowired
	private StorageAreasService storageAreasservice;

	@RequestMapping(value = "/search")
	public DataTableInfo search(@RequestParam Map<String, String> params, HttpServletRequest request) throws Exception {
		DataTableInfo dataTableInfo = new DataTableInfo();

		int draw = Integer.valueOf(params.get("draw"));
		// 当前第几页，datatables从0开始算第一页
		int start = Integer.valueOf(params.get("start"));
		// 每页显示的数据量
		int length = Integer.valueOf(params.get("length"));
		// 转换为page
		int page = start / length + 1;
		String searchParam = params.get("searchParam");
		// 模糊查询
		params.put("page", String.valueOf(page));
		// 保存返回数据
		dataTableInfo.setDraw(draw);
		// 数据量
		Long rows = storageAreasservice.count(searchParam);
		if (rows == null || rows == 0) {
			dataTableInfo.setRecordsFiltered(0);
			dataTableInfo.setRecordsTotal(0);
			dataTableInfo.setData(new ArrayList<Object>());
			return dataTableInfo;
		}
		// 数据
		List list = storageAreasservice.search(page, length, searchParam);
		dataTableInfo.setData(list);
		dataTableInfo.setRecordsFiltered(rows);
		dataTableInfo.setRecordsTotal(rows);

		return dataTableInfo;

	}

	@RequestMapping("unique")
	public ValidInfo uniqueStorageAreasName(@RequestParam Map<String, String> params) throws Exception {

		ValidInfo info = new ValidInfo();

		try {

			String result = storageAreasservice.uniqueStorageAreasName(params);

			ObjectMapper objectMapper = new ObjectMapper();
			ResultInfo resultInfo = objectMapper.readValue(result, ResultInfo.class);

			if (resultInfo.isSuccess()) {

				info.setStatus("y");
				info.setInfo("");
			} else {

				info.setStatus("n");
				info.setInfo("该库区名称已存在！");
			}
		} catch (Exception e) {

			e.printStackTrace();

			info.setStatus("n");
			info.setInfo("系统异常，请稍后再试！");
		}
		return info;
	}

	// 添加
	@RequestMapping("add")
	public ResultInfo add(@RequestParam Map<String, String> params) throws Exception {

		ResultInfo info = new ResultInfo();

		try {

			storageAreasservice.add(params);
			info.setSuccess(true);
			info.setMsg(MessageConst.OPERATE_SUCCESS);
		} catch (Exception e) {

			e.printStackTrace();

			info.setSuccess(false);
			info.setMsg(MessageConst.OPERATE_FAIL);
		}
		return info;
	}

	// 编辑
	@RequestMapping("edit")
	public String edit(@RequestParam Map<String, String> params) throws Exception {

		return storageAreasservice.edit(params);
	}

	// 修改
	@RequestMapping("update")
	public ResultInfo update(@RequestParam Map<String, String> params) throws Exception {

		ResultInfo info = new ResultInfo();

		try {

			storageAreasservice.update(params);
			info.setSuccess(true);
			info.setMsg(MessageConst.OPERATE_SUCCESS);
		} catch (Exception e) {

			e.printStackTrace();

			info.setSuccess(false);
			info.setMsg(MessageConst.OPERATE_FAIL);
		}
		return info;
	}

	@RequestMapping("kv")
	public String queryKV() throws Exception {

		return storageAreasservice.queryKV();
	}

	@RequestMapping("selectAllAreas")
	public String selectAllAreas(@RequestParam Map<String, String> params) throws Exception {

		return storageAreasservice.selectAllAreas(params);
	}
}

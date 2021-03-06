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
import com.rescam.sywm.rs.uri.warehouse.SYWMStorageRacksURI;
import com.rescam.sywm.server.entity.StorageRacks;
import com.rescam.sywm.server.service.warehouse.StorageRacksService;

@RestController
@RequestMapping(value = SYWMStorageRacksURI.Base, method = RequestMethod.POST)
public class StorageRacksController {
	@Resource
	StorageRacksService service;

	@RequestMapping(SYWMStorageRacksURI.Count)
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

	@RequestMapping(SYWMStorageRacksURI.Search)
	public ResultInfo search(@RequestParam Map<String, String> params) {
		ResultInfo result = new ResultInfo();
		try {
			List<StorageRacks> list = service.search(params);
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

	@RequestMapping(SYWMStorageRacksURI.Edit)
	public ResultInfo edit(@RequestParam Integer storageRacksId) throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		try {
			StorageRacks storageRacks = service.edit(storageRacksId);
			resultInfo.setMsg(storageRacks);
			resultInfo.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo.setMsg("系统错误！");
		}

		return resultInfo;
	}

	// 绑定库区
	@RequestMapping(SYWMStorageRacksURI.AddToAreas)
	public void addToAreas(@RequestParam Map<String, String> params) throws Exception {

		service.addToAreas(params);
	}

	@RequestMapping(SYWMStorageRacksURI.Update)
	public void update(@RequestParam Map<String, String> params) throws Exception {

		service.update(params);
	}

	@RequestMapping(SYWMStorageRacksURI.SelectAllRacks)
	public ResultInfo selectAllRacks(@RequestParam Map<String, String> params) {
		ResultInfo result = new ResultInfo();
		try {
			List<StorageRacks> list = service.selectAllRacks(params);
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

}

package com.rescam.sywm.server.controller.goodsOwner;

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
import com.rescam.sywm.rs.uri.goodsOwner.SYWMRecipientURI;
import com.rescam.sywm.server.entity.Recipient;
import com.rescam.sywm.server.service.goodsOwner.RecipientService;

@RestController
@RequestMapping(value = SYWMRecipientURI.Base, method = RequestMethod.POST)
public class RecipientController {
	@Resource
	RecipientService service;

	/**
	 * 按条件查询数据列表数量
	 * 
	 * @throws Exception
	 */
	@RequestMapping(SYWMRecipientURI.Count)
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
	@RequestMapping(SYWMRecipientURI.Search)
	public ResultInfo search(@RequestParam Map<String, String> params)
			throws Exception {
		ResultInfo result = new ResultInfo();
		List<Recipient> list = service.search(params);
		result.setSuccess(true);
		result.setMsg(list);

		return result;
	}

	@RequestMapping(SYWMRecipientURI.Read)
	public ResultInfo read(@RequestParam Map<String, String> params)
			throws Exception {
		ResultInfo resultInfo = new ResultInfo();

		resultInfo.setMsg(service.read(params));
		resultInfo.setSuccess(true);

		return resultInfo;
	}

	@RequestMapping(SYWMRecipientURI.Delete)
	public ResultInfo delete(@RequestParam Map<String, String> params,
			HttpServletRequest request) throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		service.delete(params.get("recipientIds"));
		resultInfo.setMsg("删除成功！");
		resultInfo.setSuccess(true);
		return resultInfo;
	}

	@RequestMapping(SYWMRecipientURI.Add)
	public ResultInfo add(@ModelAttribute Recipient recipient) {
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setMsg(service.add(recipient));
		resultInfo.setSuccess(true);
		return resultInfo;

	}

	@RequestMapping(SYWMRecipientURI.Update)
	public ResultInfo update(@RequestParam Map<String, Object> params)
			throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setMsg(service.update(params));
		resultInfo.setSuccess(true);
		return resultInfo;

	}

	@RequestMapping(SYWMRecipientURI.Unique)
	public ResultInfo unique(@RequestParam Map<String, String> params)
			throws Exception {
		ResultInfo info = new ResultInfo();
		Boolean flag = service.unique(params);

		info.setMsg(flag);
		info.setSuccess(true);
		return info;

	}
}

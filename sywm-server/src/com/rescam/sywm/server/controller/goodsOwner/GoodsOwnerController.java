package com.rescam.sywm.server.controller.goodsOwner;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rescam.common.vo.ResultInfo;
import com.rescam.sywm.rs.uri.goodsOwner.SYWMGoodsOwnerURI;
import com.rescam.sywm.server.entity.GoodsOwner;
import com.rescam.sywm.server.service.goodsOwner.GoodsOwnerService;

@RestController
@RequestMapping(value = SYWMGoodsOwnerURI.Base, method = RequestMethod.POST)
public class GoodsOwnerController {

	@Autowired
	private GoodsOwnerService goodsOwnerService;

	@RequestMapping(value = SYWMGoodsOwnerURI.Unique)
	public ResultInfo unique(@RequestParam Map<String, String> params) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			if (goodsOwnerService.unique(params)) {

				resultInfo.setSuccess(true);

			} else {
				resultInfo.setSuccess(false);
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return resultInfo;
	}

	@RequestMapping(value = SYWMGoodsOwnerURI.Add)
	public ResultInfo addGoodsOwner(@ModelAttribute GoodsOwner goodsOwner) {

		ResultInfo resultInfo = new ResultInfo();
		try {
			goodsOwnerService.addGoodsOwner(goodsOwner);
			resultInfo.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultInfo;
	}

	@RequestMapping(value = SYWMGoodsOwnerURI.Count)
	public ResultInfo getCount(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo result = new ResultInfo();

		Long count = goodsOwnerService.getCount(params);
		result.setSuccess(true);
		result.setMsg(count);

		return result;
	}

	@RequestMapping(value = SYWMGoodsOwnerURI.Search)
	public ResultInfo search(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo result = new ResultInfo();
		List<GoodsOwner> list = goodsOwnerService.search(params);
		result.setSuccess(true);
		result.setMsg(list);

		return result;
	}

	@RequestMapping(value = SYWMGoodsOwnerURI.Del)
	public void del(@RequestParam Map<String, String> params) throws Exception {

		goodsOwnerService.del(params);

	}

	@RequestMapping(value = SYWMGoodsOwnerURI.Read)
	public ResultInfo read(@RequestParam Map<String, String> params) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			resultInfo.setMsg(goodsOwnerService.read(params));
			resultInfo.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultInfo;
	}

	@RequestMapping(value = SYWMGoodsOwnerURI.Update)
	public ResultInfo updata(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setMsg(goodsOwnerService.update(params));
		resultInfo.setSuccess(true);
		return resultInfo;
	}

}

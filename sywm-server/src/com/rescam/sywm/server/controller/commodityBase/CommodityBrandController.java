package com.rescam.sywm.server.controller.commodityBase;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rescam.common.vo.ResultInfo;
import com.rescam.sywm.rs.uri.commodityBase.SYWMBrandURI;
import com.rescam.sywm.server.entity.Brands;
import com.rescam.sywm.server.service.commodityBase.BrandService;
import com.rescam.sywm.server.vo.OptionKV;

@RestController
@RequestMapping(value = SYWMBrandURI.Base, method = RequestMethod.POST)
public class CommodityBrandController {

	@Autowired
	private BrandService brandService;

	@RequestMapping(value = SYWMBrandURI.Add)
	public ResultInfo addBrand(@ModelAttribute Brands brands) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			brandService.addBrand(brands);
			resultInfo.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultInfo;
	}

	@RequestMapping(value = SYWMBrandURI.Read)
	public ResultInfo read(@RequestParam Map<String, String> params) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			resultInfo.setMsg(brandService.read(params));
			resultInfo.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultInfo;
	}

	@RequestMapping(SYWMBrandURI.Count)
	public ResultInfo getCount(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo result = new ResultInfo();

		Long count = brandService.getCount(params);
		result.setSuccess(true);
		result.setMsg(count);

		return result;
	}

	@RequestMapping(SYWMBrandURI.Search)
	public ResultInfo search(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo result = new ResultInfo();
		List<Brands> list = brandService.search(params);
		result.setSuccess(true);
		result.setMsg(list);

		return result;
	}

	// is_delete
	@RequestMapping(value = SYWMBrandURI.Del)
	public void del(@RequestParam Map<String, String> params) throws Exception {

		brandService.del(params);

	}

	@RequestMapping(value = SYWMBrandURI.Unique)
	public ResultInfo unique(@RequestParam Map<String, String> params) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			if (brandService.unique(params)) {

				resultInfo.setSuccess(true);

			} else {
				resultInfo.setSuccess(false);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultInfo;
	}

	@RequestMapping(value = SYWMBrandURI.Updata)
	public ResultInfo updata(@ModelAttribute Brands brands) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			brandService.updata(brands);
			resultInfo.setSuccess(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultInfo.setSuccess(false);
		}
		return resultInfo;
	}

	@RequestMapping(value = SYWMBrandURI.Kv)
	public List<OptionKV> queryKV() throws Exception {

		return brandService.queryKV();
	}
}

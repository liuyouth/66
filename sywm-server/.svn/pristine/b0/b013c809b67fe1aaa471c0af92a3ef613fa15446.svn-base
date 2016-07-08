package com.rescam.sywm.server.controller.system;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rescam.common.vo.ResultInfo;
import com.rescam.sywm.rs.uri.system.SYWMTruckURI;
import com.rescam.sywm.server.entity.Truck;
import com.rescam.sywm.server.service.system.TruckService;

@RestController
@RequestMapping(value = SYWMTruckURI.Base, method = RequestMethod.POST)
public class TruckController {

	@Autowired
	private TruckService truckService;

	@RequestMapping(value = SYWMTruckURI.Add)
	public ResultInfo addTruck(@ModelAttribute Truck truck) {

		ResultInfo resultInfo = new ResultInfo();
		try {
			truckService.addTruck(truck);
			resultInfo.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultInfo;
	}

	@RequestMapping(value = SYWMTruckURI.Unique)
	public ResultInfo unique(@RequestParam Map<String, String> params) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			if (truckService.unique(params)) {

				resultInfo.setSuccess(true);

			} else {
				resultInfo.setSuccess(false);
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return resultInfo;
	}

	@RequestMapping(value = SYWMTruckURI.Count)
	public ResultInfo getCount(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo result = new ResultInfo();

		Long count = truckService.getCount(params);
		result.setSuccess(true);
		result.setMsg(count);

		return result;
	}

	@RequestMapping(value = SYWMTruckURI.Search)
	public ResultInfo search(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo result = new ResultInfo();
		List<Truck> list = truckService.search(params);

		result.setSuccess(true);
		result.setMsg(list);

		return result;
	}

	@RequestMapping(value = SYWMTruckURI.Del)
	public void del(@RequestParam Map<String, String> params) throws Exception {

		truckService.del(params);

	}

}

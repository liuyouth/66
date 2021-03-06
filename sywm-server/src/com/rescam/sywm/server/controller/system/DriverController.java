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
import com.rescam.sywm.rs.uri.system.SYWMDriverURI;
import com.rescam.sywm.server.entity.Driver;
import com.rescam.sywm.server.service.system.DriverService;
import com.rescam.sywm.server.utils.CryptoUtils;

@RestController
@RequestMapping(value = SYWMDriverURI.Base, method = RequestMethod.POST)
public class DriverController {

	@Autowired
	private DriverService driverService;

	@RequestMapping(value = SYWMDriverURI.Add)
	public ResultInfo addDriver(@ModelAttribute Driver driver) {

		String initPwd = "123456";
		String salt = CryptoUtils.getSalt();
		driver.setLoginPwd(CryptoUtils.getHash(initPwd, salt));
		driver.setPwdSalt(salt);
		ResultInfo resultInfo = new ResultInfo();
		try {
			driverService.addDriver(driver);
			resultInfo.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultInfo;
	}

	@RequestMapping(value = SYWMDriverURI.Unique)
	public ResultInfo unique(@RequestParam Map<String, String> params) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			if (driverService.unique(params)) {

				resultInfo.setSuccess(true);

			} else {
				resultInfo.setSuccess(false);
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return resultInfo;
	}

	@RequestMapping(value = SYWMDriverURI.Count)
	public ResultInfo getCount(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo result = new ResultInfo();

		Long count = driverService.getCount(params);
		result.setSuccess(true);
		result.setMsg(count);

		return result;
	}

	@RequestMapping(value = SYWMDriverURI.Search)
	public ResultInfo search(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo result = new ResultInfo();
		List<Driver> list = driverService.search(params);
		result.setSuccess(true);
		result.setMsg(list);

		return result;
	}

	@RequestMapping(value = SYWMDriverURI.Del)
	public void del(@RequestParam Map<String, String> params) throws Exception {

		driverService.del(params);

	}

	@RequestMapping(value = SYWMDriverURI.Read)
	public ResultInfo read(@RequestParam Map<String, String> params) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			resultInfo.setMsg(driverService.read(params));
			resultInfo.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultInfo;
	}

	@RequestMapping(value = SYWMDriverURI.Update)
	public ResultInfo updata(@RequestParam Map<String, String> params) throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setMsg(driverService.update(params));
		resultInfo.setSuccess(true);
		return resultInfo;
	}

}

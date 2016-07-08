package com.rescam.sywm.server.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rescam.common.server.util.EntityUtils;
import com.rescam.common.vo.DataTableInfo;
import com.rescam.common.vo.ResultInfo;
import com.rescam.sywm.rs.uri.SYWMSampleURI;
import com.rescam.sywm.server.entity.Sample;
import com.rescam.sywm.server.service.SampleService;

@RestController
@RequestMapping(value = SYWMSampleURI.Base, method = RequestMethod.POST)
public class SampleController {

	@Autowired
	private SampleService sampleService;

	@RequestMapping(SYWMSampleURI.Search)
	public DataTableInfo search(@RequestParam(required = false) String filterString) throws Exception {

		List<Sample> samples = sampleService.search();

		DataTableInfo data = new DataTableInfo();

		if (filterString != null) {
			data.setData(EntityUtils.filter(samples, filterString));
		} else {
			data.setData(samples);
		}

		return data;
	}

	@RequestMapping(SYWMSampleURI.Add)
	public ResultInfo add(@RequestBody String params) throws Exception {
		sampleService.add(params);
		return new ResultInfo();
	}

	@RequestMapping(SYWMSampleURI.Save)
	public ResultInfo save(@RequestParam Map<String, String> params) throws Exception {
		sampleService.save(params);
		return new ResultInfo();
	}

}

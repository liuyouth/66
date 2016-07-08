package com.rescam.sywm.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rescam.common.web.controller.BaseController;
import com.rescam.sywm.web.service.SampleService;

@RestController
@Scope("prototype")
@RequestMapping("sample")
public class SampleController extends BaseController {

	@Autowired
	private SampleService sampleService;

	@RequestMapping("search")
	public void search() throws Exception {
		sampleService.search();
	}

	@RequestMapping("add")
	public void add() throws Exception {
		sampleService.add();
	}

	@RequestMapping("save")
	public void save(@RequestParam Map<String, String> map) throws Exception {
		sampleService.save(map);
	}

}

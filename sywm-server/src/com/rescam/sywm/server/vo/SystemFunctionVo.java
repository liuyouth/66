package com.rescam.sywm.server.vo;

import java.util.List;

public class SystemFunctionVo {
	private Integer systemFunctionId;
	private String systemFunctionName;
	private List<SystemFunctionVo> children;

	public Integer getSystemFunctionId() {
		return systemFunctionId;
	}

	public void setSystemFunctionId(Integer systemFunctionId) {
		this.systemFunctionId = systemFunctionId;
	}

	public String getSystemFunctionName() {
		return systemFunctionName;
	}

	public void setSystemFunctionName(String systemFunctionName) {
		this.systemFunctionName = systemFunctionName;
	}

	public List<SystemFunctionVo> getChildren() {
		return children;
	}

	public void setChildren(List<SystemFunctionVo> children) {
		this.children = children;
	}
}

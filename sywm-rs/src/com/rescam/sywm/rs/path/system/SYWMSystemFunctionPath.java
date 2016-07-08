package com.rescam.sywm.rs.path.system;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.system.SYWMSystemFunctionURI;

public enum SYWMSystemFunctionPath implements Path {
	AuthList(SYWMSystemFunctionURI.AuthList), Add(SYWMSystemFunctionURI.Add), ReadAuth(SYWMSystemFunctionURI.ReadAuth);
	private String pathString;

	@Override
	public String asString() {
		return pathString;
	}

	SYWMSystemFunctionPath(String pathString) {
		this.pathString = "/" + SYWMSystemFunctionURI.Base + "/" + pathString;
	}
}

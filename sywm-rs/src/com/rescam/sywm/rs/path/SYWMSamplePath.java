package com.rescam.sywm.rs.path;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.SYWMSampleURI;

public enum SYWMSamplePath implements Path {

	Search(SYWMSampleURI.Search),

	Add(SYWMSampleURI.Add),

	Save(SYWMSampleURI.Save),

	;

	private String pathString;

	SYWMSamplePath(String pathString) {
		this.pathString = "/" + SYWMSampleURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		return pathString;
	}

}

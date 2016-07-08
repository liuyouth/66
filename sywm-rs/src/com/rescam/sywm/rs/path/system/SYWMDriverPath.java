package com.rescam.sywm.rs.path.system;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.system.SYWMDriverURI;

public enum SYWMDriverPath implements Path {
	
	Add(SYWMDriverURI.Add),
	Search(SYWMDriverURI.Search),
	Count(SYWMDriverURI.Count),
	Del(SYWMDriverURI.Del),
	Unique(SYWMDriverURI.Unique),
	Read(SYWMDriverURI.Read),
	Update(SYWMDriverURI.Update)
	;
	
	private String pathString;

	SYWMDriverPath(String pathString) {
		this.pathString = "/" + SYWMDriverURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		// TODO Auto-generated method stub
		return pathString;
	}

}

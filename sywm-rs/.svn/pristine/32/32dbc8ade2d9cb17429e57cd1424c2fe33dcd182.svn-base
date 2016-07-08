package com.rescam.sywm.rs.path.system;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.system.SYWMTruckURI;

public enum SYWMTruckPath implements Path {
	
	Add(SYWMTruckURI.Add),
	Search(SYWMTruckURI.Search),
	Count(SYWMTruckURI.Count),
	Del(SYWMTruckURI.Del),
	Unique(SYWMTruckURI.Unique)
	;
	
	private String pathString;

	SYWMTruckPath(String pathString) {
		this.pathString = "/" + SYWMTruckURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		// TODO Auto-generated method stub
		return pathString;
	}

}

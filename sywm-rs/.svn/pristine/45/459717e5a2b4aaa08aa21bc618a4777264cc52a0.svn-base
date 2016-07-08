package com.rescam.sywm.rs.path.commodityBase;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.commodityBase.SYWMBrandURI;

public enum SYWMBrandPath implements Path{
	
	Add(SYWMBrandURI.Add),
	Search(SYWMBrandURI.Search),
	Count(SYWMBrandURI.Count),
	Del(SYWMBrandURI.Del),
	Unique(SYWMBrandURI.Unique),
	Read(SYWMBrandURI.Read),
	Updata(SYWMBrandURI.Updata),
	Kv(SYWMBrandURI.Kv)
	
	;
	
	private String pathString;

	SYWMBrandPath(String pathString) {
		this.pathString = "/" + SYWMBrandURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		// TODO Auto-generated method stub
		return pathString;
	}

}

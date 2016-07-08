package com.rescam.sywm.rs.path.warehouse;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.warehouse.SYWMGoodsLocatorURI;

public enum SYWMGoodsLocatorPath implements Path {

	Search(SYWMGoodsLocatorURI.Search),

	Count(SYWMGoodsLocatorURI.Count),

	Edit(SYWMGoodsLocatorURI.Edit),

	Update(SYWMGoodsLocatorURI.Update)

	;

	private String pathString;

	SYWMGoodsLocatorPath(String pathString) {
		this.pathString = "/" + SYWMGoodsLocatorURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		return pathString;
	}

}

package com.rescam.sywm.rs.path.commodityBase;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.commodityBase.SYWMCommodityPackingURI;

public enum SYWMCommodityPackingPath implements Path {

	Search(SYWMCommodityPackingURI.Search),

	Count(SYWMCommodityPackingURI.Count),

	Delete(SYWMCommodityPackingURI.Delete),

	Add(SYWMCommodityPackingURI.Add),

	;

	private String pathString;

	SYWMCommodityPackingPath(String pathString) {
		this.pathString = "/" + SYWMCommodityPackingURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		return pathString;
	}

}

package com.rescam.sywm.rs.path.commodityBase;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.commodityBase.SYWMCommodityTypeURI;

public enum SYWMCommodityTypePath implements Path {

	QueryTree(SYWMCommodityTypeURI.QueryTree),

	Read(SYWMCommodityTypeURI.Read),

	Add(SYWMCommodityTypeURI.Add),

	Update(SYWMCommodityTypeURI.Update),

	Delete(SYWMCommodityTypeURI.Delete),

	UniqueCommodityTypeName(SYWMCommodityTypeURI.UniqueCommodityTypeName),

	UniqueCommodityTypeCode(SYWMCommodityTypeURI.UniqueCommodityTypeCode)

	;

	private String pathString;

	SYWMCommodityTypePath(String pathString) {
		this.pathString = "/" + SYWMCommodityTypeURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		return pathString;
	}
}

package com.rescam.sywm.rs.path.commodityBase;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.commodityBase.SYWMCommodityBaseURI;

public enum SYWMCommodityBasePath implements Path {

	Search(SYWMCommodityBaseURI.Search),

	Count(SYWMCommodityBaseURI.Count),

	Read(SYWMCommodityBaseURI.Read),

	Delete(SYWMCommodityBaseURI.Delete),

	Add(SYWMCommodityBaseURI.Add),

	Update(SYWMCommodityBaseURI.Update),

	Unique(SYWMCommodityBaseURI.Unique),

	;

	private String pathString;

	SYWMCommodityBasePath(String pathString) {
		this.pathString = "/" + SYWMCommodityBaseURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		return pathString;
	}

}

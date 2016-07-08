package com.rescam.sywm.rs.path.goodsOwner;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.goodsOwner.SYWMGoodsOwnerURI;

public enum SYWMGoodsOwnerPath implements Path{
	
	Add(SYWMGoodsOwnerURI.Add),
	Search(SYWMGoodsOwnerURI.Search),
	Count(SYWMGoodsOwnerURI.Count),
	Del(SYWMGoodsOwnerURI.Del),
	Unique(SYWMGoodsOwnerURI.Unique),
	Read(SYWMGoodsOwnerURI.Read),
	Update(SYWMGoodsOwnerURI.Update)
	;
	
	private String pathString;

	SYWMGoodsOwnerPath(String pathString) {
		this.pathString = "/" + SYWMGoodsOwnerURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		// TODO Auto-generated method stub
		return pathString;
	}

}

package com.rescam.sywm.rs.path.goodsOwner;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.goodsOwner.SYWMRecipientURI;

public enum SYWMRecipientPath implements Path {

	Search(SYWMRecipientURI.Search),

	Count(SYWMRecipientURI.Count),
	
	Read(SYWMRecipientURI.Read),
	
	Delete(SYWMRecipientURI.Delete),
	
	Add(SYWMRecipientURI.Add),

	Update(SYWMRecipientURI.Update),
	
	Unique(SYWMRecipientURI.Unique),


	;

	private String pathString;

	SYWMRecipientPath(String pathString) {
		this.pathString = "/" + SYWMRecipientURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		return pathString;
	}

}

package com.rescam.sywm.rs.path.system;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.system.SYWMUserGroupURI;

public enum SYWMUserGroupPath implements Path {
	Add(SYWMUserGroupURI.Add),

	Search(SYWMUserGroupURI.Search),

	Count(SYWMUserGroupURI.Count),

	Del(SYWMUserGroupURI.Del),

	Read(SYWMUserGroupURI.Read),

	Update(SYWMUserGroupURI.Update),

	UniqueUserGroupName(SYWMUserGroupURI.UniqueUserGroupName), KV(SYWMUserGroupURI.KV)

	;

	private String pathString;

	SYWMUserGroupPath(String pathString) {
		this.pathString = "/" + SYWMUserGroupURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		// TODO Auto-generated method stub
		return pathString;
	}
}

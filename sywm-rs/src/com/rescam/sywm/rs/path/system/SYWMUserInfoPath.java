package com.rescam.sywm.rs.path.system;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.system.SYWMUserInfoURI;

public enum SYWMUserInfoPath implements Path {
	Add(SYWMUserInfoURI.Add), UniqueLoginName(SYWMUserInfoURI.UniqueLoginName), Search(SYWMUserInfoURI.Search),

	Count(SYWMUserInfoURI.Count), Del(SYWMUserInfoURI.Del),

	Read(SYWMUserInfoURI.Read), Update(SYWMUserInfoURI.Update), LoginIn(SYWMUserInfoURI.LoginIn), ModifyPwd(
			SYWMUserInfoURI.ModifyPwd),;
	private String pathString;

	SYWMUserInfoPath(String pathString) {
		this.pathString = "/" + SYWMUserInfoURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		return pathString;
	}

}

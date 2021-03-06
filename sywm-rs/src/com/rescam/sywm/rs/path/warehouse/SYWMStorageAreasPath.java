package com.rescam.sywm.rs.path.warehouse;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.warehouse.SYWMStorageAreasURI;

public enum SYWMStorageAreasPath implements Path {

	Search(SYWMStorageAreasURI.Search),

	Count(SYWMStorageAreasURI.Count),

	UniqueStorageAreasName(SYWMStorageAreasURI.UniqueStorageAreasName),

	Add(SYWMStorageAreasURI.Add),

	Edit(SYWMStorageAreasURI.Edit),

	Update(SYWMStorageAreasURI.Update),

	KV(SYWMStorageAreasURI.KV),

	SelectAllAreas(SYWMStorageAreasURI.SelectAllAreas),

	;

	private String pathString;

	SYWMStorageAreasPath(String pathString) {
		this.pathString = "/" + SYWMStorageAreasURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		return pathString;
	}

}

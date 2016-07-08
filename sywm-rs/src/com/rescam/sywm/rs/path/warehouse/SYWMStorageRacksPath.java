package com.rescam.sywm.rs.path.warehouse;

import com.rescam.common.rs.Path;
import com.rescam.sywm.rs.uri.warehouse.SYWMStorageRacksURI;

public enum SYWMStorageRacksPath implements Path {

	Search(SYWMStorageRacksURI.Search),

	Count(SYWMStorageRacksURI.Count),

	Edit(SYWMStorageRacksURI.Edit),

	AddToAreas(SYWMStorageRacksURI.AddToAreas),

	Update(SYWMStorageRacksURI.Update),

	SelectAllRacks(SYWMStorageRacksURI.SelectAllRacks)

	;

	private String pathString;

	SYWMStorageRacksPath(String pathString) {
		this.pathString = "/" + SYWMStorageRacksURI.Base + "/" + pathString;
	}

	@Override
	public String asString() {
		return pathString;
	}

}

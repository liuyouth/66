package com.rescam.sywm.server.service.system;

import java.util.List;
import java.util.Map;

import com.rescam.sywm.server.entity.Truck;

public interface TruckService {

	public void addTruck(Truck truck) throws Exception;

	public boolean unique(Map<String, String> params) throws Exception;

	public Long getCount(Map<String, String> params) throws Exception;

	public List<Truck> search(Map<String, String> params) throws Exception;

	public void del(Map<String, String> params) throws Exception;

}

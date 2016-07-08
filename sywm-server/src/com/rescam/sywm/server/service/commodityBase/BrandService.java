package com.rescam.sywm.server.service.commodityBase;

import java.util.List;
import java.util.Map;

import com.rescam.sywm.server.entity.Brands;
import com.rescam.sywm.server.vo.OptionKV;

public interface BrandService {

	public void addBrand(Brands brands) throws Exception;

	public Brands read(Map<String, String> params) throws Exception;

	Long getCount(Map<String, String> params) throws Exception;

	List<Brands> search(Map<String, String> params) throws Exception;

	public void del(Map<String, String> params) throws Exception;

	public boolean unique(Map<String, String> params) throws Exception;

	public void updata(Brands brands) throws Exception;

	public List<OptionKV> queryKV() throws Exception;

}

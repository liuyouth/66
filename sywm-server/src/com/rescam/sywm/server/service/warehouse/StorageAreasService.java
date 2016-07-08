package com.rescam.sywm.server.service.warehouse;

import java.util.List;
import java.util.Map;

import com.rescam.common.vo.ResultInfo;
import com.rescam.sywm.server.entity.StorageAreas;
import com.rescam.sywm.server.vo.OptionKV;

public interface StorageAreasService {

	public Long getCount(Map<String, String> params) throws Exception;

	public List<StorageAreas> search(Map<String, String> params) throws Exception;

	public ResultInfo uniqueStorageAreasName(Map<String, String> params) throws Exception;

	public void add(StorageAreas storageAreas) throws Exception;

	public StorageAreas edit(Integer storageAreasId) throws Exception;

	public void update(Map<String, String> params) throws Exception;

	public List<OptionKV> queryKV() throws Exception;

	public List<StorageAreas> selectAllAreas(Map<String, String> params) throws Exception;

}

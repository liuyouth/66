package com.rescam.sywm.server.service.goodsOwner;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.rescam.sywm.server.entity.Recipient;

public interface RecipientService {

	Long getCount(Map<String, String> params) throws Exception;

	List<Recipient> search(Map<String, String> params) throws Exception;

	Recipient read(Map<String, String> params) throws Exception;

	void delete(String recipientId) throws Exception;

	Serializable add(Recipient recipient);

	Boolean update(Map<String, Object> params) throws Exception;

	Boolean unique(Map<String, String> params) throws Exception;
}

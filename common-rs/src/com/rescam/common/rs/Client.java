package com.rescam.common.rs;

import java.io.IOException;
import java.util.Map;

import org.apache.http.Consts;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

public class Client {

	private String target;
	private String uidKey;
	private Integer uidValue;

	public String post(Path path) throws ClientProtocolException, IOException {
		return Request.Post(target + path.asString()).execute().returnContent().asString();
	}

	public String post(Path path, String params) throws ClientProtocolException, IOException {
		if (uidKey != null && uidValue != null) {
			String string = "\"" + uidKey + "\":";
			params = params.replace(string + "0", string + uidValue);
		}
		return Request.Post(target + path.asString()).bodyString(params, ContentType.APPLICATION_JSON).execute()
				.returnContent().asString();
	}

	public String post(Path path, Map<String, String> params) throws ClientProtocolException, IOException {
		boolean bool = uidKey != null && uidValue != null;
		if (bool) {
			params.put(uidKey, uidValue.toString());
		}
		Form form = Form.form();
		params.forEach((name, value) -> {
			if (bool && "0".equals(value) && name.endsWith("." + uidKey)) {
				value = uidValue.toString();
			}
			form.add(name, value);
		});
		return Request.Post(target + path.asString()).bodyForm(form.build(), Consts.UTF_8).execute().returnContent()
				.asString();
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public void setUidKey(String uidKey) {
		this.uidKey = uidKey;
	}

	public void setUidValue(Integer uidValue) {
		this.uidValue = uidValue;
	}

}

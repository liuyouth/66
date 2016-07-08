package com.rescam.common.server.util;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.springframework.beans.factory.InitializingBean;

public class BeanUtilsDateConverterConfig implements InitializingBean {

	private Set<String> patterns = new HashSet<>(0);

	public BeanUtilsDateConverterConfig() {
		patterns.add("yyyy-MM-dd");
		patterns.add("yyyy-MM-dd HH:mm:ss");
		patterns.add("HH:mm:ss");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		DateConverter converter = new DateConverter();
		converter.setPatterns(patterns.toArray(new String[0]));
		ConvertUtils.register(converter, java.util.Date.class);
	}

	public Set<String> getPatterns() {
		return patterns;
	}

	public void setPatterns(Set<String> patterns) {
		this.patterns = patterns;
	}
}
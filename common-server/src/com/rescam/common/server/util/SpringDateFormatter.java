package com.rescam.common.server.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.datetime.DateFormatter;

public class SpringDateFormatter extends DateFormatter {

	@Override
	public Date parse(String text, Locale locale) throws ParseException {
		Date date;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(text);
		} catch (Exception e) {
			try {
				date = new SimpleDateFormat("HH:mm:ss").parse(text);
			} catch (Exception e2) {
				date = super.parse(text, locale);
			}
		}
		return date;
	}
}

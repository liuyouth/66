package com.rescam.common.server.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module.Feature;

public class HibernateAwareObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = 1L;

	public HibernateAwareObjectMapper() {
		Hibernate5Module module = new Hibernate5Module();
		module.enable(Feature.SERIALIZE_IDENTIFIER_FOR_LAZY_NOT_LOADED_OBJECTS);

		registerModule(module);

		setSerializationInclusion(Include.NON_NULL);

		SimpleModule simpleModule = new SimpleModule();

		simpleModule.addSerializer(Date.class, new JsonSerializer<Date>() {

			@Override
			public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers)
					throws IOException, JsonProcessingException {
				String text = value.toString();

				if (text.length() > 10) {
					text = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(value);
				}
				gen.writeString(text);
			}
		});

		simpleModule.addDeserializer(Date.class, new JsonDeserializer<Date>() {

			@Override
			public Date deserialize(JsonParser parser, DeserializationContext context)
					throws IOException, JsonProcessingException {
				Date date;
				String text = parser.getValueAsString();
				try {
					date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(text);
				} catch (Exception e) {
					try {
						date = new SimpleDateFormat("HH:mm:ss").parse(text);
					} catch (Exception e1) {
						try {
							date = new SimpleDateFormat("yyyy-MM-dd").parse(text);
						} catch (ParseException e2) {
							throw new IOException(e2.getMessage());
						}
					}
				}

				return date;
			}
		});

		registerModule(simpleModule);

	}

	public void setModules(Set<Module> modules) {
		for (Module module : modules) {
			registerModule(module);
		}
	}
}
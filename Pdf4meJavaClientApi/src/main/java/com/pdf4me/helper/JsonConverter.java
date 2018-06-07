package com.pdf4me.helper;

import java.io.ByteArrayOutputStream;
import java.util.Date;

import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonConverter {

	/**
	 * Takes an arbitrary object and returns the corresponding json in form of a
	 * byte array.
	 * 
	 * @param input
	 *            object to be dumped to a json
	 * @return byte array representation of the generated json
	 */
	public byte[] toJson(Object input) {

		try {
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			ObjectMapper mapper = getJsonMapper();

			mapper.writeValue(outputStream, input);
			return outputStream.toByteArray();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Takes the byte array representation of a json and returns an instance of type
	 * type (function argument).
	 * 
	 * @param output:
	 *            json byte array to be transformed into an object
	 * @param type:
	 *            of wished output
	 * @return
	 */
	public Object fromJson(byte[] output, Class<?> type) {
		try {
			ObjectMapper mapper = getJsonMapper();
			Object result = mapper.readValue(output, type);

			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Constructs a customized JsonMapper.
	 * 
	 * @return customized jsonMapper
	 */
	private ObjectMapper getJsonMapper() {

		ObjectMapper mapperExplicit = new ObjectMapper(new JsonFactory());
		mapperExplicit.setSerializationInclusion(Include.NON_NULL);
		mapperExplicit.disable(SerializationFeature.FLUSH_AFTER_WRITE_VALUE);
		mapperExplicit.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);

		// add custom deserializers

		// OffsetDateTime
		SimpleModule offsetDateTimeDes = new SimpleModule("OffsetDateTimeDesirializer");
		offsetDateTimeDes.addDeserializer(OffsetDateTime.class, new OffsetDateTimeDeserializer());
		mapperExplicit.registerModule(offsetDateTimeDes);
		// Date
		SimpleModule dateDes = new SimpleModule("DateDesirializer");
		dateDes.addDeserializer(Date.class, new DateDeserializer());
		mapperExplicit.registerModule(dateDes);

		return mapperExplicit;
	}

}

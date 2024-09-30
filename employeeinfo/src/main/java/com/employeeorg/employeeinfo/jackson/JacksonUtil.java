package com.employeeorg.employeeinfo.jackson;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JacksonUtil {

	public static final ObjectMapper mapper;
	public static final ObjectMapper nonNullMapper;
	public static final ObjectMapper defaultMapper;

	static {
		mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.setSerializationInclusion(Include.NON_NULL);//wont serialize null values

		nonNullMapper = new ObjectMapper();
		nonNullMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		defaultMapper = new ObjectMapper();
	}
}

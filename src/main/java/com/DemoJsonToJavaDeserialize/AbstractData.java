package com.DemoJsonToJavaDeserialize;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME, property = "type", include = As.WRAPPER_OBJECT)
public abstract class AbstractData {
	private String someCommonProperty;

	public String getSomeCommonProperty() {
		return someCommonProperty;
	}

	public void setSomeCommonProperty(String someCommonProperty) {
		this.someCommonProperty = someCommonProperty;
	}

}

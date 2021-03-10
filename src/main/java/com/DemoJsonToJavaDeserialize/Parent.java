package com.DemoJsonToJavaDeserialize;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class Parent {
	private String type;

	@JsonTypeInfo(use = Id.NAME, property = "type", include = As.PROPERTY)
	@JsonSubTypes({ @JsonSubTypes.Type(value = Foo.class, name = "foo"), @JsonSubTypes.Type(value = Bar.class, name = "bar") })
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private List<AbstractData> data;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<AbstractData> getData() {
		return data;
	}

	public void setData(List<AbstractData> data) {
		this.data = data;
	}

	/*
	 * public AbstractData getData() {
	 * return data;
	 * }
	 * public void setData(AbstractData data) {
	 * this.data = data;
	 * }
	 */
}

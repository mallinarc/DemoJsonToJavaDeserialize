package com.DemoJsonToJavaDeserialize;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

public class Parent {
	private String type;

	@JsonSubTypes({ @Type(value = Foo.class, name = "foo"), @Type(value = Bar.class, name = "bar") })
	private List<AbstractData> data;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

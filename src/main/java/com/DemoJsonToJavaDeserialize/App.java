package com.DemoJsonToJavaDeserialize;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		App app = new App();
		File file = new File(app.getClass().getClassLoader().getResource("foo.json").getFile());
		ObjectMapper mapper = new ObjectMapper();
		// mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
		// mapper.enableDefaultTyping();

		try {
			Parent wrapper = mapper.readValue(file, Parent.class);
			System.out.println(wrapper.getType());
			System.out.println("....... value as string:" + mapper.writeValueAsString(wrapper));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

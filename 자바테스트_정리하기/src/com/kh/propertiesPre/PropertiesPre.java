package com.kh.propertiesPre;

import java.util.Map;
import java.util.Properties;

public class PropertiesPre {

	public static void main(String[] args) {
		Properties settings = new Properties();
		settings.setProperty("이름", "김다섯");
		settings.setProperty("나이", "15");
		settings.setProperty("사는곳", "서울");

		String name = settings.getProperty("이름");
		System.out.println(name);

		for (Map.Entry<Object, Object> e : settings.entrySet()) {
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println(key + " " + value);
		}
	}
}

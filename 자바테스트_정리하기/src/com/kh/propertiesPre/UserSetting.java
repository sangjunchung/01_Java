package com.kh.propertiesPre;

import java.util.Map;
import java.util.Properties;

public class UserSetting {

	public static void main(String[] args) {
		Properties setting = new Properties();
		
		setting.setProperty("name", "john");
		setting.setProperty("age", "17");
		setting.setProperty("city", "seoul");

		System.out.println(setting.get("city"));
		
		for(Map.Entry<Object, Object> e : setting.entrySet()) {
			System.out.println("key : "+e.getKey()+", value : "+e.getValue());
		}
	}
}

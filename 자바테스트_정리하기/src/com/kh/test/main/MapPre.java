package com.kh.test.main;

import java.util.HashMap;
import java.util.Map;

public class MapPre {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 2000);
		map.put("banana", 3000);
		map.put("cherry", 1000);
		
		System.out.println(map);
		
		map.put("banana", 500);
		
		System.out.println(map);
	}

}

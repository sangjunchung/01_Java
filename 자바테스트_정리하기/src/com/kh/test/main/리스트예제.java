package com.kh.test.main;

import java.util.ArrayList;
import java.util.Arrays;

public class 리스트예제 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("바나나", "오렌지"));
		list.add("사과");
		System.out.println(list);
		
		list.remove("바나나");
		list.remove(0);
		System.out.println(list);
		
		list.set(0, "체리");
		System.out.println(list);
		
		list.add(1, "파파야");
		System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(list.contains("파파야"));
		System.out.println(list.indexOf("체리"));
	}
}

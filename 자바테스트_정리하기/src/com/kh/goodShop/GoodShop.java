package com.kh.goodShop;

import java.util.*;

public class GoodShop {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		System.out.println("어서오세요. 제주에 오신 것을 환영합니다.^^");

		map.put("동백모자", 20000);
		map.put("감귤모자", 15000);
		map.put("흑돼지키링", 25000);

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println("저기요~! 이거 얼마인가요~!");
		String product = "동백모자";

		if (map.containsKey(product)) {
			System.out.println(product + "의 가격은 " + map.get(product) + "원 입니다~");
		} else {
			System.out.println(product +"은(는) 판매 중이 아닙니다.");
		}
	}
}

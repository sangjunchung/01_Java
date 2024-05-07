package com.kh.goodShop;

import java.util.*;

public class ComputerShop {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("노트북", 700000);
		map.put("데스크탑", 20000);
		map.put("모니터", 5000);
		map.put("마우스", 3000);
		map.put("키보드", 2000);
		
		System.out.println("컴퓨터 상품 목록");
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("찾는 물건 입력 : ");
		String find = sc.nextLine();

		System.out.println(find + "는 가게에 있습니까?");
		
		if(map.containsKey(find)) {
			System.out.println("네~! 존재합니다.");
		} else {
			System.out.println("현재 품절입니다.");
		}
		
		sc.close();
	}
}

package com.kh.hamburger;

import java.util.ArrayList;
import java.util.HashSet;

public class BurgerShop {

	public static void main(String[] args) {
		ArrayList<HamburgerOrder> order = new ArrayList<>();
		order.add(new HamburgerOrder("동그라미", "치즈버거"));
		order.add(new HamburgerOrder("안세모", "베이컨버거"));
		order.add(new HamburgerOrder("박네모", "상하이버거"));
		order.add(new HamburgerOrder("금각진", "치킨버거"));
		order.add(new HamburgerOrder("동그라미", "빅맥"));
		
		System.out.println(order);
		
		HashSet<String> set = new HashSet<>();
		ArrayList<HamburgerOrder> list = new ArrayList<>();
		
		for(HamburgerOrder ham : order) {
			if(!set.contains(ham.getClinetName())) {
				list.add(ham);
				set.add(ham.getClinetName());
			}
		}
		
		System.out.println(list);
		
	}
}

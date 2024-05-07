package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.HashSet;

public class PizzaShop {

	public static void main(String[] args) {
		ArrayList<PizzaOrder> list = new ArrayList<>();
		list.add(new PizzaOrder("고영희", "페페로니"));
		list.add(new PizzaOrder("박철진", "마르게리따"));
		list.add(new PizzaOrder("안영식", "슈프림"));
		list.add(new PizzaOrder("고영희", "파인애플"));
		list.add(new PizzaOrder("박철진", "치즈"));

		System.out.println(list);
		
		HashSet<String> set = new HashSet<>();
		ArrayList<PizzaOrder> list2 = new ArrayList<>();
		
		for(PizzaOrder p : list) {
			if(!set.contains(p.getClientName())) {
				list2.add(p);
				set.add(p.getClientName());
			}
		}
		
		System.out.println(list2);
	}
}

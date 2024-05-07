package com.kh.sandwich;

import java.util.ArrayList;
import java.util.HashSet;

public class SandwichStore {

	public static void main(String[] args) {
		ArrayList<Sandwich> list = new ArrayList<>();
		list.add(new Sandwich("김하나", "BLT"));
		list.add(new Sandwich("이둘", "터키"));
		list.add(new Sandwich("김하나", "치킨"));
		list.add(new Sandwich("이셋", "에그마요"));
		list.add(new Sandwich("김하나", "베지터블"));
		
		HashSet<String> set = new HashSet<>();
		ArrayList<Sandwich> list2 = new ArrayList<>();
		
		for(Sandwich s : list) {
			if(!set.contains(s.getClientName())) {
				list2.add(s);
				set.add(s.getClientName());
			}
		}
		
		System.out.println(list2);
	}
}

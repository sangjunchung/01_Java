package com.kh.test.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPre {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("사과");
		set1.add("바나나");
		set1.add("오렌지");

		System.out.println("HashSet : " + set1);

		Set<Integer> set2 = new TreeSet<>();
		set2.add(5);
		set2.add(2);
		set2.add(8);

		System.out.println("TreeSet : " + set2);

		Set<String> set3 = new LinkedHashSet<>();
		set3.add("영화");
		set3.add("드라마");
		set3.add("티비");

		System.out.println("LinkedHashSet : " + set3);
	}
}

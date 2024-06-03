package java_practice;

import java.util.ArrayList;

public class Java_practice2_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("김철수");
		list.add("박재석");
		list.add("윤민식");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list.add(2, "이영희");
		System.out.println(list);
		
		list.remove("박재석");
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
	}
}

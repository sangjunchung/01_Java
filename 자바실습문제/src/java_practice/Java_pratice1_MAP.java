package java_practice;

import java.util.HashMap;
import java.util.Map;

public class Java_pratice1_MAP {

	public static void main(String[] args) {
		Map<String, Integer> studentScores = new HashMap<>();
		
		studentScores.put("홍길동", 85);
		studentScores.put("김철수", 60);
		studentScores.put("박재석", 88);
		studentScores.put("윤민식", 42);
		
		System.out.println(studentScores);
		
		String studentName = "홍길동";
		System.out.println(studentScores.get(studentName));
		
		for(Map.Entry<String, Integer> list : studentScores.entrySet()) {
			System.out.println(list);
		}
		
		studentScores.put("윤민식", 88);
		System.out.println(studentScores);
		
		studentScores.remove("박재석");
		System.out.println(studentScores);
		
		System.out.println(studentScores.isEmpty());
		System.out.println(studentScores.size());
		
	}
}

package com.kh.serialEx;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		String fileName = "student.txt";
		
		Student std = new Student("박말숙", 30);
		
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(std);
			
			oos.close();
			fos.close();
			
			System.out.println("객체를 직렬화해서 파일에 저장했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

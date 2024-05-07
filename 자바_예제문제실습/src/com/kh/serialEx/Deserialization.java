package com.kh.serialEx;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		String fileName = "student.txt";
		
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student std = (Student) ois.readObject();
			
			ois.close();
			fis.close();
			
			System.out.println("파일로부터 객체를 역직렬화했습니다.");
			System.out.println("역직렬화된 학생 txt : "+std);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

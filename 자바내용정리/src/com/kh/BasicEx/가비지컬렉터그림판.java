package com.kh.BasicEx;

public class 가비지컬렉터그림판 {

	public static void main(String[] args) {
		String phone = "010"; // 가비지컬렉션에 의해 Heap에서 사라짐
		phone += "-1234-5678";
		System.out.println(phone);
	}
}

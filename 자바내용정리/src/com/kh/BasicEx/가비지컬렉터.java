package com.kh.BasicEx;

/*
Garbage Collection 
	더 이상 사용되지 않는 객체나 변수를 자동으로 정리하는 방식
*/

public class 가비지컬렉터 {
	// 필드에 작성하는 변수 = 전역변수
	public static void main(String[] args) {
		// 메서드 안에 작성하는 변수 = 지역변수
		String address = "https://";
		address += "www.naver.com";
		
		System.out.println(address);
	}
}

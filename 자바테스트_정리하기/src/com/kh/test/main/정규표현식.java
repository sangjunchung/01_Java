package com.kh.test.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 정규표현식 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("한글을 입력하세요 : ");
		String input = sc.nextLine();

		if (Pattern.matches("^[가-힣]*$", input)) {
			System.out.println("입력한 문자열은 한글입니다.");
		} else {
			System.out.println("한글만 입력해주세요.");
		}
		*/
		System.out.print("전화번호를 입력하세요 : ");
		String phone = sc.nextLine();
		
		if(Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", phone)) {
			System.out.println("올바른 전화번호입니다.");
		} else {
			System.out.println("전화번호를 제대로 입력해주세요.");
		}
	}
}

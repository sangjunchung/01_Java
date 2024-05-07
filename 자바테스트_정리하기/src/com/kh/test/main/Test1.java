package com.kh.test.main;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1부터 100 사이의 정수 입력 : ");
		int num = sc.nextInt();

		if (num > 0 && num < 101) {
			if (num % 2 == 0) {
				System.out.println("2의 배수입니다.");
			} else {
				System.out.println("2의 배수가 아닙니다.");
			}
		} else {
			System.out.println("1 ~ 100 사이 값만 입력해주세요.");
		}
		
		System.out.println("=== if  else if  else ===");
		
		int number = 5;
		
		if (number > 0) {
			System.out.println("양수입니다.");
		} else if (number < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0 입니다.");
		}
		sc.close();
	}

}

package com.kh.test.main;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			String m;

			switch (num) {
			case 1:
				m = "월요일 : 업무";
				break;
			case 2:
				m = "화요일 : 공부";
				break;
			case 3:
				m = "프로그램 종료";
				sc.close();
				return;
			default:
				m = "날짜와 관계없이 휴식";
			}

			System.out.println("일정 : " + m);
		}
	}
}

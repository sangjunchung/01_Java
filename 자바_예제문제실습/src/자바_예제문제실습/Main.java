package 자바_예제문제실습;

import java.util.Scanner;

/*
사용자에게 문자열을 입력 받아 문자열의 길이를 출력하기
입력한 문자열이 finish 면 프로그램을 종료하게 하길 원함
*/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean checkFinish = true;

		while (checkFinish) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			if(str.equalsIgnoreCase("finish")) {
				checkFinish = false;
			} else {
				System.out.println("입력한 문자열 길이 : "+str.length());
			}
			if(checkFinish) System.out.println();
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}

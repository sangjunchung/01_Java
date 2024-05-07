package com.kh.test.main;

public class Test8 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int result = (num1 > num2) ? num1 : num2;
		System.out.println(result);

		int num3 = 15;
		String as = (num3 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(as);

		int age = 18;
		String re = (age > 20) ? "성인" : "미성년자";
		System.out.println(re);

		int kor = 80;
		int eng = 75;
		int math = 90;
		String rel = (kor >= 60 && eng >= 60 && math >= 60) ? "합격" : "불합격";
		System.out.println(rel);

		int num4 = 10;
		int num5 = 20;
		String res = (num4 == num5) ? "같은 수" : "다른 수";
		System.out.println(res);
	}
}

package com.kh.numberSystem;

public class 숫자시스템 {

	public static void main(String[] args) {
		int num = 42;

		String a2 = Integer.toBinaryString(num);
		System.out.println(a2);

		String a8 = Integer.toOctalString(num);
		System.out.println(a8);

		String a10 = Integer.toHexString(num);
		System.out.println(a10);

		String a22 = "101010";
		int num10 = Integer.parseInt(a22, 2);
		System.out.println(num10);
		
		String a82 = "52"; // 8진수 52 == 10진수 42
		int num102 = Integer.parseInt(a82, 8);
		System.out.println(num102);
		
		String a16 = "2A"; // 16진수 2A == 10진수 42
		int num103 = Integer.parseInt(a16, 16);
		System.out.println(num103);
	}
}

package com.kh.test.main;

public class Test2 {

	public static void main(String[] args) {

		for (int i = 2; i <= 5; i++) {
			if (i % 2 == 0) {
				continue;
			}
			for (int j = 1; j < 10; j++) {
				if (j % 2 == 0) {
					continue;
				} else {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
		}
	}
}

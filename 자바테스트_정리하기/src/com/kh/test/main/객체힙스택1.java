package com.kh.test.main;

public class 객체힙스택1 {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("차1 : " + car1);
		System.out.println(car1.getModel());
		System.out.println(car1.getColor());
		System.out.println(car1.getYear());

		Car car2 = new Car("소나타", 2019, "화이트");
		System.out.println("차2 : " + car2);
		System.out.println(car2.getModel());
		System.out.println(car2.getColor());
		System.out.println(car2.getYear());
	}
}

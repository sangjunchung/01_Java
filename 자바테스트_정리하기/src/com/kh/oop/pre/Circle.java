package com.kh.oop.pre;

public class Circle implements Shape, Drawable {

	@Override
	public void draw() {
		System.out.println("원을 예쁘게 그립니다.");
	}

	@Override
	public double Area() {
		return 4.8;
	}
}

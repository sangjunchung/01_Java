package com.kh.oop.pre;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("고양이가 "+super.getName() + " 야옹");
	}
}

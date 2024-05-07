package com.kh.oop.pre;

public class Animal {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Animal(String name) {
		this.name = name;
	}

	public void makeSound() {
		System.out.println(name + "가 소리를 냅니다.");
	}

}

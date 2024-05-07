package com.kh.test.main.oop;

public class Child extends Parent{
	int chi;
	
	public Child() {
	
	}
	
	public Child(int chi) {
		super();
		this.chi = chi;
	}
	
	public Child(int inPar, int chi) {
		super(inPar);
		this.chi = chi;
	}
	
	public void cMethod() {
		super.pMethod();
		System.out.println("자식도 호출되었습니다.");
	}
}

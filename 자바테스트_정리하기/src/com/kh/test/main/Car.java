package com.kh.test.main;

public class Car {
	private String model;
	private int year;
	private String color;

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public Car() {
		this("K5", 2020, "검정색");
	}

	public Car(String inModel, int inYear, String inColor) {
		this.model = inModel;
		this.year = inYear;
		this.color = inColor;
	}

	public String info() {
		return this.year + "년식 " + this.model + " " + this.color;
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.info());
	}
}

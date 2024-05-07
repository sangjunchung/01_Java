package com.kh.hamburger;

public class HamburgerOrder {
	private String clinetName;
	private String burgerType;

	public void setClinetName(String clinetName) {
		this.clinetName = clinetName;
	}

	public void setBurgerType(String burgerType) {
		this.burgerType = burgerType;
	}

	public String getClinetName() {
		return clinetName;
	}

	public String getBurgerType() {
		return burgerType;
	}

	public HamburgerOrder(String inName, String inType) {
		this.clinetName = inName;
		this.burgerType = inType;
	}

	@Override
	public String toString() {
		return clinetName + " " + burgerType;
	}

}

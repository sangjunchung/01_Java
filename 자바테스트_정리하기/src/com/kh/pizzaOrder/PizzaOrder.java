package com.kh.pizzaOrder;

public class PizzaOrder {
	private String clientName;
	private String pizzaType;

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public String getClientName() {
		return clientName;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public PizzaOrder(String inName, String inType) {
		this.clientName = inName;
		this.pizzaType = inType;
	}
	
	@Override
	public String toString() {
		return clientName + " " + pizzaType;
	}
}

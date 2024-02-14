package com.test06.entity;

public class Coffee extends Drink {

	public int COFFEE_PRICE = 100;
	static final String name = "커피";
	
	public Coffee() {
		super.setPrice(COFFEE_PRICE);
	}
	
	public static String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "커피      " + COFFEE_PRICE + "원";
	}
}

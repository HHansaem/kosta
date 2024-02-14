package com.test06.entity;

public class Juice extends Drink {
	public int JUICE_PRICE = 200;
	static final String name = "주스";
	
	public Juice() {
		super.setPrice(JUICE_PRICE);
	}
	
	public static String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "주스      " + JUICE_PRICE + "원";
	}
}

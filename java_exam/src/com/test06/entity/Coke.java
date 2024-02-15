package com.test06.entity;

public class Coke extends Drink {
	public int COKE_PRICE = 50;
	static final String name = "코크";
	
	public Coke() {
		super.setPrice(COKE_PRICE);
	}
	
	@Override
	public String toString() {
		return "코크      " + COKE_PRICE + "원";
	}
}

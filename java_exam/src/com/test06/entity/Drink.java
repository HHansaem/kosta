package com.test06.entity;

public class Drink {
	private int price;  //잔액
	
	public Drink() {}
	
	public Drink(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

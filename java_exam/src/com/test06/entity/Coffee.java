package com.test06.entity;

public class Coffee extends Drink {
	public static final int COFFEE_PRICE = 100;
	public static final String DRINK_NAME = "커피";
	
	public Coffee() {
		//static변수가 아니라면 이 생성자가 호출되고 변수가 생성되기 때문에 오류남. (static이면 번수가 먼저 생성되어 있음)
		super(COFFEE_PRICE); 
	}
	
	@Override
	public String toString() {
		return DRINK_NAME + "\t" + COFFEE_PRICE + "원";
	}
}

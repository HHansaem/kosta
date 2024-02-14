package com.test04;

public class Cargoplane extends Plane {
	
	public Cargoplane() {}
	
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	void flight(int distance) {
		int discrease = -((distance/10) * 50);
		setFueSize(discrease);
	}
}

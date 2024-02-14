package com.test04;

public class Airplane extends Plane {
	
	public Airplane() {}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	void flight(int distance) {
		int discrease = -((distance/10) * 30);
		setFueSize(discrease);
	}
}

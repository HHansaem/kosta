package com.test04;

public abstract class Plane {
	private String planeName;
	private int fueSize;
	

	public Plane() {}
	
	public Plane(String planeName, int fueSize){
		this.planeName = planeName;
		this.fueSize = fueSize;
	}
	
	public String getPlaneName() {
		return planeName;
	}
	
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	
	public int getFueSize() {
		return fueSize;
	}
	
	public void setFueSize(int fueSize) {
		this.fueSize += fueSize;
	}

	//주유 (일정양의 연료 주입, 기존 연료가 증가됨.)
	public void refuel(int fuel) {
		setFueSize(fuel);
	}
	
	//운항 (일정거리만큼 운항, 연료감소. 추상메소드로서 하위클래스에서 반드시 구현)
	 abstract void flight(int distance);
}

package com.test06.biz;

import com.test06.entity.Drink;

public class VendingMachineBiz implements IVendingMachineBiz {
	private int balance = 1000;  //현재 잔액
	private Drink[] cartListDrinks = new Drink[3];  //구입목록 배열
	private int count = 0;  //배열 갯수
	
	@Override  //음료수 구매 로직
	public void cartDrink(Drink drink) {
		if(drink.getPrice() > balance) {
			System.out.println("잔액이 부족하여 구매 불가능합니다.");
		} else {
			balance -= drink.getPrice();
			System.out.println(drink +"를 구입했습니다. 현재 잔액: " + balance + "원");
			cartListDrinks[count++] = new Drink(drink.getPrice());
		}
		
		if(cartListDrinks.length == count) {
			Drink[] newCartListDrinks = new Drink[cartListDrinks.length * 3];
			for(int i = 0; i < cartListDrinks.length; i++) {
				newCartListDrinks[i] = cartListDrinks[i];
			}
			cartListDrinks = newCartListDrinks;
		}
	}
	
	@Override  //구매 목록 배열에 저장된 정보를 출력
	public void printCart() {
		System.out.println("===== 음료수 구입 목록 =====");
		int juiceCnt = 0;
		int coffeeCnt = 0;
		int cokeCnt = 0;
		for(Drink d : cartListDrinks) {
			if(d.equals("주스")) {
				juiceCnt++;
			} else if(d.equals("커피")) {
				coffeeCnt++;
			} else {
				cokeCnt++;
			}
		}
		System.out.println("주스 : " + juiceCnt + " 개");
		System.out.println("커피 : " + coffeeCnt + " 개");
		System.out.println("코크 : " + cokeCnt + " 개");
		
	}
	
	@Override  //음료수 자판기내의 모든 음료수를 출력
	public void printDrinkList(Drink[] drinkList) {
		System.out.println("================");
		System.out.println("음료수명    가격");
		System.out.println("================");
		for(Drink d : drinkList) {
			System.out.println(d);
		}
		System.out.println("----------------");
		System.out.println("현재 잔액: " + balance + "\n");
	}
	
}

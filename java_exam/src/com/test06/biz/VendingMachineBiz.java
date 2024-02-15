package com.test06.biz;

import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineBiz implements IVendingMachineBiz {
	private int balance = 1000;  //현재 잔액
	private Drink[] cartListDrinks = new Drink[3];  //구입목록 배열
	private int count = 0;  //배열 갯수
	
	@Override  //음료수 구매 로직
	public void cartDrink(Drink drink) {
		String drinkName = "";
		if(drink instanceof Coffee) {
			drinkName = Coffee.DRINK_NAME;
		} else if(drink instanceof Juice) {
			drinkName = Juice.DRINK_NAME;
		} else if(drink instanceof Coke) {
			drinkName = Coke.DRINK_NAME;
		}

		//1.잔액 확인
		if(balance < drink.getPrice()) {
			System.out.println("잔액이 부족하여 " + drinkName + " 구매 불가능합니다.");
			return;
		} 
		
		//2.카트 크기 확인
		if(cartListDrinks.length == count) {
			Drink[] newCartListDrinks = new Drink[cartListDrinks.length * 3];
//			for(int i = 0; i < cartListDrinks.length; i++) {
//				newCartListDrinks[i] = cartListDrinks[i];
//			}
			System.arraycopy(cartListDrinks, 0, newCartListDrinks, 0, cartListDrinks.length);
			cartListDrinks = newCartListDrinks;
		}
		
		//3.돈 지불
		balance -= drink.getPrice();
		System.out.println(drinkName +"를 구입했습니다. 현재 잔액: " + balance + "원");
		cartListDrinks[count++] = drink;
	}
	
	@Override  //구매 목록 배열에 저장된 정보를 출력
	public void printCart() {
		int juiceCnt = 0;
		int coffeeCnt = 0;
		int cokeCnt = 0;
		int totalAmt = 0;
		for(int i = 0; i < count; i++) {
			if(cartListDrinks[i] instanceof Coffee) {
				coffeeCnt++;
			} else if(cartListDrinks[i] instanceof Juice) {
				juiceCnt++;
			} else if(cartListDrinks[i] instanceof Coke) {
				cokeCnt++;
			}
			totalAmt += cartListDrinks[i].getPrice();
		}

		System.out.println("===== 음료수 구입 목록 =====");
		System.out.println(Juice.DRINK_NAME + " : " + juiceCnt + " 개");
		System.out.println(Coffee.DRINK_NAME + " : " + coffeeCnt + " 개");
		System.out.println(Coke.DRINK_NAME + " : " + cokeCnt + " 개");
		System.out.println("=========================");
		System.out.println("사용 금액 : " + totalAmt + " 개");
		System.out.println("남은 금액 : " + balance + " 개");
		
	}
	
	@Override  //음료수 자판기내의 모든 음료수를 출력
	public void printDrinkList(Drink[] drinkList) {
		System.out.println("================");
		System.out.println("음료수명\t가격");
		System.out.println("================");
		for(Drink d : drinkList) {
			System.out.println(d);
		}
		System.out.println("----------------");
		System.out.println("현재 잔액: " + balance + "\n");
	}
	
}

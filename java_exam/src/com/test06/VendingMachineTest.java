package com.test06;

import java.util.Scanner;

import com.test06.biz.VendingMachineBiz;
import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineTest {

	VendingMachineBiz vending = new VendingMachineBiz();
	Scanner sc = new Scanner(System.in);
	
	public void printMenu() {
		while(true) {

			System.out.println("===========================");
			System.out.println("[음료수 자판기 관리 시스템]");
			System.out.println("1.전체 음료수 및 잔액 보기");
			System.out.println("2.주스 구입하기 ( 200원 )");
			System.out.println("3.커피 구입하기 ( 100원 )");
			System.out.println("4.코크 구입하기 ( 50원 )");
			System.out.println("5.구입한 음료수 목록 보기");
			System.out.println("9.종료");
			System.out.println("\n===========================");
			System.out.print("메뉴 입력 => ");
			int choice = sc.nextInt();
			
			if(choice == 9) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			Drink[] drinkList = new Drink[3];
			drinkList[0] = new Coffee();
			drinkList[1] = new Coke();
			drinkList[2] = new Juice();

			switch (choice) {
			case 1:
				vending.printDrinkList(drinkList);
				break;
			case 2:
				vending.cartDrink(drinkList[2]);
				break;
			case 3:
				vending.cartDrink(drinkList[0]);
				break;
			case 4:
				vending.cartDrink(drinkList[1]);
				break;
			case 5:
				vending.printCart();
				break;
			}

		}
	}

	public static void main(String[] args) {
		VendingMachineTest main = new VendingMachineTest();
		main.printMenu();
	}
}

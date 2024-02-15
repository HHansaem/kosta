package com.test06;

import java.util.Scanner;

import com.test06.biz.VendingMachineBiz;
import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineTest {

	private static void printMenu() {

			System.out.println("\n===========================");
			System.out.println("[음료수 자판기 관리 시스템]");
			System.out.println("1.전체 음료수 및 잔액 보기");
			System.out.println("2.주스 구입하기 ( 200원 )");
			System.out.println("3.커피 구입하기 ( 100원 )");
			System.out.println("4.코크 구입하기 ( 50원 )");
			System.out.println("5.구입한 음료수 목록 보기");
			System.out.println("9.종료");
			System.out.println("\n===========================");
			System.out.print("메뉴 입력 => ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Drink[] drinkList = {new Coffee(), new Juice(), new Coke()};
		
		VendingMachineBiz biz = new VendingMachineBiz();
		while(true) {
			printMenu();
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				biz.printDrinkList(drinkList);
				break;
			case "2":
				biz.cartDrink(new Juice());
				break;
			case "3":
				biz.cartDrink(new Coffee());
				break;
			case "4":
				biz.cartDrink(new Coke());
				break;
			case "5":
				biz.printCart();
				break;
			case "9":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default : 
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				break;
			}
		}
	}
}

package chapter05;

public class Exercise5_06 {
	public static void main(String[] args) {
		
		//다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변수 money의 
		//금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		//단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다.
		
		//큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money = " + money);
		
		int[] coinCnt = new int[coinUnit.length];  //동전 개수를 담을 배열
		
		for(int i = 0; i < coinUnit.length; i++) {
			coinCnt[i] = money / coinUnit[i]; 
			money -= coinUnit[i] * coinCnt[i];  //카운트한 동전은 총 money에서 빼기
			System.out.println(coinUnit[i] + "원: " + coinCnt[i]);
		}
	}
}

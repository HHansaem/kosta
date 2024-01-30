package chapter06;

public class Exercise6_08 {

	//다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오. 

	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1,1);
	}
}

class PlayingCard {
	int kind;
	int num;
	static int width;
	static int height;
	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}
}

//풀이
//클래스변수(static 변수) : width, height
//인스턴스변수 : kind, num  -> class 안의 변수
//지역변수 : card, k, n, args  -> 함수 안의 변수
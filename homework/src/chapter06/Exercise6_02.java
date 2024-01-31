package chapter06;

class SutdaCard {
	int num;  //카드의 숫자(1~10사이의 정수)
	boolean isKwang;  //광(光)이면 true, 아니면 false
	
	SutdaCard() {
		num =  1;
		isKwang = true;
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang? "K":"");
	}
}

public class Exercise6_02 {
	
	//StudaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
	//결과와 같은 결과를 얻도록 하시오.

	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}



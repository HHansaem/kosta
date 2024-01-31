package chapter07;

//다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
//위해서는 코드를 어떻게 바꾸어야 하는가?

class Product
{
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	
	Product() {}
	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
}
class Tv extends Product {
//	Tv() {}  // => 해당 라인에서 에러가 발생한다. main에서 Tv객체를 생성했기 때문에 Tv class에서는 기본 생성자가 
			 //	   실행된다. 그리고 Tv의 부모 calss인 product class에도 기본 생성자를 추가해줘야 한다.
	
	public String toString() {
		return "Tv";
	}
}


public class Exercise7_05 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}


//+[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인가?
//	조상 클래스에 선언된 변수들을 초기화하기 위해서이다.



package chapter07;

//  다음의 코드를 실행한 결과를 적으시오.

public class Exercise7_20 {
	
	public static void main(String[] args) {
		
		Parent1 p = new Child1();  //업캐스팅
		Child1 c = new Child1();
		System.out.println("p.x = " + p.x);  //100 -> 부모타입이니까 (오버라이딩을 제외하고, 타입이 우선순위임)
		p.method();  //Child Method -> 오버라이딩된 메서드이기 때문에 new한 자식의 메서드 호출
		System.out.println("c.x = " + c.x);  //200
		c.method();  //Child Method
	}
}

class Parent1 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child1 extends Parent1 {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}

class Parent1 {
	int x = 10;
	void method2() {
		System.out.println("Parent1 method2");
	}
	
	void method3() {
		System.out.println("Parent1 method3");
	}
}

class Child1 extends Parent1 {
	int x = 20;
	void method() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);  //내 거랑 부모 거랑 같은 변수가 있을 때 부모 변수를 가리킬 때 super 사용
	}
	
	void method1() {
		method2();
		this.method2();
		super.method2();  ////내 거랑 부모 거랑 같은 함수가 있을 때 부모 함수를 가리킬 때 super 사용
	}
	
	void method2() {
		System.out.println("Child1 method2");
	}
	
	void method3() {
		super.method3();
		System.out.println("Child1 method3");
	}
}

public class InheritTest5 {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.method3();
	}
}

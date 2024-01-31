package chapter07;

//다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
//x = 200

class Parent {
	int x=100;
	
	Parent() {  //3
		this(200);  //생성자에서 생성자 호출
	}
	
	Parent(int x) {  //4
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;
	
	Child() {  //1
		this(1000);  //매개변수가 있는 생성자 호출(생성자에서 생성자 호출)
	}
	
	Child(int x) {  //2  생성자 내부에서 super(); 호출 => 부모 클래스의 기본 생성자 호출
		this.x = x;
	}
}

public class Exercise7_07 {
	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println("x="+c.getX());
	}

}

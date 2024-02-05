abstract class Unit {
	abstract void move();
	void method1() {}
}

interface Atackable {
	void attack();
}

class Fighter extends Unit implements Atackable {

	@Override
	public void attack() {}

	@Override
	void move() {}
	
	void method2() {}
}

public class InterfaceTest1 {
	public static void main(String[] args) {
		Fighter f1 = new Fighter();
		f1.move();
		f1.attack();
		f1.method1();
		f1.method2();
		
		Unit f2 = new Fighter();
		f2.move();  //다형성(new Fighter로 오버라이딩한 move() 호출)
		f2.method1();
//		f2.attack();  //X
//		f2.method2();  //X
		
		Atackable f3 = new Fighter();
		f3.attack();  //다형성(new Fighter로 오버라이딩한 attack() 호출)
//		f3.method1();  //X
//		f3.move();  //X
//		f3.method2();  //X
		
		Object f4 = new Fighter();  //Object엔 기능 없으니 호출할 수 있는 거 없음
//		f4.attack();  //X
//		f4.method1();  //X
//		f4.move();  //X
//		f4.method2();  //X
	}
}

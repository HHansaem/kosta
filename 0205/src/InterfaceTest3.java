interface Movable {
	void move();
}

class Car {
	void transfer(Movable m) {
		if(m != null) {
			m.move();
		}
	}
}

public class InterfaceTest3 {
	public static void main(String[] args) {
		Car car = new Car();
		//한 번만 사용할 때는 클래스로 빼지 않고 이렇게 익명클래스 사용
		car.transfer(new Movable() {  //일시적으로 한번만 사용되고 버려지는 객체(재사용X)
			@Override
			public void move() {
				System.out.println("자동차가 이동한다");
			}
		});
	}
}
//자동차가 이동한다
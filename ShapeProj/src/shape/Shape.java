package shape;

public abstract class Shape {
	
	String color;
	
	public Shape() {
		this("연회색");
	}
	public Shape(String color) {
		this.color = color;
	}
	
	abstract public void draw();  //여기선 안 쓰는데 자식들에서 사용할 거기 때문에 추상 메서드로 선언
	//추상 메서드 => 나 상속 받은 애들은 무조건 이 메서드 오버라이드 해! 라는 의미
}

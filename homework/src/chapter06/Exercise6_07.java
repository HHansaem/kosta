package chapter06;

public class Exercise6_07 {

	//문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오.

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		// p(1,1)과 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2));
		//매개변수 타입 다르게 오버로딩
		System.out.println(p.getDistance(new MyPoint(2, 2)));  
	}

}

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
	}
	
	double getDistance(MyPoint m) {  //오버로딩
		return Math.sqrt((x - m.x)*(x - m.x) + (y - m.y)*(y - m.y));
	}
}

package chapter07;

//아래는 도형을 정의한 Shape클래스이다. 이 클래스를 조상으로 하는 Circle클래스와 
//Rectangle클래스를 작성하시오. 이 때, 생성자도 각 클래스에 맞게 적절히 추가해야한다.

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));  //this() => 같은 클래스 내의 다른 생성자 호출
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드(추상 메서드)
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}

class Circle extends Shape {
	double r;
	
	public Circle(double r) {
		this.r = r;
	}

	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}	

	@Override
	double calcArea() {
		return r * r * Math.PI;  //Math class 사용해 PI값 얻기
	}
}

class Rectangle extends Shape {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Point p, int width, int height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	@Override
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		if(width == height) {
			return true;
		} else return false;
	}
}


public class Exercise7_22 {
	
	static double sumArea(Shape[] arr) {
		 
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Shape[] ss = new Shape[4];
		ss[0] = new Circle(new Point(5,5), 10);
		ss[1] = new Circle(20);
		ss[2] = new Rectangle(new Point(3,3), 20, 10);
		ss[3] = new Rectangle(30, 10);
		
		for(int i = 0; i < ss.length; i++) {
			System.out.println(ss[i].calcArea());
		}
		
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합:"+sumArea(arr));
	}
}

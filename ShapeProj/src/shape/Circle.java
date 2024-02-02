package shape;

public class Circle extends Shape {
	
	Point center;
	int radius;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		center = new Point(x, y);
		this.radius = radius;
	}

	public Circle(Point point, int radius) {
		this.center = point;
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public int getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return "[원-중심점:" + getCenter() + ", 반지름:" + getRadius() + "]";
	}

}

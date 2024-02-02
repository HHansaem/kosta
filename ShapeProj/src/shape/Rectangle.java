package shape;

public class Rectangle extends Shape {
	
	Point startPos;
	int width;
	int height;
	
	public Rectangle() {}
	
	public Rectangle(int x, int y, int width, int height) {
		startPos = new Point(x, y);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Point startPos, int width, int height) {
		this.startPos = startPos;
		this.width = width;
		this.height = height;
	}
	
	public Point getStartPos() {
		return startPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "[사각형-시작점" + getStartPos() + ", 가로:" + getWidth() + ", 세로:" + getHeight() + "]";
	}
	
}

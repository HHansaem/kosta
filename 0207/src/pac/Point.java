package pac;

//public class Point implements Cloneable {  //clone예외 던져주면 implements Cloneable해줘야 함
//	int x;
//	int y;
//	
//	@Override
//	public String toString() {
//		return String.format("[%d,%d]", x, y);
//	}
//	
//	@Override  //깊은 복사
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
//}

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("[%d,%d]", x, y);
	}
	
	@Override  //깊은 복사
	public Object clone() {  //throw CloneNotSupportedException 지우고 이렇게 return값 바꿔도 됨
		return new Point(x,y);
	}
}
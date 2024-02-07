import pac.Point;

public class ObjectTest5 {
	
	public static void main(String[] args) {
		Point p1 = new Point(3, 5);
//		try {
//			Point p2 = (Point)p1.clone();  //깊은 복사 메서드 clone
//			System.out.println(p1);
//			System.out.println(p2);
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
		Point p2 = (Point)p1.clone();  //깊은 복사 메서드 clone
		System.out.println(p1);
		System.out.println(p2);
		p1.setX(100);
		System.out.println(p1);
		System.out.println(p2);
	}
	
}

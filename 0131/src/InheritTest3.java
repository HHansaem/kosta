class Point {
	int x;
	int y;
	
	Point() {}  //다른 생성자가 있다면, 자식을 위한 기본 생성자 필요 -> 자식 생성자보다 먼저 호출
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "(" + x + "," + y + ")";
	}
}

class Point3D extends Point { //=>Point3D 기본생성자보다 Point 기본생성자가 먼저 호출됨
	int z;
	
	Point3D() {}  //누군가 본 클래스를 상속받아 사용할 수 있기 때문에 기본생성자는 적는 게 좋음
	Point3D(int x, int y, int z){
		super(x, y);  //super()는 생성자의 맨앞 줄에 와야 함
		this.z = z;
	}
	
	@Override
	String getLocation() {
		return "(" + x + "," + y + "," + z + ")";
	}
}

public class InheritTest3 {
	public static void main(String[] args) {
		Point p2 = new Point(10,20);
		System.out.println(p2.getLocation());
		
		Point3D p3 = new Point3D(100,200,300);
		System.out.println(p3.getLocation());
	}
}

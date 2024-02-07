
public class ObjectTest4 {
	
	public static void main(String[] args) {
		Person p1 = new Person("고길동", 20);
		Person p2 = new Person("고길동", 20);
		Person p3 = new Person("고길동", 30);
		Person p4 = new Person("기길동", 20);
		
		//toString()는 Person 클래스에서 원하는대로 오버라이딩 해줌
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		Complex c1 = new Complex(3, 5);
		Complex c2 = new Complex(3, 5);
		Complex c3 = new Complex(5, 3);
		
		//toString()는 Complex 클래스에서 원하는대로 오버라이딩 해줌
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	}
}

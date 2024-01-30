class Person {  //class : 기능을 포함한 타입
	int age;
	String name;
}

public class ClassTest1 {
	public static void main(String[] args) {
		Person p1 = new Person();  //객체 또는 인스턴스
		p1.age = 30;
		p1.name = "홍길동";
		Person p2 = new Person();
		p2.age = 20;
		p2.name = "고길동";
		
		System.out.println(p1.name + ", " + p1.age);
		System.out.println(p2.name + ", " + p2.age);
		
	}
}

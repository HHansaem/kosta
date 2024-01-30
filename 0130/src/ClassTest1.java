class Person {  //class : 기능을 포함한 타입
	int age;
	String name;
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
	Person() {}  //기본 생성자
	Person(int a, String n) {  //생성자 (new할때만 호출)
		age = a;
		name = n;
	}
}

public class ClassTest1 {
	
	public static void main(String[] args) {
		Person p1 = new Person();  //객체 또는 인스턴스
		p1.age = 30;
		p1.name = "홍길동";
		Person p2 = new Person();
		p2.age = 20;
		p2.name = "고길동";
		
		Person p4 = new Person(25, "홍길동");
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		
		Person[] pers = new Person[3];  //Person타입의 배열 생성(객체 생성 X, 배열 3개 생성 => 모두 null값)
		pers[0] = new Person();  //객체 생성
		
	}
}

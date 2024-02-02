class Person {
	int age;
	String name;
	
	Person() {}
	Person(String naem, int age){
		this.name = naem;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름:" + name + ", 나이:" + age;
	}
}

class Student extends Person {
	String major;
	Student(String name, int age, String major){
		super(name, age);
		this.major = major;
	}
}


public class PolymoTest1 {
	public static void main(String[] args) {
		
		//자식 객체를 부모 타입에 담는 것 가능(다형성)
		Student s1 = new Student("홍길동", 20, "사회심리학");
		Person s2 = new Student("김길동", 30, "인지심리학");  //upcasting 업캐스팅
		
	}
}





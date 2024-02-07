class Person {
	int age;
	String name;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {  //논리적으로 데이터가 같으면 true 다르면 false
		if(!(obj instanceof Person)) return false;
		Person per = (Person)obj;
		return name.equals(per.name) && age == per.age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age*2;
	}
	
	@Override
	public String toString() {
		return String.format("이름:%s, 나이:%d", name, age);
	}
}

public class ObjectTest1 {
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		Person p3 = new Person("홍길동", 21);
		System.out.println(p1 == p2);  //false
		System.out.println(p1.equals(p2));  //true
		System.out.println(p1.equals(p3));  //false
	}
	
}

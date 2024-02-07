import pac.Person;

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

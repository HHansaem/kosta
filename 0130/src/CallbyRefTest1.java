
public class CallbyRefTest1 {
	public static void changePerson1(Person p) {
		p.age = 30;
		changePerson2(p);
	}
	
	public static void changePerson2(Person p) {
		p.name = "허동길";
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 25;
		p1.name = "홍길동";
		
		System.out.println(p1.info());
		changePerson1(p1);  //레퍼런스를 인자로 넘겼기 때문에 call by reference
		System.out.println(p1.info());
	}
}

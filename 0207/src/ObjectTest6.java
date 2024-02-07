import pac.Person;

public class ObjectTest6 {

	public static void main(String[] args) {
		Person p1 = new Person("김길동", 20);
		Person p2 = (Person)p1.clone();  //깊은복사
		
		p1.setAge(30);
		p1.setName("하길동");
		
		System.out.println(p1);  //p1만 바뀌고
		System.out.println(p2);  //p2는 복사한 값 그대로
	}
}
//이름:김길동, 나이:30
//이름:김길동, 나이:20
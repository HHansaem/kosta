import java.util.ArrayList;

class Person implements Comparable<Person> {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String info() {
		return "이름:" + name  + ", 나이:" + age;
	}
	
	@Override
	public String toString() {
		return "이름:" + name  + ", 나이:" + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override  //어떤 걸 기준으로 비교할 건지
	public int compareTo(Person o) {
		return o.age - age;
	}
}

public class ArrayListTest1 {
	public static void main(String[] args) {
//		<Person> -> 제네릭(generic) : ArrayList 안에 데이터를 Person으로 넣을 거야 (데이터 타입 일반화.. 미리 지정)
		ArrayList<Person> list = new ArrayList<>();  //ArrayList 객체 생성
		list.add(new Person("hong", 20));  //add()로 ArrayList에 데이터 넣어주기
		list.add(new Person("song", 30));
		list.add(new Person("gong", 35));
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));  //get()으로 ArrayList의 데이터 불러오기
//		}
		
		for(Person p : list) {  //for-each문(향상된 for문)
			System.out.println(p.info());  //제네릭 쓰면 여기서 Object말고 Person써도 다운캐스팅 안 해도 됨.
		}
	}
}

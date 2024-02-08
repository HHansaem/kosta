import java.util.HashSet;

public class HashSetTest1 {
	public static void main(String[] args) {
		
		//list와 다르게 순서가 일정하지 않고 중복 데이터가 포함되지 않는 'set'
		HashSet<Integer> hs = new HashSet<>();
		hs.add(20);
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(5);
		hs.add(30);
		
		System.out.println(hs.size());  //4 (중복 데이터는 안 들어감)
		System.out.println(hs);  //[20, 5, 10, 30] (순서가 유지되지 않음)
		
		
		HashSet<Person> phs = new HashSet<>();
		phs.add(new Person("홍길동", 20));  //equals()와 hasCode()가 같아야 같은 데이터라고 본다
		phs.add(new Person("홍길동", 20));  //즉, Person 클래스에서 equals와 hasCode를 오버라이딩 해줘야 함
		phs.add(new Person("김길동", 10));
		phs.add(new Person("김길동", 20));
		
		System.out.println(phs.size());  //3 (오버라이딩 전에는 중복 데이터까지 들어가서 결과가 4임)
		System.out.println(phs);
		
		
		HashSet<String> shs = new HashSet<>();
		shs.add("홍길동");
		shs.add("홍길동");
		shs.add("김길동");
		shs.add("김길동");
		
		System.out.println(shs);
	}
}

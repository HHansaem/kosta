import java.util.TreeSet;

public class TreeSetTest1 {
	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<>();
		tset.add("홍길동");
		tset.add("박길동");
		tset.add("홍하동");
		tset.add("조길순");
		tset.add("박상동");
		tset.add("고민순");
		System.out.println(tset);  //정렬되어 출력
		
		TreeSet<Person> pset = new TreeSet<>();
		pset.add(new Person("홍길동", 10));
		pset.add(new Person("박길동", 50));
		pset.add(new Person("홍하동", 20));
		pset.add(new Person("조길순", 30));
		pset.add(new Person("박상동", 60));
		pset.add(new Person("고민순", 40));
		//Person 클래스에 implements Comparable<Person>를 통해 Person과 Person비교하는 
		//compareTo()메서드를 오버라이딩한 후 비교 기준을 설정해준다. (o.age - age; -> 나이가 큰 순)
		System.out.println(pset);
	}
}

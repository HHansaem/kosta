import java.util.Comparator;
import java.util.TreeSet;

class Student {
	String name;
	int     ban;
	int     no;
	int     kor, eng,  math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban  = ban;
		this.no   = no;
		this.kor  = kor;
		this.eng  = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	
	public String toString() {
		return name  +","+ban +","+no +","+kor    +","+eng  +","+math
				+","+getTotal() +","+getAverage();
	}
	
}

public class TreeSetTest2 {
	public static void main(String[] args) {
		Comparator<Student> comparator = new Comparator<Student>() {  //익명클래스
			//Comparator interface 상속 받아서 생성 후 정의까지 해준 것
			@Override
			public int compare(Student o1, Student o2) {
				// - 성적순 정렬
//				return o2.getTotal() - o1.getTotal();  //성적순(총점이 높은 순) 
				//o1.getTotal() - o2.getTotal() 는 총점이 낮은 순
				
				// - 반 순으로, 같은 반이면 번호 순
				if(o1.ban == o2.ban) {  //반이 같으면
					return o1.no - o2.no;  //번호 정렬로 리턴
				} else {  //반이 다르면
					return o1.ban - o2.ban;  //반 정렬로 리턴
				}
			}
		};
		
		TreeSet<Student> tset = new TreeSet<>(comparator);
		tset.add(new Student("홍길동",1,2,100,100,100));
		tset.add(new Student("남궁성",1,3,90,70,80));
		tset.add(new Student("김자바",2,3,80,80,90));
		tset.add(new Student("이자바",2,1,70,90,70));
		tset.add(new Student("안자바",1,1,60,100,80));

		for(Student s : tset) {
			System.out.println(s);
		}
		
	}
}




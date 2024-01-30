package chapter06;

class Student {
	String name;  //학생이름
	int ban;  //반
	int no;  //번호
	int kor;  //국어점수
	int eng;  //영어점수
	int math;  //수학점수
	int sum = 0;
	float avg;

	int getTotal() {
		sum = kor + eng + math;
		return sum;
	}

	float getAverage() {
		avg = Math.round((sum / 3f) * 10) / 10f;
		return avg;
	}
	
	//여기는 Exercise6_05 문제 풀이
	Student() {}
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return String.format("%s, %d, %d, %d, %d, %d, %d, %.1f", name, ban, no, kor, eng, math, getTotal(), getAverage());
		//'%.1f'는 소수점 아래 1자리까지 나타내라는 의미
	}
}

public class Exercise6_04 {
	public static void main(String[] args) {

		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());

	}
}

package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

//	 문제11-8의 Student3클래스에 반등수(classRank)를 저장하기 위한 인스턴스변수 를 추가하였다. 
//	 반등수를 계산하고 반과 반등수로 오름차순 정렬하여 결과를 출력하시오.


class ClassTotalComparator implements Comparator { 
	public int compare(Object o1, Object o2) { 
		//반별 총점기준 내림차순
		if(o1 instanceof Student3 && o2 instanceof Student3) {
			Student3 s1 = (Student3)o1;
			Student3 s2 = (Student3)o2;
			
			if(s1.ban == s2.ban) {
				return s2.total - s1.total;  //내림차순
			} else {
				return s1.ban - s2.ban;
			}
		}
		return -1;
	} 
} 

class Exercise11_09 {

	public static void calculateClassRank(List list) { 
		// 먼저 반별 총점기준 내림차순으로 정렬한다.
		Collections.sort(list, new ClassTotalComparator()); 
		int prevBan = -1; 
		int prevRank = -1; 
		int prevTotal = -1; 
		int length = list.size(); 
		/*
	   (2) 아래의 로직에 맞게 코드를 작성하시오.
	        1. 반복문을 이용해서 list에 저장된 Student3객체를 하나씩 읽는다.
              1.1 반이 달라지면,(ban과 prevBan이 다르면)
                이전 등수(prevRank)와 이전 총점(prevTotal)을 초기화 한다. 
	          1.2 총점(total)이 이전총점(prevTotal)과 같으면
	                 이전 등수(prevRank)를 등수(schoolRank)로 한다.
	          1.3 총점이 서로 다르면,
	                 등수(schoolRank)의 값을 알맞게 계산해서 저장한다.
	                 이전에 동점자였다면, 그 다음 등수는 동점자의 수를 고려해야한다.
	                 (실행결과 참고)
              1.4 현재 반과 총점과 등수를 이전 반(prevBan),
                      이전 총점(prevTotal), 이전 등수(prevRank)에 저장한다.
		 */
		
		for(int i = 0; i < length; i++) {
			Student3 std = (Student3)list.get(i);
			
			if(std.ban != prevBan) {
				prevRank = 0;
				prevTotal = 0;
			}
			if(std.total == prevTotal) {
				std.classRank = prevRank;
				prevRank++;
			} else {
				std.classRank = prevRank + 1;
				prevRank = std.classRank;
			}
			prevBan = std.ban;
			prevTotal = std.total;
		}
		
	} // public static void calculateClassRank(List list) { 
	
	public static void calculateSchoolRank(List list) { 
		Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.
		int prevRank = -1;       // 이전 전교등수
		int prevTotal = -1;       // 이전 총점
		int length = list.size(); 

		for(int i = 0; i < length; i++) {
			Student3 std = (Student3)list.get(i);
			
			if(std.total == prevTotal) {  //동점자가 있을 경우
				std.schoolRank = prevRank;  //등수를 같게
			} else {
				std.schoolRank = i+1;
			}
			
			prevRank = std.schoolRank;  //i번째 학생 등수를 prevRank에 넣어줘서 다음 반복에서 총점이 같으면 해당 등수를 넣어줄 수 있게
			prevTotal = std.total;  //i번째 학생 총점을 prevTotal에 넣어줘서 다음 학생의 총점과 비교할 수 있게
		}
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student3("이자바",2,1,70,90,70));
		list.add(new Student3("안자바",2,2,60,100,80));
		list.add(new Student3("홍길동",1,3,100,100,100));
		list.add(new Student3("남궁성",1,1,90,70,80));
		list.add(new Student3("김자바",1,2,80,80,90));
		
		calculateSchoolRank(list);
		calculateClassRank(list);
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
}


class Student3 implements Comparable<Student3> {
	String name;
	int ban;
	int no;
	int kor, eng,  math;
	
	int total; // 총점
	int schoolRank; // 전교등수
	int classRank;// 반등수
	
	Student3(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban  = ban;
		this.no   = no;
		this.kor  = kor;
		this.eng  = eng;
		this.math = math;
		
		this.total = kor+eng+math;
	}
	
	int getTotal() {
		return total;
	}
	
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	
	public String toString() {
		return name  +","+ban +","+no +","+kor    +","+eng  +","+math
				+","+getTotal() +","+getAverage() +","+schoolRank +","+classRank;
	}
	
	//연습문제 [11-5]
//	@Override  //이름이 기본 정렬기준이 되도록 설정
//	public int compareTo(Student3 o) {
//		return name.compareTo(o.name);
//	}

	//연습문제 [11-8]
	@Override  //총점이 기본 정렬기준이 되도록 설정(내림차순)
	public int compareTo(Student3 o) {
		if(total > o.total) {
			return -1;
		} else {
			return 1;
		}
	}
	
	//연습문제 [11-8] - 답지
//	@Override
//	public int compareTo(Student3 o) {
//		if(o instanceof Student3) {
//			Student3 tmp = (Student3)o;
//			return tmp.total - this.total;
//		} else {
//			return -1;
//		}
//	}
	
	
}
package com.test02;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		//Student 객체를 3개 생성하여 List에 저장한다.
		Student s1 = new Student("홍길동", 20, 177, 74, "201301", "체육");
		Student s2 = new Student("이순신", 44, 178, 77, "201302", "체육");
		Student s3 = new Student("유관순", 18, 155, 45, "201303", "컴퓨터");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		// List에 저장된 Student 객체 정보를 출력한다.
		for(Student i : list) {
			System.out.println(i);
		}
	}
}

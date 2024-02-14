package com.test05;

import java.util.HashMap;

public class Company {
	public static void main(String[] args) {

		HashMap<Integer, Employee> map = new HashMap<>();
		// 1번의 데이터를 기반으로 객체를 생성하여 HashMap에 저장한다.
		// HashMap에 저장시 키 값은 각 객체의 Number로 한다.
		Employee e1 = new Secretary("홍길동", 1, "Secretary", 800);
		Employee e2 = new Sales("이순신", 2, "Sales", 1200);
		map.put(e1.getNumber(), e1);
		map.put(e2.getNumber(), e2);
		
		// 모든 객체의 기본 정보를 출력한다. ( for문 이용 , keySet() 이용 )
		System.out.println("name\t department\t salary");
		System.out.println("----------------------------------");
		for(Integer e : map.keySet()) {  //key값
			Employee emp = map.get(e);  //value값
			System.out.printf("%4s   %10s   %10d\n", emp.getName(),emp.getDepartment(),emp.getSalary());
		}
		
		// 모든 객체의 인센티브 100씩 지급한다.
		// 모든 객체의 정보와 세금을 출력한다. ( for문 이용 )
		System.out.println("\n인센티브 100지급\n");
		System.out.println("name\t department\t salary   tax");
		System.out.println("----------------------------------");
		for(Integer e : map.keySet()) {  //key값
			Employee emp = map.get(e);  //value값
			if(emp instanceof Secretary) {
				((Secretary) emp).incentive(100);
			} else if(emp instanceof Sales) {
				((Sales) emp).incentive(100);
			}
			System.out.printf("%4s   %10s   %10d    %.2f\n"
					, emp.getName(),emp.getDepartment(),emp.getSalary(),emp.tax());
		}

	}
}

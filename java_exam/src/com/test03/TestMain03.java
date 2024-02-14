package com.test03;

import java.util.ArrayList;
import java.util.List;

public class TestMain03 {
	public static void main(String[] args) {
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		//StringTokenizer 이용하여 List에 저장한다
		String[] newStr = str.split(",");
		List<Double> doubleList = new ArrayList<>();
		
		for(String i : newStr) {
			doubleList.add(Double.parseDouble(i));
		}
		
		//List에 저장된 데이터의 합과 평균을 구한다.
		double sum = 0;
		double avg = 0;
		
		for(Double i : doubleList) {
			sum += i;
		}
		avg = sum / doubleList.size();
		
		System.out.printf("합 계 : %.3f", sum);
		System.out.printf("\n평 균 : %.3f", avg);
		
	}
}

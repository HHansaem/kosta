import java.util.Scanner;

public class ArrayExam4 {
	public static void main(String[] args) {
		
		//6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오.
		//출력은 반올림하여 소수 첫째자리까지로 한다.
		
		Scanner sc = new Scanner(System.in);
		//1. double 배열 6개 생성
		double[] kg = new double[6];
		int sum = 0;
		double avg, result;
		//2. 입력받아 배열에 할당
		for(int i = 0; i < kg.length; i++) {
			kg[i] = sc.nextDouble();
			//3. 배열 각 요소 값의 총합 구하기
			sum += kg[i];
		}
		//4. 평균 구하여 소수 첫째자리에서 반올림
		avg = sum / (double)(kg.length);
		result = Math.round(avg * 10) / 10d;
		//5. 출력
		System.out.println(result);
		
	}
}

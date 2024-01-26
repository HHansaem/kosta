
public class ArrayExam2_04_1 {
	public static void main(String[] args) {
		
		//피보나치 - 배열 사용
		//피보나치 수열이란 첫번째 항만 1이고 나머지 항은 바로 앞의 두 항의 합과 같은 수열을 말한다.
		
		int[] fibo = new int[40];
		fibo[0] = fibo[1] = 1;
		
		for(int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		System.out.println(String.format("피보나치 수열 %d항 : %d", 10, fibo[9]));
		System.out.println(String.format("피보나치 수열 %d항 : %d", 10, fibo[19]));
		System.out.println(String.format("피보나치 수열 %d항 : %d", 10, fibo[29]));
		System.out.println(String.format("피보나치 수열 %d항 : %d", 10, fibo[39]));
		
	}
}

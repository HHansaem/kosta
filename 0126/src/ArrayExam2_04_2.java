
public class ArrayExam2_04_2 {
	public static void main(String[] args) {
		
		//피보나치 - 배열 사용 X
		
		int ppre = 1;
		int pre = 1;
		int curr;
		
		for(int i = 3; i <= 40; i++) {  //몇 항까지 구할지 범위 설정
			curr = ppre + pre;
			if(i % 10 == 0) {  //10,20,30..항 출력
				System.out.println(String.format("피보나치 수열 %d항 : %d", i, curr));
			}
			ppre = pre;
			pre = curr;
		}
		
	}
}

import java.util.Scanner;

public class ArrayExam09 {
	public static void main(String[] args) {
		
		//정수를 입력받다가 0이 입력되면 0을 제외하고 그 때까지 입력 받은 개수를 출력한 후
		//입력받은 정수를 차례대로 출력하되 그 수가 홀수이면 2배한 값을,
		//짝수인 경우에는 2로 나눈 몫을 출력하는 프로그램을 작성하시오.
		//입력되는 정수의 개수는 100개 이하이다.
		
		Scanner sc = new Scanner(System.in);
		int[] narr = new int[100];
		int i = 0, val;
		
		//0을 입력할 때까지 정수 입력받기
		for(; i < narr.length; i++) {
			val = sc.nextInt();
			if(val == 0) break;
			narr[i] = val;
		}

		System.out.println(i);  //입력 받은 개수 출력
		
		//조건에 맞게 배열 값 변경 후 출력
		for(int j = 0; j < i; j++) {
			if(narr[j] % 2 == 0) {
				narr[j] = narr[j] / 2;
			} else {
				narr[j] = narr[j] * 2;
			}
			System.out.print(narr[j] + " ");
		}
		
	}
}

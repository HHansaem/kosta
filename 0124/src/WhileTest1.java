import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		// 0이 입력될 때까지 점수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램
		int cnt = 0;
		while(true) {
			num = sc.nextInt();
			if(num == 0) {
				break;
			}
			if(num % 3 != 0 && num % 5 != 0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
		
		// 위 문제 do while문으로 해결하기
		do {
			num = sc.nextInt();
			if(num % 3 != 0 && num % 5 != 0) cnt++;
		} while(num != 0);
		System.out.println(cnt);

	}

}

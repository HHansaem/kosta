import java.util.Scanner;

public class ArrayExam2_05 {
	public static void main(String[] args) {
		
		//100 이하의 자연수를 입력받아 첫 번째 항은 100으로 두 번째 항은 입력받은 수로 초기화하고
		//다음 항부터는 전전항에서 전항을 뺀 수로 채워나가는 수열을 작성하여 그 수가 음수가 나올 때까지 출력
		
		Scanner sc = new Scanner(System.in);
		int ppre = 100;
		int pre;
		int curr;
		
		pre = sc.nextInt();
		System.out.print(ppre);
		
		while(true){
			curr = ppre - pre;
			ppre = pre;
			pre = curr;
			System.out.print(" " + ppre);
			
			if(ppre < 0) break;  //음수가 나올 때까지 출력
		}
		
	}
}

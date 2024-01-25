import java.util.Scanner;

public class ArrayExam3 {
	public static void main(String[] args) {
//		100개의 정수를 입력받을 수 있는 배열을 선언한 후 정수를 차례로 입력 받다가 -1이 입력되면 입력을
//		중단하고 -1을 제회한 마지막 세 개의 정수를 출력하는 프로그램 (입력받은 정수가 -1을 제외하고 
//		3개 미만일 경우에는 -1을 제외하고 입력받은 정수를 모두 출력한다)
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int cnt = 0, val;
		
		while(true) {
			val = sc.nextInt();
			if(val == -1) {
				break;
			}
			arr[cnt++] = val;
		}

		for(int i = cnt - 3; i < cnt; i++) {
			System.out.print(arr[i] + " ");
//			if(cnt < 3)
		}
		
	}
}

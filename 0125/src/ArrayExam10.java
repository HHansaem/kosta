import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam10 {
	public static void main(String[] args) {
		
		//20 이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("명 수를 입력하세요 : ");
		int cnt = sc.nextInt();
		int[] narr = new int[cnt];  //입력한 숫자만큼의 배열 확보
		
		for(int i = 0; i < narr.length; i++) {
			narr[i] = sc.nextInt();  //점수 입력 받기
		}
		
		//작은수에서 큰수로 정렬
		Arrays.sort(narr);
		for(int i = 0; i < narr.length; i++) {
			System.out.print(narr[i] + " ");
		}

		System.out.println();
		
		//큰수에서 작은수로 정렬
		Arrays.sort(narr);
		for(int i = narr.length - 1; i >= 0; i--) {
			System.out.print(narr[i] + " ");
		}
		
	}
}

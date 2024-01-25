import java.util.Scanner;

public class ArrayExam6 {
	public static void main(String[] args) {
		
		//세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고
		//그 때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성하시오.
		//입력받는 정수는 100개 이하이다.
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[100];
		int idx = 0, val;
		
		//1. 999가 입력될 때까지 입력 받은 값을 배열에 담기
		for(; idx < nums.length; idx++) {
			val = sc.nextInt();
			
			if(val == 999) {
				break;
			}
			
			nums[idx] = val;
		}
		
		//2. 배열에 입력된 값 중 최소값, 최대값 구하기
		int max = nums[0], min = nums[0];  //max와 min의 초기값을 배열의 첫번째 값으로 설정
		
		for(int i = 0; i < idx; i++) {  //초기값과 다음 값과 비교해가며 max, min 지정
			if(max < nums[i + 1]) {
				max = nums[i + 1];
			}else if(min > nums[i + 1]) {
				min = nums[i + 1];
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
	}
}

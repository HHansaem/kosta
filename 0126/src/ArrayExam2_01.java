import java.util.Scanner;

public class ArrayExam2_01 {
	public static void main(String[] args) {
		
		//1부터 10까지의 정수를 입력받다가 입력된 정수가 범위를 벗어나면 
		//그 때까지 1번 이상 입력된 각 숫자의 개수를 작은 수부터 출력하는 프로그램이다.
		
		Scanner sc = new Scanner(System.in);
		int[] count = new int[10];
		int num;
		
		while(true) {
			num = sc.nextInt();
			if(num < 1 || num > 10) {
				break;
			}
			count[num - 1]++;  //범위 안의 숫자면 num-1 칸에 카운트 해줌
			
		}
		
		//위에서 넣어준 count배열 데이터 출력
		for(int i = 0; i < count.length; i++) {
			if(count[i] != 0) {  //카운트된 배열만 출력
				System.out.println(i+1 + " : " + count[i] + "개");
			}
		}
		
	}
}

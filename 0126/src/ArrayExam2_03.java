import java.util.Scanner;

public class ArrayExam2_03 {
	public static void main(String[] args) {
		
		//정수를 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고 그 때까지 입력된 정수의
		//일의 자리 숫자가 각각 몇 개인지 작은 수부터 출력하는 프로그램을 작성하시오.
		//(0개인 숫자는 출력하지 마시오.)
		
		Scanner sc = new Scanner(System.in);
		int[] count = new int[9];
		int num;
		
		while(true) {
			num = sc.nextInt();
			if(num == 0) {
				break;
			}
			count[(num % 10)]++;  //일의 자리 숫자 카운트
		}
		
		//위에서 넣어준 count배열 데이터 출력
		for(int i = 0; i < count.length; i++) {
			if(count[i] != 0) {  //카운트된 배열만 출력(0개인 숫자는 출력 X)
				System.out.println(i + " : " + count[i] + "개");
			}
		}
		
	}
}

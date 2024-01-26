import java.util.Scanner;

public class ArrayExam2_02 {
	public static void main(String[] args) {
		
		//영문 대문자를 입력받다가 대문자 이외의 문자가 입력되면 입력을 중단하고 영문 대문자들에 대하여 
		//1번 이상 입력된 각 문자와 그 문자의 개수를 사전 순으로 출력하는 프로그램을 작성하시오.
		//입력되는 문자의 개수는 2개 이상 100개 이하이다.
		
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];
		int ch;
		
		while(true) {
			ch = sc.next().charAt(0);
			if(!(ch >= 'A' && ch <= 'Z')) {
				break;
			}
			count[ch - 'A']++;  ////대문자 입력했으면 대문자를 인덱스로 변환해서 카운트 해줌
		}

		//위에서 넣어준 count배열 데이터 출력
		for(int i = 0; i < count.length; i++) {
			if(count[i]!= 0) {  //카운트된 배열만 출력
				System.out.println((char)(i + 'A') + " : " + count[i] + "개");
			}
		}
		
	}
}

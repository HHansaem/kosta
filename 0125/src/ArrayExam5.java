import java.util.Scanner;

public class ArrayExam5 {
	public static void main(String[] args) {
		
		//6개의 문자배열을 만들고 {'J', 'U', 'N', 'G', 'O', 'L'}으로 초기화한 후
		//문자 한 개를 입력받아 배열에서의 위치를 출력하는 프로그램을 작성하시오.
		//첫 번째 위치는 0번이며 배열에 없는 문자가 입력되면 "none"이라는 메시지를 출력하고 끝내는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		char[] carr = {'J', 'U', 'N', 'G', 'O', 'L'};
		char val;
		int i = 0;
		
		val = sc.next().charAt(0);  //전체 문자열 받아서 첫 번째 char 값 저장
		
		for(; i < carr.length; i++) {
			if(carr[i] == val) {
				break;
			}
		}
		
		if(i ==  carr.length) {
			System.out.println("none");
		}else {
			System.out.println(i + "번째");
		}
		
	}
}

import java.util.Scanner;

public class Jungol_exam1 {

	public static void main(String[] args) {
		// 2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.
		// 단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.
		// 구구단 사이의 공백은 3칸이다.
		Scanner sc = new Scanner(System.in);
		int dan1 = sc.nextInt();
		int dan2 = sc.nextInt();
		
		
		for(int i=1; i<=9; i++) {
			if(dan1 > dan2){
				for(int dan = dan1; dan >= dan2; dan--) {
					System.out.print(String.format("%d * %d = %3d   ", dan, i, dan *i));
				}
			}else {
				for(int dan = dan1; dan <= dan2; dan++) {
					System.out.print(String.format("%d * %d = %3d   ", dan, i, dan *i));
				}
			}
			System.out.println();
		}
		
	}

}

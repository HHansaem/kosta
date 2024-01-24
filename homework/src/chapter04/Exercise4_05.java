package chapter04;

public class Exercise4_05 {
	public static void main(String[] args) {
		// 다음의 for문을 while문으로 변경하시오.
		
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		
		
		// while문으로 변경
		int num = 0;
		while(num <= 10) {
			for(int i=0; i<=num; i++) {
				System.out.print("*");
			}
			num++;
			System.out.println();
		}
	}
}

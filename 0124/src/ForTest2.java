
public class ForTest2 {
	public static void main(String[] args) {
		
		//구구단 (for문)
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 2; j <= 9; j++) {
//				System.out.print(j + " * " + i +" = " + (i * j) + "\t");
//			}
//			System.out.println();
//		}
		
		
		//구구단 (while문)
		int num = 1;
		while(num < 10) {
			for(int i = 2; i <= 9; i++) {
				System.out.print(i + " * " + num + " = " + (i * num) + "\t");
			}
			num++;
			System.out.println();
		}
		
		
	}
}

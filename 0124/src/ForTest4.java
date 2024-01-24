
public class ForTest4 {

	public static void main(String[] args) {

		//a 1 2 3 4     i=0, alpha:j<1, num:k<4
		//b c 5 6 7     i=1, alpha:j<2, num:k<3
		//d e f 8 9     i=2, alpha:j<3, num:k<2
		//g h i j 10    i=3, alpha:j<4, num:k<1
		
		char ch1 = 'a';
		int num = 1;
		int cnt = 4;
		
		for(int i = 0; i < cnt; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print((ch1++) + " ");
			}
			for(int k = cnt; k > i; k--) {
				System.out.print((num++) + " ");
			}
			System.out.println();
		}
		System.out.println();

		
		
		
		//1 2 3 A 
		//4 5 B C   
		//6 D E F  
		
		char ch2 = 'A'; 
		int num2 = 1;
		int cnt2 = 3;
		
		for(int i = 0; i < cnt2; i++) {
			for(int j = cnt2; j > i; j--) {
				System.out.print(String.format("%2d", num2++));
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print(String.format("%2c", ch2++));
			}
			System.out.println();
		}

	}

}

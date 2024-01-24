
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

	}

}

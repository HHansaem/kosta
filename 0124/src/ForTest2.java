
public class ForTest2 {
	public static void main(String[] args) {
		
		//2~9단
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i +" = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}

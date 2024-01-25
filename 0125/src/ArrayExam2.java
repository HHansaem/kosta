
public class ArrayExam2 {
	public static void main(String[] args) {
		
		// odd : 141   짝수합
		// even : 283  홀수합
		
		int[] arr = {10, 20, 25, 66, 83, 7, 22, 90, 1, 100};
		
		int odd = 0, even = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				odd += arr[i];
			}else {
				even += arr[i];
			}
		}
		
		System.out.println("odd : " + odd + "\neven : " + even);
		
	}
}

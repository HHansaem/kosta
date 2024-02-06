
public class ExceptionTest2 {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = {2, 0, 6, 8};
		
		for(int i = 0; i < arr1.length; i++) {
			try {
				System.out.println(arr1[i] / arr2[i]);
			} catch (Exception e) {
				System.out.println("by zero");
			}
		}
		
	}
}
//5
// by zero
//5
//5
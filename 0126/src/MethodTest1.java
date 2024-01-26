
public class MethodTest1 {
	
	//함수의 정의
	public static int sum(int[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {100, 200, 300, 400, 500};
		
		int hap = sum(arr1);  //함수의 호출
		System.out.println(hap);
		hap = sum(arr2);
		System.out.println(hap);
	}
}

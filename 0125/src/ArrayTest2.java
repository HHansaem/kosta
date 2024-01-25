
public class ArrayTest2 {
	public static void main(String[] args) {
		
		int[][]arr = new int[2][3];  //2차원 배열 생성(2행3열)
		//배열 초기화
		arr[0][0] = 100;
		arr[0][1] = 24;
		arr[0][2] = 77;
		arr[1][0] = 50;
		arr[1][1] = 67;
		arr[1][2] = 99;
		
		System.out.println(arr.length);  //행의 개수
		System.out.println(arr[0].length);  //열의 개수
		System.out.println(arr[1].length);  //열의 개수
		
		int[][] arr2 = {
			{1, 2}, {10, 20}, {100,200}
		};
		
		int[][] arr3;
		arr3 = new int[][] {{1, 2}, {10, 20}, {100,200}};
		
		
		//2차원 배열의 원소 합 구하기
		int sum = 0;
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				sum += arr2[i][j];
			}
		}
		System.out.println(sum);
		
	}
}

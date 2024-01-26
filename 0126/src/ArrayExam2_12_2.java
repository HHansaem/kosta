
public class ArrayExam2_12_2 {
	public static void main(String[] args) {
		
		//(0) 1 0 1 0 1 (0)
		//(0) 0 2 0 2 0 (0)
		//(0) 2 0 4 0 2 (0)
		//(0) 0 6 0 6 0 (0)
		//(0) 6 0 12 0 6 (0)
		
		int[][] arr = new int[5][7];
		arr[0][1] = arr[0][3] = arr[0][5] = 1;
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length - 1; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j + 1];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length - 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

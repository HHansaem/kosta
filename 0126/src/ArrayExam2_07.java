import java.util.Scanner;

public class ArrayExam2_07 {
	public static void main(String[] args) {
		
		//아래와 같은 파스칼 삼각형을 출력하는 프로그램을 작성하시오. 파스칼 삼각형은 첫 번째 줄 첫 번째 행을
		//1로 초기화한 후 다음 줄부터는 바로 위의 값과 바로 위 왼쪽 값을 더한 값이 된다. (0은 출력 X)
		
		// (0) 1 0 0 0 0
		// (0) 1 1 0 0 0
		// (0) 1 2 1 0 0
		// (0) 1 3 3 1 0
		// (0) 1 4 6 4 1
		
		int[][] arr = new int[5][6];  //계산 편의를 위해 맨 앞 열에 0을 넣어줄 자리를 만들어 줌
		arr[0][1] = 1;
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];  // 위의 값과 위 왼쪽 값을 더함
			}
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length; j++) {
				if(arr[i][j] != 0) {  //0 제외 배열 전체 출력
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		
	}
}

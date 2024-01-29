
public class ArrayExam2_08 {
	public static void main(String[] args) {
		
		//배열을 만들어서 아래와 같이 저장한 후 출력하는 프로그램을 작성하시오. 규칙은 첫 번째 행은 모두 1로 초기화하고
		//다음 행부터는 바로 위의 값과 바로 왼쪽 값을 더한 것이다.
		
		//(0) 1 1 1 1 1
		//(0) 1 2 3 4 5
		//(0) 1 3 6 10 15
		//(0) 1 4 10 20 35
		//(0) 1 5 15 35 70
		
		int[][] arr = new int[5][6];
		
		//첫 번째 행 1로 초기화
		for(int i = 1; i < arr[0].length; i++) {
			arr[0][i] = 1;
		}
		
		//바로 위의 값과 바로 왼쪽 값을 더해 저장
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
			}
		}
		
		//배열에 저장된 데이터 출력 (첫 번째 열은 모두 0이므로 j를 1로 초기화 해서 첫 번째 열을 출력하지 않는다.)
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
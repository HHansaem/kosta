import java.util.Scanner;

public class ArrayExam2_13 {
	public static void main(String[] args) {
		
		//4행 2열의 배열을 입력받아 가로평균과 세로평균 그리고 전체평균을 출력하는 프로그램을 작성하시오.
		//(소수점 이하는 버림한다.)
		
		//입력           출력
		//16 27        21 69 53 40
		//39 100       33 58 
		//19 88        46 
		//61 20
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][2];
		
		for(int i = 0; i < arr.length; i++) {
			String val = sc.nextLine();
			String[] sarr = val.split(" ");
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] += Integer.parseInt(sarr[j]);
			}
		}
		
		int allSum = 0;
		//가로평균 (행별)
		for(int i = 0; i < arr.length; i++) {  // i:행
			int wSum = 0;
			for(int j =0; j < arr[i].length; j++) {  // j: 열
				wSum += arr[i][j];
				allSum += arr[i][j];
			}
			System.out.print(wSum / arr[i].length + " ");
		}

		System.out.println();
		
		//세로평균 (열별)
		for(int i = 0; i < arr[0].length; i++) {  // i:열
			int hSum = 0;
			for(int j =0; j < arr.length; j++) {  // j:행
				hSum += arr[j][i];
			}
			System.out.print(hSum / arr.length + " ");
		}
		
		System.out.println();
		System.out.print(allSum / (arr.length * arr[0].length) + " ");
		
	}
}

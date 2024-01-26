package chapter05;

public class Exercise5_11 {
	public static void main(String[] args) {

		//주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열의
		//행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다.
		
		//100 100 100 300
		//20  20  20  60
		//30  30  30  90
		//40  40  40  120
		//50  50  50  150
		//240 240 240 720

		int[][] score = {
				{100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
				, {50, 50, 50}
		};
		int[][] result = new int[score.length+1][score[0].length+1];
		
		//가로 합
		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length;j++) {
				result[i][j] = score[i][j];
				result[i][score[0].length] += score[i][j];
			}
			//720 (위 for문에서 +=로 넣어준 result를 다시 +=)
			result[score.length][score[0].length] += result[i][score[0].length];  
		}

		//세로 합
		for(int i=0; i < score[0].length;i++) {  //열
			for(int j=0; j < score.length;j++) {  //행
				result[score.length][i] += score[j][i];
			}
		}
		
		//출력
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}

	}
}

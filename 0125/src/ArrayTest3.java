
public class ArrayTest3 {
	public static void main(String[] args) {
		
		// 50   50   50   50   200
		// 60   60   60   60   240
		// 70   70   70   70   280
		// 180  180  180  180  720

		int[][] score = {
				{50,50,50,50},
				{60,60,60,60},
				{70,70,70,70} };
		
		int[][] total = new int[score.length + 1][score[0].length + 1];  //총합을 넣어줄 배열
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				total[i][j] = score[i][j];  //score배열의 데이터를 total배열로 복사
				
				//복사된 데이터를 사용해 총합 계산 후 마지막 배열에 추가
				//여기서 total.length - 1 은 3, total[i].length - 1 은 4
				total[i][total[i].length - 1] += total[i][j];
				total[total.length - 1][j] += total[i][j];
				total[total.length - 1][total[i].length - 1] += total[i][j];
			}
		}
		
		//위에서 값 넣어준 배열 출력
		for(int i = 0; i < total.length; i++) {
			for(int j = 0; j < total[i].length; j++) {
				System.out.print(total[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}

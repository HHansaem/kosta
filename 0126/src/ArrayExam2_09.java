import java.util.Scanner;

public class ArrayExam2_09 {
	public static void main(String[] args) {
		
		//학생들의 점수를 입력 받다가 0이 입력되면 그 때까지 입력받은 점수를 10점 단위로 구분하여
		//점수대별 학생 수를 출력하는 프로그램을 작성하시오. (1명도 없는 점수는 출력하지 않는다.)
		//학생은 최대 100명 이하이다.
		
		Scanner sc = new Scanner(System.in);
		int[] count = new int[11];
		int score;
		
		while(true) {
			score = sc.nextInt();
			if(score == 0) break;
			count[(score / 10)]++;
		}
		
		for(int i = count.length - 1; i >= 0; i--) {  //100점대부터 역순으로 나오도록
			if(count[i] != 0) {
				System.out.println(String.format("%d : %d person", i * 10, count[i]));
			}
		}
		
	}
}

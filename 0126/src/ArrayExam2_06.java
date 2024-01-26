import java.util.Scanner;

public class ArrayExam2_06 {
	public static void main(String[] args) {

		//5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서 각 개인별로 평균이 80 이상이면 'pass'
		//그렇지 않으면 'fail'을 출력하고 합격한 사람의 수를 출력하는 프로그램을 작성하시오.
//		80 95 67 86
//		80 95 67 86
//		80 95 67 86
//		85 67 95 65
//		100 54 65 34
		
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][4];
		
		for(int i = 0; i < score.length; i++) {
			String data = sc.nextLine();
			String[] sarr = data.split(" ");  //전체 문자열을 공백 단위로 끊어서 배열로 만들기
			for(int j = 0; j < score[i].length; j++) {
				//String형태의 데이터를 int형으로 변환 후 넣기
				score[i][j] += Integer.parseInt(sarr[j]);
			}
		}
		
		//int형으로 잘 들어갔나 확인
//		for(int i = 0; i < score.length; i++) {
//			for(int j = 0; j < score[i].length; j++) {
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		int passCnt = 0;
		for(int i = 0; i < score.length; i++) {
			int total = 0;
			for(int j = 0; j < score[i].length; j++) {
				total += score[i][j];
			}
			if(total / (double)score[i].length >= 80) {
				System.out.println("pass");
				passCnt++;
			}else {
				System.out.println("fail");
			}
		}
		System.out.println("Successful : " + passCnt);
		
	}
}

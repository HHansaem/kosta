
public class ArrayTest1 {
	public static void main(String[] args) {

		int[] score = {10, 20, 30, 40, 50};  //배열 선언 및 초기화
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {  //배열 길이 만큼 반복
//			System.out.println(score[i]);
			sum += score[i];
		}
		System.out.println(sum);
		System.out.println((double)sum/score.length);
	}
}

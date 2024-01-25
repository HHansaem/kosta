public class LottoExam {
	public static void main(String[] args) {
		
		int[] lotto = new int[45];  //배열 생성
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;  //45개의 배열 초기화
		}
		
		//임시 변수 만들어서 랜덤으로 1000번 스와핑
		for(int i = 0; i < 1000; i++) {
			int rand1 = (int)(Math.random() * 45);  //0~44까지의 랜덤 숫자
			int rand2 = (int)(Math.random() * 45);
			int temp = lotto[rand1];
			lotto[rand1] = lotto[rand2];
			lotto[rand2] = temp;
		}
		
		//스와핑된 배열 중 6개 숫자 출력
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}
}

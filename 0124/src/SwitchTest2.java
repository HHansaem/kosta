
public class SwitchTest2 {

	public static void main(String[] args) {
		int kor = 89;
		int mat = 90;
		int eng = 95;
		char grade;
		
		int sum = kor + mat + eng;
		double avg = sum / 3.0;
		avg = Math.round(avg * 100) / 100.0;
		
		int temp = (int) avg / 10;
		
		switch (temp) {
		case 10:
			grade = 'A';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println(String.format("총점: %d, 평균: %.2f, 학점: %c", sum, avg, grade));
	}

}


public class IfTest {

	public static void main(String[] args) {
		int kor = 89;
		int mat = 90;
		int eng = 95;
		char grade;
		
		int sum = kor + mat + eng;
		double avg = sum / 3.0;
		avg = Math.round(avg * 100) / 100.0;  //9133.3333 => 9133 => 91.33
		
		if(avg >= 90) {
			grade = 'A';
		}else if (avg >= 80) {
			grade = 'B';
		}else if(avg >= 70) {
			grade = 'C';
		}else if(avg >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println(String.format("총점: %d, 평균: %.2f, 학점: %c", sum, avg, grade));
		
		/*
		  	소수점 둘째 자리까지 나타내는 방법
			(1) Math.round(avg * 100) / 100.0
			(2) String.format("%.2f", avg)
		*/
	}

}

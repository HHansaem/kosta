
public class OperatorTest {

	public static void main(String[] args) {
		int n1 = 10, n2 = 10;
		int r1, r2;
		
		r1 = ++n1;  //증가 후 대입
		r2 = n2++;  //대입 후 증가
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(n1);
		System.out.println(n2);
		
		
		//삼항연산자
		int x = 50, y = 30;
		int max = x > y ? x : y;
		System.out.println(max);
		
		
		//복합대입연산자
		int i = 10;
		i *= 5;  // i = i * 5
	}
}

package chapter04;

public class Exercise4_03 {
	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오
		//1
		//1+2
		//1+2+3
		//1+2+3+4
		//...
		//1+2+3+4+5+6+7+8+9+10
		
		int result = 0;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				result += j;
			}
//			System.out.println(result);
		}
		System.out.println(result);
		
	}
}

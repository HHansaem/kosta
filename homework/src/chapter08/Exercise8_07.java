package chapter08;

public class Exercise8_07 {
	
	//아래의 코드가 수행되었을 때의 실행결과를 적으시오
	
	static void method(boolean b) {
		try {
			System.out.println(1);  //(1) 1출력
			if(b) System.exit(0);  //(2) b가 true니까 해당 코드 실행(System.exit(0) => 프로그램 종료)
			System.out.println(2);
		} catch(RuntimeException r) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	
	public static void main(String[] args) { 
		method(true);
		method(false);
	} // main
}

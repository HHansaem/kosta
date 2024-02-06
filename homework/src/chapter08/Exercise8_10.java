package chapter08;

public class Exercise8_10 {

	//아래의 코드가 수행되었을 때의 실행결과를 적으시오

	public static void main(String[] args) {
		try {
			method1();  //(8) method1에서 예외 받아옴
			System.out.println(6);
		} catch(Exception e) {  
			System.out.println(7);  //(9) 예외 블럭 실행 7 출력
		}
	}
	
	static void method1() throws Exception {
		try {
			method2();  //(2) 널포인트 예외 받음
			System.out.println(1);
		} catch(NullPointerException e) {  //(3) 널포인트 catch문 실행
			System.out.println(2);  //(4) 2 출력
			throw e;  //(5) 예외 정보 던지기 (main으로)
		} catch(Exception e) {
			System.out.println(3); 
		} finally {  //(6) finally블럭 실행
			System.out.println(4);  //(7) 4 출력
		}
		System.out.println(5);
	}  // method1()
	
	static void method2() {
		throw new NullPointerException();  //(1) 널포인트 예외 던지기
	}
}

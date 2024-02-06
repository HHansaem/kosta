package chapter08;

class Exercise8_06 {
	
	//아래의 코드가 수행되었을 때의 실행결과를 적으시오.
	//3
	//5
	
	public static void main(String[] args) {
		try {
			method1();
		} catch(Exception e) {  //(4)method1에서 받아온 예외가 해당 catch문에 걸림
			System.out.println(5);  //(5)예외 처리 catch문 실행
		}
	}
	static void method1() {
		try {
			method2();  //(2)method2에서 던진 예외 받기
			System.out.println(1);
		} catch(ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);  //(3)해당하는 예외가 catch문에 없기 때문에 finally실행 후 다시 main으로 예외 가져감
		}
		System.out.println(4);
	}  // method1()
	
	static void method2() {
		throw new NullPointerException();  //(1)예외 던지기
	}
}

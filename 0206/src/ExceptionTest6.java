class MyException1 extends Exception {}
class MyException2 extends Exception {}


public class ExceptionTest6 {
	
	static void func() throws MyException1, MyException2 {  //예외 처리하지 않고 위임
		func2();
		throw new MyException2();
	}
	
	static void func2() throws MyException1 {
		throw new MyException1();  //이렇게 던지려면 함수 자체에서 예외를 던져줘야 함
	}
	
	public static void main(String[] args) {
		try {
			func();
		} catch (MyException1 e) {
		} catch (MyException2 e) {
		}
	}
}

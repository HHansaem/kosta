class Exception2 extends Exception{
	public Exception2() {
		super("사용자예외2");
	}
	
	Exception2(String msg){
		super(msg);
	}
}

class Exception3 extends Exception2{
	 public Exception3() {
		 super("사용자예외3");
	 }
}

class Exception4 extends Exception{
	 public Exception4() {
		 super("사용자예외4");
	 }
}

public class ExceptionTest7 {
	
	static public void func() throws Exception2 {
		throw new Exception2();
	}
	
	static public void func2() throws Exception3 {
		throw new Exception3();
	}

	static public void func3() throws Exception4 {
		throw new Exception4();
	}
	
	public static void main(String[] args) {
		try {
			func();  //예외발생시 받은 예외의 catch블럭 실행 후 아래 문장은 실행 X
			func2();
			func3();
		} catch (Exception4 e4) {  //상속 관계 아니기 때문에 순서 상관 X
			System.out.println(e4.getMessage());
			System.out.println("func3의 대체처리");
		} catch (Exception3 e2) {  //자식 catch를 먼저 써줘야 함
			System.out.println(e2.getMessage());
			System.out.println("func2의 대체처리");
		} catch (Exception2 e2) {  //부모 catch
			System.out.println(e2.getMessage());
			System.out.println("func의 대체처리");
		}
	}
}

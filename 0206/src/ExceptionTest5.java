
public class ExceptionTest5 {
	
	static void func() throws Exception {  //이 함수 안에서 Exception를 던지라는 것
		Exception exp = new Exception("내가 만든 예외");  //예외 만들어서
		throw exp;  //catch로 던지기 (던진 것과 catch의 예외 타입이 같아야 받아짐)
	}
	
	static void func2() throws Exception {
		func();
	}
	
	public static void main(String[] args) {
		try {
			func2();
		} catch (Exception e) {
			System.out.println("예외처리 됨");
			e.printStackTrace();
		}
	}
}

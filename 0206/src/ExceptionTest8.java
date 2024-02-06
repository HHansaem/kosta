
public class ExceptionTest8 {
	public static void main(String[] args) {
		try {
			String str = "hong";
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {  //try블럭의 예외발생 여부와 상관없이 마지막으로 무조건 실행되는 finally블럭
			System.out.println("마무리 처리");
		}
	}
}


public class ExceptionTest1 {
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			int a = 10 / 0;  //예외발생 -> catch블럭으로 이동
			System.out.println(4);
		} catch (NumberFormatException e) {  //e: try블럭에서 발생한 예외 정보
//			e.printStackTrace();  //예외에 대한 정보를 출력 ★★ 문제 발생 지점을 알기 위해 웹개발에서 많이 사용
			System.out.println("예외처리");
		} catch (ArithmeticException e) {  //발생한 예외에 맞는 catch블럭이 실행됨
			System.out.println("예외처리2");
		}
		System.out.println("종료");
	}
}

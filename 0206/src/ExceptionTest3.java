
public class ExceptionTest3 {
	public static void main(String[] args) {
		String str = null;
		//&& 연산은 앞의 결과가 거짓이면 뒤에 있는 연산을 하지 않는다.
		//|| 연산은 앞의 연산의 결과가 참이면 뒤에 있는 연산을 하지 않는다.
		if(str != null && !str.equals("")) {  
			//반드시 'str != null'을 먼저 써줘야 예외가 발생하지 않음. (str이 null이라면 null의 equals를 호출한 것이니 당연히 에러 발생)
			System.out.println("AAA");
		}
//		System.out.println(str.toString());
	}
}

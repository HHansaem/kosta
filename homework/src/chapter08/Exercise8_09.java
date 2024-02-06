package chapter08;

class UnsupportedFuctionException extends RuntimeException {
	final private int ERR_CODE;  //final 변수 => 생성자를 통한 초기화
	
	public UnsupportedFuctionException() {
		ERR_CODE = 100;
	}
	
	public UnsupportedFuctionException(String msg, int errCode) {
		super(msg);  //상위 클래스인 Exception가 msg를 가지고 있음
		this.ERR_CODE = errCode;
	}
	
	//에러코드(ERR_CODE)를 반환한다.
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	//메세지의 내용을 반환한다.(Exception클래스의 getMessage()를 오버라이딩)
	@Override
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}

public class Exercise8_09 {
	
	public static void main(String[] args) throws Exception
	{
//		try {
			throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
//		} 
//		catch (UnsupportedFuctionException e) {
//			System.out.println(e.getMessage());
//		}
	}
}

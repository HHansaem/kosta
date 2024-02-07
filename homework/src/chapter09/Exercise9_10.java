package chapter09;

public class Exercise9_10 {
	/*  
    	(1) format메서드를 작성하시오.
		1. length의 값이 str의 길이보다 작으면 length만큼만 잘라서 반환한다.
		2. 1의 경우가 아니면, length크기의 char배열을 생성하고 공백으로 채운다.
		3. 정렬조건(alignment)의 값에 따라 문자열(str)을 복사할 위치를 결정한다.
		  (System.arraycopy()사용)
		4. 2에서 생성한 char배열을 문자열로 만들어서 반환한다.
	 */
	
	// 주어진 문자열을 지정된 크기의 문자열로 변환한다. 나머지 공간은 공백으로 채운다
	// (0:왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)
	public static String format(String str, int length, int alignment) {
		if(length < str.length()) {
			return str.substring(0, length);
		}
		
		char[] charArr = new char[length];
		for(int i = 0; i < charArr.length; i++) {
			charArr[i] = ' ';
		}
		
		int startIdx;
		if(alignment == 0) {
			startIdx = 0;
		} else if(alignment == 1) {
			startIdx = (length - str.length()) / 2;
		} else {
			startIdx = length - str.length();
		}
		
//		System.arraycopy(복사할 원본 배열, 원본 배열에서 복사를 시작할 인덱스, 복사될 대상 배열, 대상 배열에서 복사가 시작될 인덱스, 복사될 요소의 개수);
//		toCharArray() : String 문자열을 char형 배열로 바꿔서 반환해주는 메서드
		System.arraycopy(str.toCharArray(), 0, charArr, startIdx, str.length());
		
		return new String(charArr);
	}
	
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
	}
}

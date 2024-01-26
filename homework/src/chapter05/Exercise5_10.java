package chapter05;

public class Exercise5_10 {
	public static void main(String[] args) {

		//다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다

		char[] abcCode = 
			{ '`','~','!','@','#','$','%','^','&','*',
					'(',')','-','_','+','=','|','[',']','{',
					'}',';',':',',','.','/'};
		// 0 1 2 3 4 5 6 7 8 9 
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abc123";
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			if(ch >= 'a' && ch <= 'z') {  //알파벳
				result += abcCode[ch - 'a'];  //소문자 알파벳 문자를 인덱스로 변환하는 방법
			} else {  //숫자 문자
				result += numCode[ch - '0'];  //숫자형 문자를 인덱스로 변환하는 방법
			}
		}
		System.out.println("src:"+src);
		System.out.println("result:"+result);


	}
}

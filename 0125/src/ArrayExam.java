public class ArrayExam {
	public static void main(String[] args) {
		
		//cafe
		//출력 결과 => 1100101011111110  (2진수로)
		
//		char[] hex = {'c', 'a', 'f', 'e'};  //임의의 char배열(숫자나 문자)
		char[] hex = {'3', '2', '9', 'D', 'E', 'F'};
		String[] binary = { 
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111" };
		String result = "";
		for(int i = 0; i < hex.length; i++) {
			if(hex[i] >= '0' && hex[i] <= '9') {  //숫자형 문자
				result += binary[hex[i] - '0'];  //char형태의 '0'을 빼주면 숫자로 변환
			} else if(hex[i] >= 'A' && hex[i] <= 'Z') {  //대문자
				result += binary[hex[i] - 'A' + 10]; //9번째까지는 숫자
			} else {  //소문자
				result += binary[hex[i] - 'a' + 10];
			}
		}
		System.out.println(result);
	}
}

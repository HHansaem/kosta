package chapter09;

public class Exercise9_09 {
	
	// 주어진 문자열에서 금지된 문자들을 제거하여 반환한다
	// StringBuffer와 String클래스의 charAt(int i)과 indexOf(int ch)를 사용하라
	public static String delChar(String src, String delCh) {
		
		StringBuffer sb = new StringBuffer(src);
		
		for(int i = 0; i < delCh.length(); i++) {  //delCh 길이 만큼 돌면서
			int pos = 0;
			char ch = delCh.charAt(i);  //i번째 문자를 뽑아 ch에 저장
			while(true) {  //i번째 문자가 여러개 존재할 수도 있기 때문에 (pos == -1)이 아닐 동안은 계속 반복
				//indexOf는 문자열을 받기 때문에 ""를 통해 문자열로 변환
				pos = sb.indexOf(ch + "");  //i번째 문자가 sb문자열의 몇 번째에 존재하는지 idx를 pos에 저장
				if(pos == -1) break;  //만약 i번째 문자가 존재하지 않는다면 while문 빠져나감
				sb.deleteCharAt(pos);  //i번째 문자가 존재하는 idx를 sb문자열에서 삭제
			}
		}

		return sb.toString();
	}
	
	public static void main(String[] args) {

		System.out.println("(1!2@3^4~5)"+" -> " 
				+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2    3   4\t5)"+" -> "
						+ delChar("(1 2    3   4\t5)"," \t"));
	}
}

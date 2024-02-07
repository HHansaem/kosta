
public class StringTest2 {
	public static void main(String[] args) {
		String str1 = "hong";
		String str2 = new String(str1);
		char[] carr = {'h', 'o', 'n', 'g'};
		String str3 = new String(carr);
		
		StringBuffer sb = new StringBuffer("hong");
		String str4 = new String(sb);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		for(int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);  //charAt : i번째 문자열 가져옴
			System.out.println(ch);
		}
		
		String str5 = "gildong";
		String name = str1.concat(str5);  //concat : str1의 문자열과 str5 문자열을 이어줌 (str1 + str5)
		System.out.println(name);
		
		String str6 = "사과, 바나나, 오렌지, 딸기";
		boolean apple = str6.contains("사과");  //contains : 해당 문자열을 포함하는지 boolean 형태로 반환
		System.out.println(apple);  //true
		
		String[] files = {"test1.jpg", "test2.png", "test3.jpg", "test4.png"};
		for(int i = 0; i < files.length; i++) {
			if(files[i].endsWith("jpg")) {  //endsWith : 해당 문자열로 끝나는 것만 boolean 형태로 반환
				System.out.println(files[i]);
			}
		}
		System.out.println("=============");
		for(int i = 0; i < files.length; i++) {
			if(files[i].startsWith("test")) {  //startsWith : 해당 문자열로 시작하는 것만 boolean 형태로 반환
				System.out.println(files[i]);
			}
		}
		
	}
}






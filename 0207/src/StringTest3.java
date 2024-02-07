import pac.Person;

public class StringTest3 {
	public static void main(String[] args) {
		
		String str = "abcdefgabcd";
		int idx1 = str.indexOf('c');  //indexOf : 해당 문자의 처음 위치
		System.out.println(idx1);
		int idx2 = str.lastIndexOf('c');  //lastIndexOf : 해당 문자의 마지막 위치
		System.out.println(idx2);
		int idx3 = str.indexOf("ab");  //해당 문자열의 처음(시작)위치
		System.out.println(idx3);
		int idx4 = str.lastIndexOf("ab");  //해당 문자열의 마지막(시작)위치
		System.out.println(idx4);
		int idx5 = str.indexOf("df");  ////해당 문자열이 포함되어있지 않기 때문에 '-1'
		System.out.println(idx5);
		
		String str2 = "Hello";
		String str3 = str2.replace('H', 'C');  //replace : 문자열 교체 
		System.out.println(str3);  
		System.out.println(str2);  //(원본은 바뀌지 않는다)
		
		String str4 = str.replace("abc", "");  //str에서 abc 없애기
		System.out.println(str4);
		
		String info = "홍길동,20,사회학과";
		String[] infos = info.split(",");  //split : 해당 문자열을 기준으로 자르기
		System.out.println(infos.length);
		System.out.println(infos[0]);
		System.out.println(infos[1]);
		System.out.println(infos[2]);
		
		System.out.println("========");
		String[] info2 = info.split(",", 2);  //해당 문자열을 기준으로 2개만 자르기
		for(int i = 0; i < info2.length; i++) {
			System.out.println(infos[i]);
		}
		
		String str5 = "java.lang.String";
		String str6 = str5.substring(5);  //substring : 5번째부터 가져오기
		System.out.println(str6);
		String str7 = str5.substring(5, 8);  //5번째부터 8-1번째까지 가져오기 (첫번째는 포함, 마지막은 항상 그 앞까지)
		System.out.println(str7);

		String str8 = str2.toLowerCase();  //toLowerCase : 소문자로
		String str9 = str2.toUpperCase();  ////toUpperCase : 대문자로
		System.out.println(str8);
		System.out.println(str9);
		
		System.out.println("========");
		String str10 = " string ";
		String str11 = str10.trim();  //trim : 앞뒤 공백 제거
		System.out.println(str10.length());  //8
		System.out.println(str11.length());  //6
		
		String ten = String.valueOf(10);  //String.valueOf : 모든 형태를 문자로 바꾸기
		String tru = String.valueOf(true);
		System.out.println(tru);
		
		String per = String.valueOf(new Person("park", 30));  //Person의 toString 호출됨
		System.out.println(per);
		
		String str12 = "ABabABab";
		int idx6 = str12.indexOf("AB", 1);
		System.out.println(idx6);
		
	}
}

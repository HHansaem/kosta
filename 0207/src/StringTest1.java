import pac.Person;

public class StringTest1 {
	public static void main(String[] args) {
		String str1 = "hong";  //상수(리터럴) 영역에 "hong"데이터 생성 -> 공용으로 사용하는 데이터
		String str2 = "hong";
		
		Person p1 = new Person("hong", 20);
		Person p2 = new Person("hong", 20);
		
		System.out.println(p1 == p2);  //다른 객체(주소 다름)니까 false
		System.out.println(str1 == str2);
		
//		str1 += "gildong";  //상수(리터럴) 영역에 새로운 데이터를 추가 (주소가 바뀜)
		
		String str3 = null;
		String str4 = "";
		char ch = '\0';
//		System.out.println(str3.toString());  //NullPoint
		System.out.println(str4.toString());
	}
}


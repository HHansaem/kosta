
public class VariableTest {

	public static void main(String[] args) {
		boolean isMarried = false;
		char bloodType = 'B';
		int age = 24;
		double height = 166.5;
		float weight = 99.5f;
//		byte b = 128;  //overflow (byte는 127까지 저장 가능)
		String name = "황한샘";
		
		System.out.println(isMarried);
		System.out.println(bloodType);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(name);
		
		name = "한샘이";
		
		System.out.println(name);
		
		final double PI = 3.14;
//		PI = 3.15;  //final은 변경 불가
		
		char ch = '홍';
		char ch2 = ' ';
		
		String str1 = null;
		String str2 = "";
		
		int value = 10 + 20;
		System.out.println(value);
		
		String str3 = "안녕하세요?";
		String str4 = "반갑습니다";
		System.out.println(str3 + str4);
		
		System.out.println("7" + 7 + 7);  //777
		System.out.println(7 + 7 + "7");  //147
		
		System.out.println(name + ", " + age + ", " + height + ", " + weight);
		
		float f = 1.6F;
		double d = 1.6F;
		double d2 = 3.23;
		float f2 = (float)d2;  //강제 형변환 (cast)
	}

}

class Variables2 {
	int iv;  //instance variable
	static int sv;  //class variable
	
	void imethod() {
		System.out.println(iv);
		sv++;  //instance method에서는 static variable 사용 가능
		smethod();
	}
	
	static void smethod() {
		sv++;
//		System.out.println(iv);  //static method에서는 instance variable 사용 불가
//		imethod();  //static method에서는 instance method 호출 불가
	}
}

public class StaticTest1 {
	public static void main(String[] args) {
		Variables2.smethod();
	}
}

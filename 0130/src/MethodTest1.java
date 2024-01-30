
public class MethodTest1 {
	
	void method1(int val) {
		System.out.println("mothod1 시작");
		int val2 = val;
		method2(val2);
		System.out.println("mothod1 종료");
	}
	
	void method2(int val) {
		System.out.println("mothod2 시작");
		val += 8;
		method3(val);
		System.out.println("mothod2 종료");
	}
	
	void method3(int arg) {
		System.out.println("mothod3 시작");
		arg += 100;
		System.out.println(arg);
		System.out.println("mothod3 종료");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main 시작");
		MethodTest1 m1 = new MethodTest1();
		m1.method1(5);
		System.out.println("main 종료");
		
	}
}

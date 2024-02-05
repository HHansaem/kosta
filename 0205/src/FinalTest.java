class MyClass {
	static final int fsn = 10;
}

public class FinalTest {

	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		System.out.println(MyClass.fsn);  //10
		System.out.println(mc1.fsn);  //10
		System.out.println(mc2.fsn);  //10
//		MyClass.fsn = 20;  //error
	}
}

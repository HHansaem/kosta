//static변수 => 클래스가 로드될 때 같이 메모리에 할당됨
class Variables {
	int iv;  //전역변수 : class 안에 선언된 변수 (Heap영역, 자동 초기화) => 객체 생성시 계속 생성
	static int sv;  //static: 클래스당 하나만 생성(각 객체들이 공유하는 변수) => 객체 생성시 한번만 생성
	
	void method() {
		System.out.println(iv);
		int lv = 20;  //지역변수 : method 안에 선언된 변수 (Steak영역, 초기화 필수)
		System.out.println(lv);
	}
	void method2() {
		int lv = 30;
		System.out.println(lv);
	}
}

public class VariableTest1 {
	public static void main(String[] args) {
		Variables var = new Variables();
		var.iv = 10;
//		var.sv = 1000;
		Variables.sv = 1000;  //static변수는 객체 생성(new)하지 않고 Class 이름으로 호출 가능
		var.method();
		Variables var2 = new Variables();
		var2.iv = 100;
		System.out.println(Variables.sv);  //System(class)다음에 오는 out이 static변수라는 것을 알 수 있음
	}

}

class MyMtah {
	long val1;
	long val2;
	long add() {
		return val1 + val2;
	}
	long sub() {
		return val1 - val2;
	}
	long mul() {
		return val1 * val2;
	}
	long div() {
		return val2 != 0? val1 / val2 : 0;  //나누는 수가 0이면 안됨
	}
}

class MyMath2 {
	static long add(long val1, long val2) {
		return val1 + val2;
	}
	static long sub(long val1, long val2) {
		return val1 - val2;
	}
	static long mul(long val1, long val2) {
		return val1 * val2;
	}
	static long div(long val1, long val2) {
		return val2 != 0? val1 / val2 : 0;
	}
}

public class ClassTest3 {
	public static void main(String[] args) {
		MyMtah mm = new MyMtah();
		mm.val1 = 1L;
		mm.val2 = 2L;
		long res = mm.add();
		System.out.println(res);
		res = mm.sub();
		System.out.println(res);
		res = mm.mul();
		System.out.println(res);
		res = mm.div();
		System.out.println(res);
		
		//static method 사용한 MyMath2 class사용
		System.out.println(MyMath2.add(20, 10));
		System.out.println(MyMath2.sub(30, 20));
		System.out.println(MyMath2.mul(100, 5));
		System.out.println(MyMath2.div(20, 5));
	}
}

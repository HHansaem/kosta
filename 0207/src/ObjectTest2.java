class Complex {  //복소수 클래스
	int real;
	int imaginary;
	
	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	@Override
	public boolean equals(Object obj) {  //논리적으로 데이터 값이 같으면 true를 반환
		if(!(obj instanceof Complex)) return false;
		Complex complex = (Complex) obj;
		return real == complex.real && imaginary == complex.imaginary;
	}
}

public class ObjectTest2 {
	public static void main(String[] args) {
		Complex c1 = new Complex(3, 5);
		Complex c2 = new Complex(3, 5);
		Complex c3 = new Complex(5, 3);
		System.out.println(c1.equals(c2));  //true
		System.out.println(c1.equals(c3));  //false
	}
}

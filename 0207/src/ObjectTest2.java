import pac.Complex;

public class ObjectTest2 {
	public static void main(String[] args) {
		Complex c1 = new Complex(3, 5);
		Complex c2 = new Complex(3, 5);
		Complex c3 = new Complex(5, 3);
		System.out.println(c1.equals(c2));  //true
		System.out.println(c1.equals(c3));  //false
	}
}

package chapter09;

public class Exercise9_08 {
	
//	주어진 값을 반올림하여, 소수점 이하 n자리의 값을 반환한다.
//    예를 들어 n의 값이 3이면, 소수점 4째 자리에서 반올림하여 소수점 이하 3자리의 수를 반환한다.
	// Math.round()와 Math.pow()를 이용하라
	public static double round(double d, int n) {
		double pow = Math.pow(10, n);  //10의 n제곱
		return Math.round(d * pow) / pow;
	}
	
	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}
}

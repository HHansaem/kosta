package chapter06;

public class Exercise6_06 {

	//두 점의 거리를 계산하는 getDistance()를 완성하시오.
	//[Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다. => a의 제곱근(루트)

	
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다. => 공식: 루트(x-x1)^ + (y-y1)^
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
	}

	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}
}

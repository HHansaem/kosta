
public class WrapperTest1 {
	public static void main(String[] args) {
		Integer n = 100;  //Boxing
		Object o = n;  //UpCasting
		
		int m = n;  //UnBoxing
		
		Double d = 3.14;  //Boxing 사용이유?
		double dd = d;  //UnBoxing
		
		Object obj = 100;  //Boxing && UpCasting
	}
}

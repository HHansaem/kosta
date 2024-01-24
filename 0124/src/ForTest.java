
public class ForTest {

	public static void main(String[] args) {
		int sum = 0;
//		for(int i=0; i<=100; i++) {
//			sum += i;
//		}

//		for(int i=100; i>=1; i--) {
//			sum += i;
//		}

//		for(int i=2; i<=100; i+=2) {
//			sum += i;
//		}

//		for(int i=1; i<=100; i++) {
//			if(i % 2 == 0) {
//				sum += i;
//			}
//		}
		
//		for(int i=1; i<=100; i++) {
//			if(!(i % 3 == 0)) {
//				sum += i;
//			}
//		}
		
		for(int i=0; i<100; i++) {
			sum += i;
			if(sum >= 100) {
				System.out.println(i);
				break;
			}
		}
		
		System.out.println(sum);

	}

}

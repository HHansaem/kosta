
public class ForTest3 {
	public static void main(String[] args) {
		
		//*****
//		for(int i=0; i<5; i++) {
//				System.out.print("*");
//		}
//		System.out.println();
		
		
		//*****
		//*****
		//*****
		//*****
		//*****
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		
		//*
		//**
		//***
		//****
		//*****
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		
		//*****
		//****
		//***
		//**
		//*
//		for(int i=0; i<5; i++) {
//			for(int j=5; j>i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		
		//       *        1
		//      ***       3
		//     *****      5 
		//    *******     7
		//   *********    9
		//  ***********   11
		// *************  13
		int cnt = 7;
		for(int i = 0; i < cnt; i++) {
			for(int j = cnt; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}

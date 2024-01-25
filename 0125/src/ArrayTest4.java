
public class ArrayTest4 {
	
	//Shallow copy(얕은 복사) -> '주소값'을 복사 (참조하고 있는 실제값은 같음)
	//Deep copy(깊은 복사) => '실제값'을 새로운 메로리 공간에 복사 (실제값은 다름)
	
	
	static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 20, 30, 40, 50};
//		System.out.println(arr);  //배열명은 주소를 가지고 있기 때문에 주소값이 출력됨
		int[] arr2 = new int[arr.length];
//		arr2 = arr;  
		//배열명(주소값)은 메모리를 접근하는 데 쓰임(참조) => reference type
		//즉, arr의 값을 변경하면 arr을 참조하는 arr2의 값도 자동으로 변경
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		int[] arr3 = arr.clone();  //메모리까지 복사해서 새로운 메모리 부여(Depp copy 가능)
		
		arr[0] = 100;
		
		print(arr);
		System.out.println();
		print(arr2);
		System.out.println();
		print(arr3);
		
	}
}

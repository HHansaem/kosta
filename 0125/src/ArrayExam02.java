
public class ArrayExam02 {
	public static void main(String[] args) {
		//다음 char배열을 거꾸로 출력하시오
		char[] carr = {'A', 'E', 'C', 'X', 'Y', 'c', 'b', 'z', 'e'};
		
		for(int i = carr.length - 1; i >= 0; i--) {
			System.out.print(carr[i] + " ");
		}
		
	}
}

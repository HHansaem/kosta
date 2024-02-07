
public class StringBuilderTest {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("string");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		
//		sb.replace(3, 4, "o");  //3번째만 바꿈 (시작(3)은 포함, 마지막(4)은 그 앞까지)
//		System.out.println(sb);
		
		sb.setCharAt(3, 'o');  //3번째만 바꿈
		System.out.println(sb);
		
//		sb.setLength(5);  //길이를 5로 설정(5번째 뒤로는 없어짐)
//		System.out.println(sb);
	}
	
}

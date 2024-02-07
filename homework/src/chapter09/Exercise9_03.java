package chapter09;

public class Exercise9_03 {
	
	//다음과 같은 실행결과가 나오도록 코드를 완성하시오
	//	[실행결과]
	//	 fullPath:c:\jdk1.5\work\PathSeparateTest.java
	//	 path:c:\jdk1.5\work
	//	 fileName:PathSeparateTest.java

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";

		int pos = fullPath.lastIndexOf("\\");  //마지막부터 찾기 (그럼 path 결과 만큼 찾을 수 있음)
		System.out.println(pos);
		if(pos != -1) {
			path = fullPath.substring(0, pos);
			fileName = fullPath.substring(pos+1);
		}

		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
	}
}

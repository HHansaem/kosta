package chapter03;

public class Exercise3_10 {

	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = (char) ((ch >= 65 && ch <= 96) ? (ch + 32) : ch);
		System.out.println("upperCase:"+ch);
		System.out.println("lowerCase:"+lowerCase);
	}

}

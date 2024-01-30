class Data {
	int n;
}

public class ParameterTest1 {
	
	public static void plusData(int d) { 
		d++;
		System.out.println(d);
	}
	
	public static void plusData(Data d) {
		d.n++;
		System.out.println(d.n);
	} 
	
	public static void main(String[] args) {
		Data data = new Data();
		data.n = 100;
		plusData(data.n);  //call by value => 함수가 인수로 전달받은 값을 복사하여 처리하는 방식
		System.out.println(data.n);
		System.out.println("==============");
		plusData(data);  //call by reference => 인수로 전달되는 변수의 참조 값을 함수 내부로 전달하는 방식
		System.out.println(data.n);
		System.out.println("==============");
		
		Data data2 = data;
		data2.n++;
		System.out.println(data2.n);
		System.out.println(data.n);
	}
}

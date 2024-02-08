class MyArray <T> {  
	Object[] datas = new Object[10];
	
//	void setData(int idx, Object data) {  //Generic 사용하지 않은 코드
//		datas[idx] = data;
//	}

	void setData(int idx, T data) {  //T -> (Generic)타입을 정의하지 않고, 사용할 때 정하겠다
		datas[idx] = data;
	}
	
	Object getData(int idx) {
		return datas[idx];
	}
}

public class GenericTest1 {
	public static void main(String[] args) {
//		MyArray my = new MyArray();  //Generic 사용하지 않은 코드
		MyArray<Integer> my = new MyArray<>();
		my.setData(0, 100);
		my.setData(1, 200);
		
		int n1 = (Integer)my.getData(0);  //(제네릭 안 쓰면)이렇게 타입이 다르면 매번 넣을 때마다 다운캐스팅을 해줘야 함
		System.out.println(n1);
		
//		MyArray my2 = new MyArray();
		MyArray<Person> my2 = new MyArray<>();
		my2.setData(0, new Person("hong", 20));
		Person p = (Person)my2.getData(0);  //(제네릭 안 쓰면)Person타입이 아니라 Object타입이라 다운캐스팅 안 해주면 에러남
	}
}

package pac;

public class MyTest {
	private int x;  //private : class 내에서만 사용 가능
	int y;  //default: 같은 package에 있는 class에서만 사용 가능
	protected int z;  //protected: package가 다르더라도 자식클래스에서는 사용 가능
	public int k;  //public: 어디서든 사용 가능
	
	public MyTest(){}
	public void method() {
			x = 100;
	}
}

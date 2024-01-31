class Parent {
	int data1;
	
	Parent() {}
	Parent(int data1){
		this.data1 = data1;
	}
	
	void printData() {
		System.out.println(data1);
	}
}

class Child extends Parent {
	int data2;
	
	Child() {}
	Child(int data1, int data2){
		super(data1);
		this.data2 = data2;
	}
	
	@Override
	void printData() {
		System.out.println(data1 + "," + data2);
	}
}

public class InheritTest4 {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.data1 = 10;
		c1.data2 = 20;
		
		Child c2 = new Child(100, 200);
		c1.printData();
		c2.printData();
	}
}
//10,20
//100,200

package emp;

public class Employee {
	String id;
	String name;
	int pay;
	
	public Employee() {}
	
	Employee(String id, String name){
		this.id = id;
		this.name = name;
	}

	public int getPay() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "사번:" + id + ", 이름:" + name;
	}
}

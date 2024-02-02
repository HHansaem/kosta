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

	Employee(String id, String name, int pay){
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	
	public int getPay() {
		return pay;
	}
	
	@Override
	public String toString() {
		return "사번:" + id + ", 이름:" + name;
	}
}

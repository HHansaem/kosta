package emp;

public class Sales extends Permanent{
	int bonus;
	
	public Sales() {}
	
	public Sales(String id, String name, int salary, int bonus){
		super(id, name, salary);
		this.bonus = bonus;
	}
	
	@Override
	public int getPay() {
		return salary + bonus;
	}
}

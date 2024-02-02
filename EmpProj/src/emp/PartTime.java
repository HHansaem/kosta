package emp;

public class PartTime extends Employee {
	int time;
	int payPerTime;
	
	public PartTime() {}
	
	public PartTime(String id, String name, int time, int payPerTime){
		super(id, name);
		this.time = time;
		this.payPerTime = payPerTime;
	}
	
	@Override
	public int getPay() {
		return time * payPerTime;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 급여:" + getPay();
	}
}

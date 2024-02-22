package acc;

import java.io.Serializable;

import exp.BankException;

//	** SpecialAccount
//	1. Account의 모든 속성과 기능을 가지고 있음.
//	2. 등급(grade)에 따라 입금시마다 입금액의 특정 퍼센트 만큼 입금을 추가해 줌.
//	 (grade: VIP(4%), Gold(3%), Silver(2%), Normal(1%))

public class SpecialAccount extends Account implements Serializable {
	
	String grade;
	
	public SpecialAccount(String id, String name, int balance, String grade){
		super(id, name, balance);
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 등급:" + grade;
	}
	
	@Override
	public void deposit(int money) throws BankException {
		double rate = 0;
		switch (grade.toUpperCase()) {  //grade값을 모두 대문자로 바꾸기
		case "VIP": rate = 0.04; break;
		case "GOLD": rate = 0.04; break;
		case "SILVER": rate = 0.04; break;
		case "NORMAL": rate = 0.04; break;
		}
		super.deposit(money + (int)(money * rate));
	}
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}

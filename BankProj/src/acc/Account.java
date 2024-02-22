package acc;

import java.io.Serializable;

import exp.BankError;
import exp.BankException;

public class Account implements Serializable {
	
	String id;
	String name;
	public int balance;
	public String money;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}
	
	Account() {}
	
	Account(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public Account(String id, String name, int balance){
		this(id, name);
		this.balance = balance;
	}
	
	public void deposit(int money) throws BankException {
		if(money <= 0) throw new BankException(BankError.DEPOSIT);
		balance += money;
	}
	
	public void withdraw(int money) throws BankException {
		if(money > balance) {
			throw new BankException(BankError.OVERDRAWN);
		}
		balance -= money;
	}
	
	//deposit을 그대로 쓰면 입금될 때 SpacialAccount는 이자가 붙어서 입급되니까(오버라이드) 메서드를 따로 만들어 준 것  
	public void transDeposit(int money) throws BankException {
		if(money <= 0) throw new BankException(BankError.DEPOSIT);
		balance += money;
	}
	
	@Override
	public String toString() {
		return String.format("계좌번호:%s, 이름:%s, 잔액:%d", id, name, balance); 
	}
}
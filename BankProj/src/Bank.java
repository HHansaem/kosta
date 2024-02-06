import java.util.Scanner;

import emp.Account;
import emp.SpecialAccount;
import exp.BankError;
import exp.BankException;

public class Bank {

	Scanner sc = new Scanner(System.in);
	Account[] accs = new Account[100];  //null로 자동 초기화
	int cnt;  //0으로 자동 초기화

	Bank() {}

	int menu() throws BankException {
		System.out.println("\n[코스타 은행]");
		System.out.println("0.종료");
		System.out.println("1.계좌개설");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.계좌조회");
		System.out.println("5.전체계좌조회");
		System.out.println("6.계좌이체");
		System.out.print("선택>> ");
		int sel = Integer.parseInt(sc.next());
		if(sel < 0 || sel > 6) {
			throw new BankException(BankError.MENU);
		}
		return sel;
	}

	void selMenu() throws BankException {
		System.out.println("\n[계좌개설]");
		System.out.println("1.일반계좌");
		System.out.println("2.특수계좌");
		System.out.print("선택>> ");
		int sel = Integer.parseInt(sc.next());
		switch(sel) {
		case 1: makeAccount(); break;
		case 2: makeSpecialAccount(); break;
		default: throw new BankException(BankError.MENU);
		}
	}

	void makeSpecialAccount() throws BankException {
		System.out.println("\n[특수계좌개설]");
		System.out.print("계좌번호: ");
		String id = sc.next();
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("입금액: ");
		int money = sc.nextInt();
		System.out.print("등급(VIP, Gold, Silver, Normal): ");
		String grade = sc.next();

		Account acc = searchAccById(id);
		if(acc != null) {
			throw new BankException(BankError.DOUBLE_ID);
		}

		accs[cnt++] = new SpecialAccount(id, name, money, grade);  //upcasting
	}

	void makeAccount() throws BankException {
		System.out.println("\n[일반계좌개설]");
		System.out.print("계좌번호: ");
		String id = sc.next();
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("입금액: ");
		int money = sc.nextInt();

		Account acc = searchAccById(id);
		if(acc != null) {
			throw new BankException(BankError.DOUBLE_ID);
		}

		//1. Account 객체 만들기
		//2. 생성된 객체를 accs에 담기
		accs[cnt++] = new Account(id, name, money);
	}

	void deposit() throws BankException {
		System.out.println("\n[입금]");
		System.out.print("계좌를 입력하세요: ");
		String id = sc.next();

		System.out.print("금액을 입력하세요: ");
		int money = sc.nextInt();
		Account acc = searchAccById(id);

		if(acc == null) {
			throw new BankException(BankError.NO_ID);
		} else {
			acc.balance += money;
			System.out.println(money + "원이 입금되었습니다.");
		}
	}

	void withdraw() throws BankException {
		System.out.println("\n[출금]");
		System.out.print("계좌를 입력하세요: ");
		String id = sc.next();

		System.out.print("출금액: ");
		int money = sc.nextInt();
		Account acc = searchAccById(id);

		if(acc == null) {
			throw new BankException(BankError.NO_ID);
		} else {
			acc.withdraw(money);
		}
	}

	Account searchAccById(String id) {
		for(int i = 0; i < cnt; i++) {
			if(accs[i].getId().equals(id)) {
				return accs[i];
			}
		}
		return null;
	}

	void accountInfo() throws BankException {
		System.out.println("\n[계좌조회]");
		System.out.print("계좌번호: ");
		String id = sc.next();

		//1. accs에서 id에 해당하는 Account를 찾는다.
		Account acc = searchAccById(id);
		//2. 찾은 Account의 정보를 출력한다.
		if(acc == null) {
			throw new BankException(BankError.NO_ID);
		} else {
			System.out.println(acc.info());
		}
	}

	void allAccountInfo() {
		System.out.println("\n[전체계좌조회]");
		for(int i = 0; i < cnt; i++) {
			System.out.println(accs[i].info());
		}
	}

	void transfer() throws BankException {
		System.out.println("\n[계좌이체]");
		System.out.print("보내는 계좌번호: ");
		String sendId = sc.next();
		System.out.print("받는 계좌번호: ");
		String recvId = sc.next();
		System.out.print("이체금액: ");
		int money = sc.nextInt();

		Account sendAcc = searchAccById(sendId);
		if(sendAcc == null) {
			throw new BankException(BankError.NO_SENDID);
		} 
		
		Account recvAcc = searchAccById(recvId);
		if(recvAcc == null) {
			throw new BankException(BankError.NO_RECVID);
		}

		sendAcc.withdraw(money);
		recvAcc.deposit(money);
		System.out.println("이체가 완료되었습니다.");
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println("어서오세용");
		while(true) {
			try {
				int sel = bank.menu();
				if(sel == 0) break;
				switch(sel) {
				case 1: bank.selMenu(); break;
				case 2: bank.deposit(); break;
				case 3: bank.withdraw(); break;
				case 4: bank.accountInfo(); break;
				case 5: bank.allAccountInfo(); break;
				case 6: bank.transfer(); break;
				}
			} catch (NumberFormatException e) {
				System.out.println("입력 형식이 바르지 않습니다.");
			} catch (BankException e) {
				System.out.println(e);
			}
		}
	}
}

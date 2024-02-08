import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import emp.Account;
import emp.SpecialAccount;
import exp.BankError;
import exp.BankException;

public class Bank {

	Scanner sc = new Scanner(System.in);
	Map<String, Account> accs = new HashMap<>();  //TreeMap으로 해도 됨
	
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

		//key값(id)으로 중복체크
		if(accs.containsKey(id)) {  //중복이면 true
			throw new BankException(BankError.DOUBLE_ID);
		}
		//HashMap에 key값과 value값 넣기
		accs.put(id, new SpecialAccount(id, name, money, grade));  
	}

	void makeAccount() throws BankException {
		System.out.println("\n[일반계좌개설]");
		System.out.print("계좌번호: ");
		String id = sc.next();
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("입금액: ");
		int money = sc.nextInt();

		//key값(id)으로 중복체크
		if(accs.containsKey(id)) {  //중복이면 true
			throw new BankException(BankError.DOUBLE_ID);
		}
		//HashMap에 key값과 value값 넣기
		accs.put(id, new Account(id, name, money));
	}

	void deposit() throws BankException {
		System.out.println("\n[입금]");
		System.out.print("계좌를 입력하세요: ");
		String id = sc.next();

		System.out.print("금액을 입력하세요: ");
		int money = sc.nextInt();
		
		 //key값(id)이 없으면 해당 예외 발생
		if(accs.containsKey(id) == false) { 
			throw new BankException(BankError.NO_ID);
		}
		//HashMap key값의 value값 money 수정
		 accs.get(id).deposit(money);

	}

	void withdraw() throws BankException {
		System.out.println("\n[출금]");
		System.out.print("계좌를 입력하세요: ");
		String id = sc.next();

		System.out.print("출금액: ");
		int money = sc.nextInt();
		
		//key값(id)이 없으면 해당 예외 발생
		if(accs.containsKey(id) == false) { 
			throw new BankException(BankError.NO_ID);
		}
		//HashMap key값의 value값 money 수정
		 accs.get(id).withdraw(money);
	}

	void accountInfo() throws BankException {
		System.out.println("\n[계좌조회]");
		System.out.print("계좌번호: ");
		String id = sc.next();
		
		//key값(id)이 없으면 해당 예외 발생
		if(accs.containsKey(id) == false) { 
			throw new BankException(BankError.NO_ID);
		}

		System.out.println(accs.get(id).info());
	}

	void allAccountInfo() {
		System.out.println("\n[전체계좌조회]");
		
		//HashMap(accs)에 들어온 모든 값들 만큼 반복문 돌기
//		for(Account acc : accs.values()) {
//			System.out.println(acc.info());
//		}
		
		Iterator<Account> it = accs.values().iterator();
		while (it.hasNext()) {
			System.out.println(it.next().info());
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

		if(accs.containsKey(sendId) == false) {
			throw new BankException(BankError.NO_SENDID);
		} 
		if(accs.containsKey(recvId) == false) {
			throw new BankException(BankError.NO_SENDID);
		} 
		
		accs.get(sendId).withdraw(money);
		accs.get(recvId).withdraw(money);
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

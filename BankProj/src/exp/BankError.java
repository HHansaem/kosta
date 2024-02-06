package exp;

public enum BankError {  //error의 종류를 넣어 놓는 enum 데이터타입 (상수값을 이름을 부여해 정의)
	//찾는 계좌 없음(0), 계좌 중복(1), 잔액 부족(2), 메뉴선택 오류(3), 입금액 오류(4)
	NO_ID, NO_SENDID, NO_RECVID, DOUBLE_ID, OVERDRAWN, MENU, DEPOSIT
}

package chapter07;

//아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고,
//이 클래스를 상속받도록 코드를 변경하시오.

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);  //추상클래스
	// => (각 유닛의 move메서드가 서로 다르게 동작하기 때문에 서브클래스에 반드시 구현해야 하는 메서드를 명시하기 위해 추상클래스로 정의해줌.)
	
	void stop() { /* 현재 위치에 정지 */ }  //stop 메서드는 모든 유닛이 공통적으로 동일하게 동작
}

class Marine extends Unit { // 보병 
	@Override
	void move(int x, int y) { 
		System.out.println("(" + x + "," + y + ")까지 걸어간다.");
	}
	
	void stimPack() { /* 스팀팩을 사용한다.*/}
}

class Tank extends Unit { // 탱크 
	@Override
	void move(int x, int y) { 
		System.out.println("(" + x + "," + y + ")까지 굴러간다.");
	}
	
	void changeMode() { /* 공격모드를 변환한다. */}
}

class Dropship extends Unit { // 수송선 
	@Override
	void move(int x, int y) { 
		System.out.println("(" + x + "," + y + ")까지 헤엄쳐간다.");
	}
	
	void load() { /* 선택된 대상을 태운다.*/ }
	void unload() { /* 선택된 대상을 내린다.*/ }
} 

public class Exercise7_17 {
	public static void main(String[] args) {
		Unit[] group = new Unit[4];
		group[0] = new Tank();
		group[1] = new Marine();
		group[2] = new Dropship();
		group[3] = new Marine();
		
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
	}
}
//(100,200)까지 굴러간다.
//(100,200)까지 걸어간다.
//(100,200)까지 헤엄쳐간다.
//(100,200)까지 걸어간다.


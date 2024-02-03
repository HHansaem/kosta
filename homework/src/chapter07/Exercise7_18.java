package chapter07;

//다음과 같은 실행결과를 얻도록 코드를 완성하시오.
//[Hint] instanceof연산자를 사용해서 형변환한다. 메서드명 : action
// 기 능 : 주어진 객체의 메서드를 호출한다.
// DanceRobot인 경우, dance()를 호출하고,
// SingRobot인 경우, sing()을 호출하고,
// DrawRobot인 경우, draw()를 호출한다.
// 반환타입 : 없음
// 매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스

public class Exercise7_18 {
	
	//instanceof 연산자
	//객체 타입을 확인하는 연산자
	//형변환 가능 여부를 확인하며 true / false로 결과를 반환
	//주로 상속 관계에서 부모객체인지 자식객체인지 확인하는 데 사용
	//"객체 instanceof 클래스" 를 선언함으로써 사용
	static void action(Robot r) {
		if(r instanceof DanceRobot) {  //DanceRobot으로 형변환이 가능하면
			((DanceRobot) r).dance();  //형변환 후 메서드 호출
		} else if(r instanceof SingRobot) {
			((SingRobot) r).sing();
		} else if(r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	}
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++)
			action(arr[i]);
	}
}

class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

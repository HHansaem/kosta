
public class SCV extends GroundUnit implements IRepairable {  //수리해주는 기능 (Marine은 안 되고 Tank와 자신만) 

	public SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	//hitPoint를 MAX_HP로 채워주는 역할
	public void repair(IRepairable unit) {  //IRepairable를 implements한 클래스만 사용할 수 있는 메서드
		if(unit instanceof Unit) {  //Unit의 자식인지 확인하고
			Unit rnuit = (Unit)unit;  //캐스팅 후
			rnuit.hitPoint = rnuit.MAX_HP;  //hitPoint를 MAX_HP로 채워줌
		}
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	
}

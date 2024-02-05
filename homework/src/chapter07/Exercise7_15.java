package chapter07;

class Unit1 {}
class AirUnit extends Unit1 {}
class GroundUnit extends Unit1 {}
class Tank1 extends GroundUnit {}
class AirCraft extends AirUnit {}

public class Exercise7_15 {

	//클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은? => e
	
	Unit1 u = new GroundUnit();
	Tank1 t = new Tank1();
	AirCraft ac = new AirCraft();
	
	//a: 다운캐스팅 안 해도 어짜피 자식이니까 부모에 담기 가능
//	u = (Unit1)ac;  
	
	//b: 자식을 부모에 담는 것 가능
//	u = ac;  
	
	//c: u 가 unit객체였으면 error겠지만 지금 GroundUnit객체니까 가능
//	GroundUnit gu = (GroundUnit)u;  
	
	//d: 자식을 부모에 담는 거 가능
//	AirUnit au = ac;   
	
	//※※ e: u는 GroundUnit객체를 가르킴. 부모를 다운캐스팅해서 자식에 담기 불가능! (다운캐스팅은 해당 객체가 정확히 그 타입인 경우에만 가능)
//	t = (Tank1)u;  
	
	//f: 자식을 부모에 담기
//	GroundUnit gu1 = t;  
}

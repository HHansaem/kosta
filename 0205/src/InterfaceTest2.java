interface IClick {
	void click();
}

class MyButton {
	IClick iclick;
	
	void onClick() {
		System.out.println("버튼이 눌려짐 그림");
		if(iclick != null) {
			iclick.click();
		}
	}
	
	void addClickListner(IClick iclick) {  //파라미터로 interface를 받음 -> 메서드 구현해서 가져오면 호출시켜줄게
		this.iclick = iclick;
	}
}

class LoginClick implements IClick {

	@Override
	public void click() {
		System.out.println("로그인 처리");
	}
	
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		MyButton mb = new MyButton();
//		mb.addClickListner(new LoginClick());  //여러번 쓸 거면 이렇게 쓰기
		mb.addClickListner(new IClick() {  //IClick로부터 상속받아서 새로운 클래스 정의한 것(익명클래스) -> 한 번만 쓸 때는 익명클래스 주로 사용
			@Override
			public void click() {
				System.out.println("로그인 처리");
			}
		});
		mb.onClick();
	}
}

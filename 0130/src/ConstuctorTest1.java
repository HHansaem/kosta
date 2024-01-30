class Member {
	int num;
	String name;
	String phone;
	String email;
	String address;
	
	Member() {}  //생성자를 하나라도 만들면 기본 생성자는 자동으로 만들어지지 않기 때문에 작성해 주어야 한다.
	
	Member(int num, String name){
		this.num = num;
		this.name = name;
	}
	
	Member(int num, String name, String phone, String email) {
		this(num, name);  //생성자에서 다른 생성자 호출 (반드시 맨 위에 호출)
		this.phone = phone;
		this.email = email;
	}

	Member(int num, String name, String phone, String email, String address) {
		this(num, name, phone, email);  //생성자에서 다른 생성자 호출 (반드시 맨 위에 호출)
		this.address = address;
	}
}

public class ConstuctorTest1 {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.num = 100;
		m1.name = "홍길동";
		
		Member m2 = new Member(101, "김길동");
	}
}

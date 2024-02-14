import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Person implements Serializable {  //직렬가능한
	int age;
	String name;
	transient String password;  //transient : 해당 속성은 직렬화에서 제외시킨다. (파일에 정보 안 들어감)
	
	Person(String name, int age, String password){
		this.name = name;
		this.age = age;
		this.password = password;
	}
	
	@Override
		public String toString() {
			return name + "," + age;
		}
}

public class ObjectStreamTest1 {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;  //객체를 직렬화하는 기능
		ArrayList<Person> pers = new ArrayList<>();
		Person p1 = new Person("hong", 20, "1q2w3e");
		Person p2 = new Person("song", 30, "q1w2e3");
		Person p3 = new Person("gong", 40, "56ty7u");
		pers.add(p1);
		pers.add(p2);
		pers.add(p3);
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("pers.ser"));
			//ObjectOutputStream에 객체를 넣으려면 클래스에 Serializable를 implements해줘야 함.
			//직렬화해서 저장하면 클래스의 정보까지 들어가기 때문에 파일의 크기가 더 커진다.
//			oos.writeInt(3);  //size 저장
//			oos.writeObject(p1);  
//			oos.writeObject(p2);
//			oos.writeObject(p3);
			oos.writeObject(pers);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectStreamTest2 {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("pers.ser"));
			//ObjectOutputStream으로 넣어준 걸 ObjectInputStream으로 읽어오기 (순서대로 읽어와야 함)
			
//			int size = ois.readInt();  //size 읽어옴
//			for(int i = 0; i < size; i ++) {
//				Person p1 = (Person)ois.readObject();  //ClassNotFoundException 예외처리 반드시 필요
//				System.out.println(p1);
//			}
			
			ArrayList<Person> pers = (ArrayList<Person>) ois.readObject();
			for(Person p : pers) {
				System.out.println(p);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

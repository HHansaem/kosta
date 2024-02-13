import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamTest2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("info.txt");
			dis = new DataInputStream(fis);
			//write한 순서대로 read
			int age = dis.readInt();  //writeInt()했으면 read도 readInt()로 읽어야 함
			double height = dis.readDouble();
			String name = dis.readUTF();
			dis.close();
			System.out.println(age);
			System.out.println(height);
			System.out.println(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

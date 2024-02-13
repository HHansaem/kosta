import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest1 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("news.txt");
			fw = new FileWriter("news-copy.txt");
			
			//배열을 이용해서 파일 복사
			int len;
			char[] buff = new char[128];
			while((len = fr.read(buff)) > 0) {
				fw.write(buff, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

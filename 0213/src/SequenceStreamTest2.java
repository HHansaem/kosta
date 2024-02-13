import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceStreamTest2 {
	public static void main(String[] args) {
		SequenceInputStream sis = null;
		FileOutputStream fos = null;
		
		try {
			Vector<InputStream> list = new Vector<>();
			list.add(new FileInputStream("sktNews1.txt"));  //해당 파일 읽어서 list에 추가
			list.add(new FileInputStream("sktNews2.txt"));
			list.add(new FileInputStream("sktNews3.txt"));
			
			sis = new SequenceInputStream(list.elements());  //list의 파일 요소들 합치기
			fos = new FileOutputStream("sktNews.txt");  //해당 이름으로 파일 생성
			
			byte[] buff = new byte[1024];
			int len;
			while((len = sis.read(buff)) > 0) {
				fos.write(buff, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sis != null) {
					sis.close();
				}
				if(fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

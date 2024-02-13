import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		
		if(args.length < 2) return;
		String readFile = args[0];
		String writeFile = args[1];
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//main의 파라미터로 받아서 사용 (프로젝트 우클릭 -> Run as -> Run Configuration)
//			fis = new FileInputStream(readFile);  
//			fos = new FileOutputStream(writeFile);
			fis = new FileInputStream("news.txt");  //파일에서 byte단위의 데이터 읽어오기
			fos = new FileOutputStream("news2.txt");  //파일에 byte단위의 데이터 생성 후 저장
			
			byte[] buff = new byte[10];
			int len;
			
			//read : 파일에서 최대 buff의 크기만큼 데이터를 읽고, 실제로 읽은 바이트 수를 반환 
			//(여기선 반복문 10번.. 읽을 데이터가 없으면 -1 반환)
			while((len = fis.read(buff)) > 0) {  
				fos.write(buff, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(new Integer(5));
		v.add(new Integer(4));
		v.add(new Integer(2));
		v.add(new Integer(0));
		v.add(new Integer(3));
		
		//iterator와 기능은 같음 (Enumeration) 이름만 달라!
		Enumeration<Integer> e = v.elements();  //iterator()
		
		while(e.hasMoreElements()) {  //hasNext()
			int n = e.nextElement();  //next()
			System.out.print(n + " ");
		}

		//이렇게 쓰는 거랑 똑같음
//		Iterator<Integer> it = v.iterator();
//		while(it.hasNext()) {
//			int n = it.next();
//			System.out.print(n + " ");
//		}
	}
}

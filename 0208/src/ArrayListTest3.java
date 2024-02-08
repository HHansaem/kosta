import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest3 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(3));
		
		//iterator (이터레이터) -> 반복자
		//반복문 : (for문, for-each문, iterator사용)
		Iterator<Integer> it = list1.iterator();
		while(it.hasNext()) {  //맨 앞의 포지션을 가져옴 (0번째 앞) -> it이 있을 때까지(다음 데이터가 있을 때까지) 반복
			int n = it.next();  //다음으로 이동해 데이터 반환
			if(n % 2 == 0) {
				it.remove();  //데이터를 중간에 삽입, 삭제해도 데이터가 어긋나지 않음 (이터레이터의 장점) 
			}
		}
		for(Integer n : list1) {
			System.out.println(n);
		}
	}
}

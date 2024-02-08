import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest2 {
	
	static void print(ArrayList<Integer> list) {
		for(Integer n : list) {
			System.out.print(n + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(20);  //사이즈가 20이 아니라(lenght의미X) 메모리 크기
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(3));
		
		//생성자에 또 다른 리스트 가져갈 수 있음
		ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 3));
		print(list1);
		print(list2);
		
		//sort
		Collections.sort(list1);  
		print(list1);
		
		//contains
		System.out.println(list1.containsAll(list2));  //list1에 list2가 모두 포함되어 있는지의 여부
		System.out.println(list1.contains(3));  //list1에 특정 데이터가 포함되어 있는지의 여부
		
		//remove
		list1.remove(0);  //해당 인덱스(0)의 값 삭제
		print(list1);
		list1.remove(new Integer(5));  //5라는 데이터 삭제
		print(list1);
		
		//size
		System.out.println(list1.size());  //리스트의 크기
		
		//retainAll
		System.out.println(list1.retainAll(list2));  //list2에 있는 데이터만 남기고 list1의 데이터 삭제하기
		
		//clear
		list1.clear();  //전체 데이터 삭제
		System.out.println(list1.size());
		
		//isEmpty
		System.out.println(list1.isEmpty());  //리스트가 비어있는지의 여부
		
		
		
		
	}
}

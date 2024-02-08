import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest3 {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(56);
		tset.add(60);
		tset.add(90);
		tset.add(78);
		tset.add(98);
		tset.add(65);
		tset.add(69);
		tset.add(77);
		tset.add(98);
		tset.add(87);
		
		System.out.println(tset);  //[56, 65, 69, 77, 78, 87, 98] -> 정렬되어 출력
		
		SortedSet<Integer> headSet = tset.headSet(60);  //[56] -> 60미만의 값을 가져옴
		System.out.println(headSet);

		SortedSet<Integer> tailSet = tset.tailSet(90);  //[90, 98] -> 90이상의 값을 가져옴
		System.out.println(tailSet);
		
		SortedSet<Integer> subSet = tset.subSet(80, 90);  //[87] -> 80과 90 사이의 값을 가져옴
		System.out.println(subSet);
		
	}
}

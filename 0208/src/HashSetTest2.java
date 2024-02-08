import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(33);
		list.add(6);
		list.add(22);
		list.add(22);
		list.add(22);
		list.add(7);
		
		System.out.println(list); //[33, 6, 22, 22, 22, 7] (중복 제거 X, 순서 정렬 X)
		
		HashSet<Integer> set = new HashSet<>(list);  //생성자에서 새로운 collection을 생성할 수 있음
		System.out.println(set);  //[33, 6, 22, 7] (순서 정렬 X)
		 
		
		//순서가 정렬되어 들어가는 treeSet
		TreeSet<Integer> tree = new TreeSet<>(list);
//		tree.add(33);
//		tree.add(6);
//		tree.add(22);
//		tree.add(22);
//		tree.add(22);
//		tree.add(7);
		System.out.println(tree);  //[6, 7, 22, 33] (순서 정렬)
	}
}

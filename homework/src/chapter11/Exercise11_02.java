package chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise11_02 {

	//다음 코드의 실행결과를 적으시오.

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(3);	
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list);  //중복 X (3, 6, 2, 7)
		TreeSet tset = new TreeSet(set);  //중복 X, 정렬 (2, 3, 6, 7)
		Stack stack = new Stack();
		
		stack.addAll(tset);  //LIFO (7, 6, 3, 2)
		
		while(!stack.empty())
			System.out.println(stack.pop());  //(7, 6, 3, 2)
	}
}

import java.util.Stack;

public class StackTest1 {
	public static void main(String[] args) {
		
		//LIFO(Last In First Out)
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		while(!stack.isEmpty()) {
			//마지막에 들어간 거 먼저 출력
			System.out.println(stack.pop());  //30 
			System.out.println(stack.pop());  //20
			System.out.println(stack.pop());  //10
		}
		
		Stack<Person> pStack = new Stack<>();
		pStack.push(new Person("hong", 20));
		pStack.push(new Person("song", 30));
		
		while(!pStack.isEmpty()) {
			System.out.println(pStack.pop().info());
		}
	}
}

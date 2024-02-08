import java.util.LinkedList;
import java.util.Queue;

public class QueueTest1 {
	public static void main(String[] args) {
		
		//FIFO(First In First Out)
		//데이터 넣기: offer
		//데이터 빼기: poll
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(10);  //enqueue(데이터 넣기)
		queue.offer(20);
		queue.offer(30);
		
		System.out.println(queue.peek());  //맨 앞에 있는 데이터만 가져오기
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());  //dequeue(데이터 빼기)
		}
		
		System.out.println(queue.size());
	}
}

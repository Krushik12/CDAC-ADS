import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueue {

	public static void main(String[] args) {
		
		//Java Collection Queue
		Queue<Integer> q = new LinkedList<>();

		q.offer(10);
		q.offer(20);
		q.offer(30);

		System.out.println(q.peek());

		System.out.println(q.poll());
		
		//Priority Qyueue
		PriorityQueue<Integer> pqu =
			    new PriorityQueue<>(Collections.reverseOrder());

			pqu.add(30);
			pqu.add(10);
			pqu.add(20);

			System.out.println(pqu.poll());
			
			//order changed
			
			PriorityQueue<Integer> pq = new PriorityQueue<>();

			pq.add(30);
			pq.add(10);
			pq.add(20);

			System.out.println(pq.poll());
			
			//ArrayDequeue
			Deque<Integer> dq = new ArrayDeque<>();

	        dq.addFirst(10);
	        dq.addLast(20);
	        dq.addLast(30);

	        System.out.println(dq);

	        dq.removeFirst();
	        dq.removeLast();

	        System.out.println(dq);

	}

}

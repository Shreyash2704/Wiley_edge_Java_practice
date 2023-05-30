package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		
		Deque<String> dq = new ArrayDeque<>();
		dq.add("X");
		dq.add("X");
		dq.add("X");
		dq.add("X");
		dq.addFirst("AA");
		
		System.out.println(dq);
		

	}

}

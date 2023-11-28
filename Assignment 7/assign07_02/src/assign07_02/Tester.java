package assign07_02;

import java.util.Arrays;


public class Tester {

	public static void main(String[] args) {
		
		System.out.println("-----Max-Prority Queue-----");
		MaxPriorityQ q = new MaxPriorityQ();
		
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		System.out.println("Front: "+q.peek());
		System.out.println("Deleted: "+q.poll());
		System.out.println("Front: "+q.peek());
		System.out.println("Deleted: "+q.poll());
		System.out.println("Front: "+q.peek());
		q.offer(70);
		q.offer(50);
		System.out.println("Deleted: "+q.poll());
		System.out.println("Front: "+q.peek());
		System.out.println("Deleted: "+q.poll());
		System.out.println("Front: "+q.peek());
		

		
		System.out.println("-----Min-Prority Queue-----");
		MinPriorityQ q2 = new MinPriorityQ();
		
		q2.offer(10);
		q2.offer(20);
		q2.offer(30);
		q2.offer(40);
		System.out.println("Front: "+q2.peek());
		System.out.println("Deleted: "+q2.poll());
		System.out.println("Front: "+q2.peek());
		System.out.println("Deleted: "+q2.poll());
		System.out.println("Front: "+q2.peek());
		q2.offer(70);
		q2.offer(50);
		System.out.println("Deleted: "+q2.poll());
		System.out.println("Front: "+q2.peek());
		System.out.println("Deleted: "+q2.poll());
		System.out.println("Front: "+q2.peek());

		

	}

}

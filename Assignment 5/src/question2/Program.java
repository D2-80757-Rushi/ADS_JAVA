package question2;

public class Program {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(5);
		System.out.println(s.peek());
		s.push(6);
		System.out.println(s.peek());
		s.push(8);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		Queue q=new Queue();
		q.push(5);
		System.out.println(q.peek());
		q.push(6);
		System.out.println(q.peek());
		q.push(8);
		System.out.println(q.peek());
		q.pop();
		System.out.println(q.peek());
		
	}
}

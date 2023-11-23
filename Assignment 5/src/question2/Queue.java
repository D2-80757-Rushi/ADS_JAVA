package question2;

public class Queue {
	List list;
	public Queue() {
		list=new List();
	}
	public void push(int value) {
		list.addLast(value);
	}
	public void pop() {
		list.deleteFirst();
	}
	public int peek() {
		return list.getData();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	
}
}

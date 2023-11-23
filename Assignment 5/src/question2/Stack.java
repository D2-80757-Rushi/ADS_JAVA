package question2;

public class Stack {
	List list;
	public Stack() {
		list=new List();
	}
	public void push(int value) {
		list.addFirst(value);
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

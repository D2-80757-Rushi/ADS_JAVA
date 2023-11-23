package question3;

public class DQueue {
	List list;
	public DQueue() {
		list=new List();
	}
	
	public void pushAtFront(int value) {
		list.addFirst(value);
	}
	public void pushAtLast(int value) {
		list.addLast(value);
	}
	public void popAtLast() {
		list.deleteLast();
	}
	public int peekAtFront() {
		return list.getDataF();
	}
	
	public int peekAtLast() {
		return list.getDataR();
	}
}

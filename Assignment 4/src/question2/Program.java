package question2;

public class Program {
	public static void main(String[] args) {
		
	List linkedlist =new List();
	linkedlist.addFirst(5);
	linkedlist.addFirst(4);
	linkedlist.addFirst(3);
	linkedlist.addFirst(2);
	linkedlist.addFirst(1);
	linkedlist.addLast(7);
	linkedlist.addLast(8);
	linkedlist.addPosition(6, 6);
	linkedlist.deleteFirst();
	linkedlist.deleteLast();
	linkedlist.deletePosition(6);

	linkedlist.display();
	}
}


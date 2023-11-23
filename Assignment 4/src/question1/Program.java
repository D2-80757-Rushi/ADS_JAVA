package question1;

public class Program {

	public static void main(String[] args) {
		List linkedlist =new List();
		linkedlist.addFirst(5);
		linkedlist.addFirst(4);
		linkedlist.addFirst(3);
		linkedlist.addFirst(2);
		linkedlist.addFirst(1);
		linkedlist.addLast(6);
		linkedlist.addLast(7);
		linkedlist.display();
		linkedlist.deleteFirst();
		linkedlist.deleteLast();
		linkedlist.display();
		
	}

}

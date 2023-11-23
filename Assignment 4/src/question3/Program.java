package question3;

public class Program {

	public static void main(String[] args) {
		List linkedlist =new List();
		linkedlist.addFirst(5);
		linkedlist.addFirst(4);
		linkedlist.addFirst(3);
		linkedlist.addFirst(9);
		linkedlist.addFirst(2);
		linkedlist.addFirst(1);
		linkedlist.addLast(6);
		linkedlist.addLast(8);
		linkedlist.addLast(10);
		linkedlist.addLast(7);
		linkedlist.addAfterGivenNode(8, 20);
		linkedlist.addBeforeGivenNode(6, 30);
		linkedlist.display();
	
	}

}

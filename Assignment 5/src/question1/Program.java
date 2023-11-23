package question1;

public class Program {

	public static void main(String[] args) {
		List l1 = new List();
		l1.addFirst(5);
		l1.addFirst(4);
		l1.addFirst(3);
		l1.addFirst(2);
		l1.addFirst(1);
		l1.addLast(7);
		l1.addLast(9);
		l1.addAtPos(6, 6);
		l1.addAtPos(8, 8);
		l1.fDisplay();
		l1.deleteAtPos(1);
		l1.fDisplay();
	}

}


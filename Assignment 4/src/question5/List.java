package question5;

public class List {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		Node trav = head;
		System.out.print("List : ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
	}

	public void insertSorted(int value) {
		Node newNode = new Node(value);

		if (head == null || value < head.data) {
			newNode.next = head;
			head = newNode;
			return;
		}

		Node trav = head;
		while (trav.next != null && trav.next.data < value) {
			trav = trav.next;
		}

		newNode.next = trav.next;
		trav.next = newNode;
	}

}

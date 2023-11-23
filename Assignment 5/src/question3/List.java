package question3;

public class List {
	static class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}

	private Node head;
	private Node tail;

	public List() {
		head = null;
		tail = null;
	}
	public int getDataF() {
		return head.data;
	}
	public int getDataR() {
		return tail.data;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void fDisplay() {
		Node trav = head;
		System.out.print("Forward : ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

	public void rDisplay() {
		Node trav = tail;
		System.out.print("Reverse : ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.prev;
		}
		System.out.println("");
	}

	public void addFirst(int value) {
		Node nn = new Node(value);
		if (isEmpty())
			head = tail = nn;
		else {
			nn.next = head;
			head.prev = nn;
			head = nn;
		}
	}

	public void addLast(int value) {
		Node nn = new Node(value);
		if (isEmpty())
			head = tail = nn;
		else {
			nn.prev = tail;
			tail.next = nn;
			tail = nn;
		}
	}

	public void addPosition(int value, int pos) {

		Node nn = new Node(value);
		if (isEmpty())
			head = tail = nn;
		else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++)
				trav = trav.next;
			nn.prev = trav;
			nn.next = trav.next;
			trav.next = nn;
			nn.next.prev = nn;
		}
	}

	public void deleteFirst() {
		if (isEmpty())
			return;
		else if (head.next == null)
			head = tail = null;
		else {
			head = head.next;
			head.prev = null;
		}
	}

	public void deleteLast() {
		if (isEmpty())
			return;
		else if (head.next == null)
			head = tail = null;
		else {
			tail = tail.prev;
			tail.next = null;
		}
	}

	public void deletePosition(int pos) {
		if (isEmpty())
			return;
		else if (head.next == null)
			head = tail = null;
		else {
			Node trav = head;
			for (int i = 1; i < pos; i++)
				trav = trav.next;
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
		}
	}

}

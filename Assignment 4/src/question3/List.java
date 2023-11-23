package question3;

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

	boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		Node trav = head;
		if (isEmpty()) {
			head = newNode;
		} else {
			while (trav.next != null)
				trav = trav.next;
			trav.next = newNode;
		}
	}

	public void deleteFirst() {
		if (isEmpty())
			return;
		else
			head = head.next;
	}

	public void deleteLast() {
		Node trav = head;
		if (isEmpty())
			return;
		else
			while (trav.next.next != null)
				trav = trav.next;
		trav.next = null;

	}
	
	public void addAfterGivenNode(int data,int value)
	{
		Node newNode = new Node(value);
		Node trav = head;
		while(trav.data!=data)
			trav=trav.next;
		newNode.next=trav.next;
		trav.next=newNode;
	}
	
	public void addBeforeGivenNode(int data,int value)
	{
		Node newNode = new Node(value);
		Node trav = head;
		while(trav.next.data!=data)
			trav=trav.next;
		newNode.next=trav.next;
		trav.next=newNode;
	}

}

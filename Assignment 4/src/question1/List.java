package question1;

public class List {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data=value;
			next=null;
		}
	}
	private Node head;
	private Node tail;
		 
	public List() {
		head=null;
		tail=null;
	}
	
	boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int value)
	{
		Node newNode= new Node(value);
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
		}
		else{
				newNode.next=head;
				head= newNode;
			}
	}
	
	public void display() {
		Node trav=head;
		while(trav!=null) {
			System.out.print(" "+trav.data);
			trav=trav.next;
		}
		System.out.println("");
		System.out.println("The tail is :"+tail.data);		
	}
	
	public void addLast(int value) {
		Node newNode= new Node(value);
		Node trav=head;
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
		}
		else{
			while(trav.next!=null)
				trav=trav.next;
				trav.next=newNode;
				tail=newNode;
			}
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else
			head=head.next;
	}
	
	public void deleteLast() {
		Node trav=head;
		if(isEmpty())
			return;
		else
		while(trav.next.next!=null)
			trav=trav.next;
		tail=trav;
		trav.next=null;
		
	}
	
	
	
}

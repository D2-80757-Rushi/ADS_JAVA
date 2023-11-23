package question3;

public class Program {

	public static void main(String[] args) {
		DQueue d= new DQueue();
		d.pushAtFront(5);
		d.pushAtLast(6);
		d.pushAtLast(8);
		d.pushAtFront(5);
		d.peekAtFront();
		System.out.println(d.peekAtLast());
		d.popAtLast();
		System.out.println(d.peekAtLast());
	}

}

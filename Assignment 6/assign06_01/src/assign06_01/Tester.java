package assign06_01;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
	
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(56);
		bst.insert(8);
		bst.insert(49);
		bst.insert(30);
		bst.insert(32);
		bst.insert(40);
		bst.insert(42);
		bst.insert(27);
		bst.insert(25);
		bst.insert(87);
		bst.inorder();
		
		bst.delete(30);
		bst.inorder();
		
	}

}

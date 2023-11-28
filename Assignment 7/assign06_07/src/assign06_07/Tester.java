package assign06_07;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
	
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(30);
		bst.insert(10);
		bst.insert(5);
		bst.insert(20);
		bst.insert(50);	
		bst.insert(40);
		bst.insert(60);
		bst.inorder();
		
		System.out.println("Siblings levelwise: ");
		bst.siblings();
		
	}
}

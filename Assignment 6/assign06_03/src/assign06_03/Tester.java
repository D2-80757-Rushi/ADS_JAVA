package assign06_03;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
	
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(20);
		bst.insert(10);
		bst.insert(30);
		bst.insert(25);
		bst.insert(50);	
		bst.inorder();
		System.out.println("No of Non leaf in bst nodes = "+bst.countNonLeafNodes());
	}
}

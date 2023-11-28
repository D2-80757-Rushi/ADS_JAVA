package assign06_05;

public class BinarySearchTree {
	
	static class Node{
		int data;
		Node left,right;		
		
		Node(){
			data = Integer.MIN_VALUE;
			left = null;
			right = null;
		}
		
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
		
	}
	
	Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	private boolean isEmpty() {
		return root==null; 
	}
	
	private Node insert(Node node, int value) {
		if(node == null) {
			node = new Node(value);
			return node;
		}
		
		if(node.data > value) {
			 node.left = insert(node.left,value);
		}
		else {
			node.right = insert(node.right, value);
		}
		
		return node;
	}
	
	public void insert(int value) {
		root = insert(root,value);
	}
	
	private void inorder(Node node) {
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.data+ " ");
		inorder(node.right);
	}
	
	public void inorder() {
		System.out.print("Inorder traversal: ");
		inorder(root);
		System.out.println();
	}
	
	private void preorder(Node node) {
		if(node == null)
			return;
		System.out.print(node.data+ " ");
		preorder(node.left);
		preorder(node.right);
	}
	
	public void preorder() {
		System.out.print("Preorder traversal: ");
		preorder(root);
		System.out.println();
	}
	
	private void postorder(Node node) {
		if(node == null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+ " ");
	}
	
	public void postorder() {
		System.out.print("Postorder traversal: ");
		postorder(root);
		System.out.println();
	}
	
	private Node search(Node node, int value) {
		if(node==null) return null;
		
		if(node.data > value) {
			return search(node.left,value);
		}
		else if(node.data < value)
			return search(node.right,value);	
		
		return node;
	}
	
	public Node search(int value) {
		return search(root,value);
	}
	
	public void delete(int value) {
		
		Node parent = null;
		Node temp = root;
		
		while(temp!=null) {
			if(temp.data == value)
				break;
			if(temp.data > value) {
				parent = temp;
				temp = temp.left;
			}
			else {
				parent = temp;
				temp = temp.right;
			}
		}
		
		// delete node with 2 childs;
		if(temp.left!=null && temp.right!=null) {
			
			// 1. find inorder successor.
			parent = temp;
			Node successor = temp.right;
			while(successor.left!=null) {
				parent = successor;
				successor = successor.left;
			}
			// 2. replace data of temp by data of successor
			temp.data = successor.data;
			
			// 3. mark successor for deletion
			temp = successor;
		}

		// delete child node in bst (right child present);
		if(temp.left==null) {
			//1. if temp is root node
			if(temp == root) {
				root = temp.right;
			}
			//2. if temp is left of parent
			else if(temp == parent.left) {
				parent.left = temp.right;
			}
			//3. if temp is right of parent
			else if(temp == parent.right) {
				parent.right = temp.right;
			}
		}
		
		// delete child node in bst (left child present);
		if(temp.right == null) {
			//1. if temp is root node
			if(temp == root) {
				root = temp.left;
			}
			//2. if temp is left of parent
			else if(temp == parent.left) {
				parent.left = temp.left;
			}
			//3. if temp is right of parent
			else if(temp == parent.right) {
				parent.right = temp.left;
			}
		}
		
	}
	
	private int countLeafNodes(Node node) {
		
		if(node.left == null && node.right == null) {
			return 1;
		}
		
		int count = 0;
		if(node.left!=null)
			count += countLeafNodes(node.left);
		if(node.right!=null)
			count += countLeafNodes(node.right);
		
		return count;		
	}
	
	public int countLeafNodes() {
		return countLeafNodes(root);
	}
	
	private int countNonLeafNodes(Node node) {
		
		if(node.left == null && node.right == null) {
			return 0;
		}
		
		int count = 0;
		if(node.left!=null)
			count += countNonLeafNodes(node.left);
		if(node.right!=null)
			count += countNonLeafNodes(node.right);
		
		return count+1;		
	}
	
	public int countNonLeafNodes() {
		return countNonLeafNodes(root);
	}
	
	private int depth(Node node,int value) {
		if(node == null) {
			return -1;
		}
		
		int count =0;
		if(node.data==value)
			return 0;
		else if(node.data > value) {
			count = depth(node.left, value);
		}
		else {
			count = depth(node.right, value);
		}
		
		if(count !=-1)
			return count +1;
		return count;		
	}
	
	public void depth(int value) {
		int count = depth(root,value);
		if(count == -1)
			System.out.println("Node not found....");
		else
			System.out.println("Depth of "+value + " is "+ count);
			
	}
	
	private Node findParent(int value) {
		
		Node parent = null;
		Node trav = root;
		while(trav!=null) {
			if(trav.data == value) {
				return parent;
			}
			else if( trav.data < value) {
				parent = trav;
				trav = trav.right;
			}
			else {
				parent = trav;
				trav = trav.left;
			}
		}
		
		return null;
	}
	
	public void printParent(int value) {
		Node parent = findParent(value);
		if(parent==null) {
			System.out.println("Element has no parent");
		}
		else {
			System.out.println("Parent is: "+ parent.data);
		}
		
	}
}

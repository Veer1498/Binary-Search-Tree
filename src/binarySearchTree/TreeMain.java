package binarySearchTree;
/**
 * 
 * @author Veer.Singa
 *
 */
//Main Class of Binary Tree
public class TreeMain {
	//Main Function
	public static void main(String[] args) {
	/*
	 * Added Welcome Message
	 * Adding Nodes to Binary Tree by Calling its Object.Method
	 * Printing The Binary Tree Using InOrder Technique.
	 * 
	 */
		welcome();
		BinarySearchTree tree = new BinarySearchTree();
		tree.addNode(56);
		tree.addNode(30);
		tree.addNode(70);
		System.out.println("Binary Search Tree After Adding Elements ");
		tree.printTree(tree.root);
	}
	
	//Welcome Function
	static void welcome() {
		System.out.println("Welcome to Binary Search Tree Program");
		System.out.println("=====================================");
	}

}

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
		tree.addNode(22);
		tree.addNode(40);
		tree.addNode(11);
		tree.addNode(3);
		tree.addNode(16);
		tree.addNode(60);
		tree.addNode(95);
		tree.addNode(65);
		tree.addNode(63);
		tree.addNode(67);
		System.out.println("After Adding Remaining Elements into Tree");
		tree.printTree(tree.root);

	}
	
	//Welcome Function
	static void welcome() {
		System.out.println("Welcome to Binary Search Tree Program");
		System.out.println("=====================================");
	}

}

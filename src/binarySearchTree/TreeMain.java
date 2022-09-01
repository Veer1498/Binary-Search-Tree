package binarySearchTree;

import java.util.Scanner;

/**
 * Binary Search Tree Program
 * @author Veer.Singa
 *
 */
//Main Class of Binary Tree
public class TreeMain {
	static boolean flag = true;
	//Main Function
	public static void main(String[] args) {
	/*
	 * Added Welcome Message
	 * Adding Nodes to Binary Tree by Calling its Object.Method
	 * Printing The Binary Tree Using InOrder Technique.
	 * 
	 * For UC2- Elements Given in Figure are 
	 * 56,30,70,22,40,60,95,65,11,3,16,63,67
	 * 
	 * SearchNode Method Called and Passing Element it searches and show present if available
	 * else shows not available
	 * 
	 */
		welcome();
		Scanner sc = new Scanner(System.in);
		BinarySearchTree tree = new BinarySearchTree();
		while(true) {
			System.out.println("\nSelect \n1.Add Element\n2.PrintTree \n3.Search Element \n4.Exit");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Please Enter Element:");
				tree.addNode(sc.nextInt());
				break;
			case 2:
				
				System.out.println("After Adding Remaining Elements into Tree");
				tree.printTree(tree.root);
				break;
			case 3 :
				System.out.println("Please Enter Element To Search :");
				int val = sc.nextInt();
				tree.searchNode(tree.root,val);
				if(flag) {
					System.out.println(val+" Element is Avilable");
				}
				else {
					System.out.println(val+" Element Not Available");
				}
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid Option");	
			}
		}
	}
	
	//Welcome Function
	static void welcome() {
		System.out.println("Welcome to Binary Search Tree Program");
		System.out.println("=====================================");
	}

}

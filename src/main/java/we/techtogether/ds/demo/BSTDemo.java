package we.techtogether.ds.demo;

import we.techtogether.ds.binarysearchtree.BinarySearchTree;

/**
 * 
 * @author sumitkawatra
 *
 */
public class BSTDemo {

	
	private static BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
	
	public static void insertHelper() {
		int []values = new int[]{90,150,120,45,360,30,55,115};
		
		for(int node:values)
			tree.insert(node);
	}
	
	public static void main(String[] args) {
		insertHelper();
		tree.inOrder(); // should sorted
		System.out.println("Done");
	}

}

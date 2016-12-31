/**
 * Binary Search Tree Implementation.
 */
package we.techtogether.ds.binarysearchtree;

import we.techtogether.ds.node.TreeNode;

/**
 * @author tech-together
 *
 */
public class BinarySearchTree<T extends Comparable<T>> {

	protected TreeNode<T> root;

	public BinarySearchTree() {
		root = null;
	}

	public BinarySearchTree(T info) {
		super();
		this.root = new TreeNode<T>(info);
	}
	
	/**
	 * To add node into BST.
	 * @param info
	 */
	public void insert(T info) {
		if (info == null) {
			throw new RuntimeException("Null Node not allowed.");
		} else if (isEmpty()) {
			root = new TreeNode<T>(info);
			System.out.println("First Node Done");
		} else {
			System.out.println("node started inser " + info);
			insertHelper(root, new TreeNode<T>(info));
		}

	}
	
	/**
	 * BST Insert Helper.
	 * @param root
	 * @param node
	 */
	private void insertHelper(TreeNode<T> root, TreeNode<T> node) {
		if (root.getInfo().compareTo(node.getInfo()) < 0) {
			if (root.hasRight()) {
				insertHelper(root.getRight(), node);
			} else {
				root.setRight(node);
				return;
			}
		} else if (root.getInfo().compareTo(node.getInfo()) > 0) {
			if (root.hasLeft()) {
				insertHelper(root.getLeft(), node);
			} else {
				root.setLeft(node);
				return;
			}
		} else if (root.getInfo().compareTo(node.getInfo()) == 0) {
			throw new RuntimeException("Duplictae Node : " + node + " not allowed.");
		}
	}
	
	/**
	 * is Tree Emplty.
	 * @return
	 */
	public boolean isEmpty() {
		return (root == null);
	}

}

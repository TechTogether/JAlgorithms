/**
 * Binary Search Tree Implementation.
 */
package we.techtogether.ds.binarysearchtree;

import java.util.LinkedList;

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
	
	/**
	 * In Order Traversal.
	 */
	public void inOrder() {
		inOrderHelper(root);
	}

	/**
	 * Recursive In Order Traversal.
	 * @param root
	 */
	private void inOrderHelper(TreeNode<T> root) {
		if (root == null) return;
		inOrderHelper(root.getLeft());
		System.out.println(root);
		inOrderHelper(root.getRight());
	}
	
	/**
	 * Pre-Order Traversal.
	 */
	public void preOrder() {
		preOrderHelper(root);
	}

	/**
	 * Recursive Pre-Order Traversal.
	 * @param root
	 */
	private void preOrderHelper(TreeNode<T> root) {
		if (root == null) return;
		System.out.println(root);
		inOrderHelper(root.getLeft());
		inOrderHelper(root.getRight());
	}
	
	/**
	 * Post-Order Traversal.
	 */
	public void postOrder() {
		postOrderHelper(root);
	}

	/**
	 * Recursive Post-Order Traversal.
	 * @param root
	 */
	private void postOrderHelper(TreeNode<T> root) {
		if (root == null) return;
		inOrderHelper(root.getLeft());
		inOrderHelper(root.getRight());
		System.out.println(root);
		
	}
	
	/**
	 * level Order Traversal. 
	 */
	public void levelOrder() {
		if(isEmpty()) return;
		
		LinkedList<TreeNode<T>> queue = new LinkedList<TreeNode<T>>();
		queue.push(root); 
		
		while(!queue.isEmpty()) {
			TreeNode<T> node = queue.remove(0);
			System.out.println(node);
			if(node.hasLeft()) queue.add(node.getLeft());
			if(node.hasRight()) queue.add(node.getRight());
		}
		
	}
	
	/**
	 * To calculate node count.
	 * @return int
	 */
	public int size() {
		if(isEmpty()) return 0;
		else return countHelper(root);
	}
	
	/**
	 * node count helper.
	 * @param root
	 * @return int 
	 */
	public int countHelper(TreeNode<T> root) {
		if(root == null) return 0;
		else return 1 + countHelper(root.getLeft()) + countHelper(root.getRight());
	}
	
	/**
	 * Binary Search on BST.
	 * @param info
	 * @return TreeNode<T>
	 */
	public TreeNode<T> search(T info) {
		if(info == null) throw new RuntimeException("Null is not allowed in Tree");
		if(isEmpty()) return null;
		return searchHelper(root, info);
	}
	
	private TreeNode<T> searchHelper(TreeNode<T> root, T info) {
		if(root == null) 
			return root;
		else if(root.getInfo().compareTo(info) > 0 ) 
			return searchHelper(root.getLeft(), info);
		else if (root.getInfo().compareTo(info) < 0 )
			return searchHelper(root.getRight(), info);
		else return root;
	}
	
	/**
	 * returns true if tree is BST else return false.
	 * @return boolean
	 */
	public boolean isBinarySearch() {
		return isBinarySearchHelper(root);
	}
	
	private boolean isBinarySearchHelper(TreeNode<T> root) {
		if(root == null) return true;
		boolean left =  (root.hasLeft() ? root.getInfo().compareTo(root.getLeft().getInfo()) > 0: true);
		boolean right = (root.hasRight() ? root.getInfo().compareTo(root.getRight().getInfo()) < 0: true);	
//		System.out.println(root + " Left and Right " + left +"    " + right);
		return left && right && isBinarySearchHelper(root.getLeft()) && isBinarySearchHelper(root.getRight());
	}
	
}

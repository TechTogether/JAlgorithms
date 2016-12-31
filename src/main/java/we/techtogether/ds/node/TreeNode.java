/**
 * 
 */
package we.techtogether.ds.node;

/**
 * @author tech-together
 *
 */
public class TreeNode<T extends Comparable<T>> {

	private TreeNode<T> left;
	private T info;
	private TreeNode<T> right;

	public TreeNode() {
		this(null,null,null);
	}
	
	public TreeNode(T info) {
		this(null,info,null);
	}

	public TreeNode(TreeNode<T> left, T info, TreeNode<T> right) {
		super();
		this.left = left;
		this.info = info;
		this.right = right;
	}

	/**
	 * @return the left
	 */
	public TreeNode<T> getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	/**
	 * @return the info
	 */
	public T getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(T info) {
		this.info = info;
	}

	/**
	 * @return the right
	 */
	public TreeNode<T> getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TreeNode [leftChild=" + ((null == left) ? null:left.getInfo()) + ", info=" + info + ", rightChild=" + ((null == right)  ? null:right.getInfo()) + "]";
	}
	
	public boolean hasRight() {
		return (right != null);
	}
	
	public boolean hasLeft() {
		return (left != null);
	}

}

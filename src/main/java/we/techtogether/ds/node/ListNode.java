/**
 * 
 */
package we.techtogether.ds.node;

/**
 * @author tech-together
 *
 */
public class ListNode<T extends Comparable<T>> {
	
	private ListNode<T> prev;
	private T info;
	private ListNode<T> next;
	
	public ListNode() {
		this(null,null,null);
	}

	public ListNode(T info) {
		this(null,info,null);
	}
	
	public ListNode(ListNode<T> prev, T info, ListNode<T> next) {
		super();
		this.prev = prev;
		this.info = info;
		this.next = next;
	}

	/**
	 * @return the prev
	 */
	public ListNode<T> getPrev() {
		return prev;
	}



	/**
	 * @param prev the prev to set
	 */
	public void setPrev(ListNode<T> prev) {
		this.prev = prev;
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
	 * @return the next
	 */
	public ListNode<T> getNext() {
		return next;
	}



	/**
	 * @param next the next to set
	 */
	public void setNext(ListNode<T> next) {
		this.next = next;
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListNode [prevNode=" + ((null != prev) ? prev.getInfo() : null) + ", info=" + info
				+ ", nextNode=" + ((null != next) ? next.getInfo() : null) + "]";
	}

}

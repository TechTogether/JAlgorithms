/**
 * 
 */
package we.techtogether.ds.linkedlist;

import we.techtogether.ds.node.ListNode;

/**
 * @author tech-together
 *
 */
public class JLinkedList<T extends Comparable<T>> {

	protected ListNode<T> head;

	public JLinkedList() {
		head = null;
	}

	public JLinkedList(T info) {
		head = new ListNode<T>(info);
	}

	/**
	 * To forward iteration of JLinkedList.
	 */
	public void iterate() {
		ListNode<T> temp = peek();
		while (null != temp) {
			System.out.println(temp);
			temp = temp.getNext();
		}
	}

	/**
	 * To add node at last position of JLinkedList.
	 * 
	 * @param info
	 */
	public void add(T info) {
		if (info == null) 
			throw new RuntimeException("Null not allowed.");
		else if (isEmpty()) {
			head = new ListNode<T>(info);
		} else {
			ListNode<T> temp = peek();
			// seek last node.
			while (null != temp && null != temp.getNext()) {
				temp = temp.getNext();
			}
			temp.setNext(new ListNode<T>(info));
		}
	}
	
	public void addFirst(T info) {
		if (info == null) 
			throw new RuntimeException("Null not allowed.");
		if (isEmpty()) 
			head = new ListNode<T>(info);
		else {
			ListNode<T> node = new ListNode<T>(info);
			node.setNext(head);
			head = node;
		}
	}
	
	/**
	 * return LinkedList size.
	 * @return
	 */
	public int size() {
		if(isEmpty()) return 0;
		
		ListNode<T> temp = peek();
		int count = 0;
		if(temp != null) {
			count++;
			temp = temp.getNext();
		}
		return count;
		
	}

	/**
	 * To check if list is empty or not.
	 * 
	 * @return true if empty else return false
	 */
	public boolean isEmpty() {
		return null == head;
	}

	/**
	 * 
	 * @return head node if list is non empty
	 */
	public ListNode<T> peek() {
		if (isEmpty())
			throw new RuntimeException("LinkedList is Empty.");
		return head;
	}

}

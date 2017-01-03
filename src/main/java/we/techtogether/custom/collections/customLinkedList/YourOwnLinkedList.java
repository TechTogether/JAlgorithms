package we.techtogether.custom.collections.customLinkedList;

import we.techtogether.ds.node.ListNode;

public class YourOwnLinkedList<T extends Comparable<T>> {
	private ListNode<T> headNode;
	private int counter;

	public YourOwnLinkedList() {
		super();
//		this.headNode = new ListNode(null);
	}

	public boolean isEmpty() {
		return headNode.getNext() == null;
	}

	public void clear() {
		headNode.setNext(null);
	}

	public void add(T obj) {
		if (headNode == null) {
			headNode = new ListNode<T>(obj);
		}

		ListNode<T> tempNode = new ListNode<T>(obj);
		ListNode<T> currentNode = headNode;
		if (currentNode != null) {
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(tempNode);
		}
		counter++;
	}

	public void addFirst(T obj) {
		ListNode<T> newNode = new ListNode<T>(obj);
		newNode.setNext(headNode);
		this.headNode = newNode;
	}

	public void addLast(T obj) {
		add(obj);
	}

	public boolean contains(T obj) {
		ListNode<T> ln = headNode;
		while (ln.getNext() != null)
			if (ln.getInfo() == obj)
				return true;
			else
				ln = ln.getNext();
		return false;
	}

	public void print() {
		ListNode<T> ln = headNode;
		while (ln.getNext() != null) {
			ln=ln.getNext();
			System.out.println(ln.getInfo());
			
		}
	}
}
package we.techtogether.ds.demo;

import we.techtogether.ds.linkedlist.JLinkedList;

public class JLinkedListDemo {

	public static JLinkedList<Integer> list = new JLinkedList<Integer>();;
	
	public static void main(String[] args) {
		create();
		list.iterate();
	}
	
	public static void create() {
		for(int val:new int[]{11,22,33,44,55,66,77,88,99})
		list.add(val);
		
	}

}

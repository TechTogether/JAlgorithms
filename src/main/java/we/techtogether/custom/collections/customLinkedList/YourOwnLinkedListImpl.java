 package we.techtogether.custom.collections.customLinkedList;


public class YourOwnLinkedListImpl {
	 public static void main(String[] args) {
		 YourOwnLinkedList<String> theList = new YourOwnLinkedList<String>();
		   theList.add("DataStructure");
		   theList.add("Algorithms");
		   theList.add("Artificial Intelligence");
		   theList.print();
		   
		   System.out.println("Does this list contains \"Algorithm\" : "+theList.contains("Algorithms"));
		   }
}
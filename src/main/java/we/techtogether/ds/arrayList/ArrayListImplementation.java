package we.techtogether.ds.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author poojaJain
 * 
 */

public class ArrayListImplementation {

	public static void main(String[] args) {
		List<String> arr1 = new ArrayList<>();

		// method one adding an element.
		arr1.add("Pooja");
		arr1.add("Jain");
		arr1.add("MCA");
		arr1.add("NIIT");
		
		System.out.println("*Simple List* \n\n1- Check if list is empty, isEmpty()-: "
				+ arr1.isEmpty());
		// iterate using Iterator interface.
		System.out.println("2- Iterated through Iterator interface.");
		Iterator<String> itr = arr1.iterator();
		while (itr.hasNext())
			System.out.print(itr.next() + "\t");

		System.out.println("\n\n3- Adding an element at a specific position, and Iterate using for each loop");
		// method 2 - adding at a specific position.
		arr1.add(3, "#CDAC");
		// iterate using for each loop
		for (String str : arr1)
			System.out.print(str + "\t");

		System.out.println("\n\n4-Adding an another ListCollection in first list (Tech, Together)");
		List<String> arr2 = new ArrayList<>();
		// method one adding an element.
		arr2.add("Tech");
		arr2.add("Together");

		arr1.addAll(arr2);
		for (String str : arr1)
			System.out.print(str + "\t");
		
		System.out.println("\n\n5-Adding an another ListCollection in first list at spcific position (at 2, Banasthali, university)");
		List<String> arr3 = new ArrayList<>();
		// method one adding an element.
		arr3.add("*Banasthali");
		arr3.add("*University");

		arr1.addAll(3, arr3);
		for (String str : arr1)
			System.out.print(str + "\t");
		
		System.out.println("\n\nGet a small sub list from list "+arr1.subList(3, 7));
		System.out.println("\n6- To check for a particular string(Banasthali) in list -"+arr1.contains("*Banasthali"));
		System.out.println("\n7- To Check a complete collection (Tech together) is there - "+arr1.containsAll(arr2));
		System.out.println("\n8-Element at 3rd index - "+arr1.get(3));
		System.out.println("\n9-position of an Jain in the list -"+arr1.indexOf("Jain"));
		System.out.println("\n10-replacing an element from a specific position, replacing -"+arr1.set(2, "B.com"));
		for (String str : arr1)
			System.out.print(str + "\t");
		System.out.println("\n11-Length of list "+arr1.size());
		System.out.println("\n12-removing University from list -"+arr1.remove("University"));
		System.out.println("\n13- Removing collection -"+arr1.removeAll(arr3));
		for (String str : arr1)
			System.out.print(str + "\t");
		
		System.out.println("\n\n14 Retaining only 'Tech together' list- "+arr1.retainAll(arr2));
		for (String str : arr1)
			System.out.print(str + "\t");
		arr1.clear();
		System.out.println("\n\n Calling Clear() method to wipe out the list ");
		System.out.println("*Check if list is empty, isEmpty()-: "+ arr1.isEmpty());

	}
}
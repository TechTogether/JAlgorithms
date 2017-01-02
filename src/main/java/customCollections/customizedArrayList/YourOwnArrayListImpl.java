package customCollections.customizedArrayList;

public class YourOwnArrayListImpl {
	public static void main(String[] args) {

		YourOwnArrayList<String> strList = new YourOwnArrayList<>();

		strList.add("TechTogether");
		strList.add("TalkTogether");
		strList.add("WalkTogether");

		System.out.println("List size =" + strList.size());
		System.out.println("Element at 2nd position: "+strList.Get(1));
		strList.remove(1);
		System.out.println("After removing element list size =" + strList.size());
		System.out.println("Check if list isEmpty:"+strList.isEmpty());
		System.out.println("Iterate over list");
		strList.add(2, "LearnTogether");
		for (int i=0;i<strList.size();i++)
			System.out.println(strList.Get(i));
		
		
	}

}

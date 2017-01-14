package we.techtogether.sortings;

/**
 * 
 */
public class InsertionSorting<T> {
	public static void main(String args[]) {
		Integer[] inputArray = new Integer[]{5,4,6,7,8,3,2,6,9};
		ISImplementation isImplementation=new ISImplementation(inputArray);
//		isImplementation.sort(inputArray);
		isImplementation.sortUsingRecursive(inputArray, 0, inputArray.length-1);
		isImplementation.printArray();
	}

}

class ISImplementation {
	private Integer[] arrToSort;
	

	public ISImplementation(Integer[] list) {
		super();
		this.arrToSort = list;
	}

	public void sort(Integer[] arrObject) {
		int n = arrObject.length;
		for (int i = 0; i < n; i++) {
			Integer value = arrObject[i];
			int j = i;
			while (j > 0
					&& value<arrObject[j - 1]) {
				arrObject[j] = arrObject[j - 1];
				j--;
			}
			arrObject[j] = value;
		}
	}

	
	public void sortUsingRecursive(Integer[] arr,int index, int len)
	{
		Integer value=arr[index];
		int j=index;
		while(j>0 && arr[j-1]>value)
		{	
			arr[j]=arr[j-1];
			j--;
		}
		arr[j]=value;
		if (index+1<=len)
			sortUsingRecursive(arr,index+1,len);
	}
	public void printArray() {
		for (int i = 0; i < arrToSort.length; i++)
			System.out.println(arrToSort[i]);
	}
}
/**
Worst case time complexity of insertion sort is O(n2). The worst case happens when the array is reverse sorted.
Best case time complexity of insertion sort is O(n). The best case happens when the array is already sorted.
Auxiliary space used by iterative version is O(1).
 **/
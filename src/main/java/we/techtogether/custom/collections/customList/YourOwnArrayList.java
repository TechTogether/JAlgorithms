package we.techtogether.custom.collections.customList;

import java.util.Arrays;

public class YourOwnArrayList<E> {

	private static final int Basic_Size = 5;

	

	private int size = 0;

	private Object[] customArrayList;

	public YourOwnArrayList() {
		super();
		this.customArrayList = new Object[Basic_Size];
	}

	public YourOwnArrayList(int userDefine_Size) {
		super();
		if (userDefine_Size < 0)
			throw new IllegalArgumentException("invalid/ illegal capacity "
					+ userDefine_Size
					+ ". Size cannot be zero or less then zero.");
		else
			this.customArrayList = new Object[userDefine_Size];
	}

	public int size() {
		return size;
	}

	public Object[] getCustomArrayList() {
		return customArrayList;
	}

	// implementing ArrayList basic/default methods.
	public void checkCapacity(int miniCap) {
		if (miniCap - customArrayList.length > 0) {
			increseListSize(miniCap);
		}
	}

	public void increseListSize(int currentSize) {
		int newCap = customArrayList.length + (customArrayList.length / 2);
		customArrayList = Arrays.copyOf(customArrayList, newCap);

	}

	public boolean add(Object object) {
		checkCapacity(size);
		customArrayList[size++] = object;
		return true;
	}

	public void add(int position, Object obj) {
		checkCapacity(size + 1);
		System.arraycopy(customArrayList, position, customArrayList,
				position + 1, size - position);
		customArrayList[position] = obj;
		size++;
	}

	public Object remove(int position) {
		Object objToRemove = (Object) customArrayList[position];
		int removeNumber = size - position - 1;
		if (removeNumber > 0) {
			System.arraycopy(customArrayList, position + 1, customArrayList,
					position, removeNumber);
		}
		customArrayList[--size] = null;
		return objToRemove;
	}

	public boolean removeAll(Object[] obj) {
		customArrayList = null;
		size = 0;
		return true;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Object Get(int index) {
		if (index >= size)
			throw new ArrayIndexOutOfBoundsException(
					"array index out of bound exception with index at" + index);
		else
			return (Object) customArrayList[index];
	}
}

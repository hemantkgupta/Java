package chapter05.item24;

import java.util.Arrays;

public class SupressWarningTest {

	public static int size;
	
	public Object[] elements;

	public static void main(String[] args) {
		
	}

	// Adding local variable to reduce scope of @SuppressWarnings
	public <T> T[] toArray(T[] a) {
		
		if (a.length < size) {
			// This cast is correct because the array we're creating
			// is of the same type as the one passed in, which is T[].
			@SuppressWarnings("unchecked")
			T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
			return result;
		}
		System.arraycopy(elements, 0, a, 0, size);
		if (a.length > size)
			a[size] = null;
		return a;
	}

}
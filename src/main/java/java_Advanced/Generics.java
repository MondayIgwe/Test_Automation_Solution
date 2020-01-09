package java_Advanced;

public class Generics {

	public static void main(String[] args) {
		
		Integer[] intArray = {2,3,4,5,67,8};
		Double[] doubleArray = {2.3, 8.5,6.6};
		Character[] charArray = {'H','E','L','L','O'};
		
		System.out.println("Integer Array");
		printArray(intArray);
		System.out.println();
		System.out.println("Double Array");
		printArray(doubleArray);
		System.out.println();
		System.out.println("Character Array");
		printArray(charArray);
		
		
		
		System.out.println();
		
		int compare =  maximum(2, 3, 4);
		System.out.printf("Max of %d, %d and %d is %d\n\n", 2,3,4, compare);
	}

	public static <E> void printArray(E[] inputArray) {
		for(E element: inputArray){
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0){
			max = z;
		}
		
		return max;
		
	}
}

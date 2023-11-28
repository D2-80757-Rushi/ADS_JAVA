package assign07_01;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		
		Heap h = new Heap();
		// 0th index is never used;
		int arr[] = new int[]{-9999, 84,70,5,40,63,412,648,30,7};
		
		System.out.print("Before Sort: ");
		for(int i=1; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		h.heapSort(arr);
		System.out.print("After Sort: ");
		for(int i=1; i<arr.length; i++)
			System.out.print(arr[i]+" ");

	}

}

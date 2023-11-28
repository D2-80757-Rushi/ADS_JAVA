package assign07_02;

import java.util.Arrays;

public class MaxHeap {
	private int SIZE;
	public MaxHeap() {
		SIZE = 0;
	}
	
	public void addHeap(int arr[]) {
		SIZE++;
		int ci = SIZE;
		int pi = ci / 2;
		while(pi >= 1) {
			
			if(arr[pi] > arr[ci])
				break;
			
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			
			ci = pi;
			pi = ci / 2;
		}
	}
	
	public int delHeap(int arr[]) {
		
		int max = arr[1];
		arr[1] = arr[SIZE];
		arr[SIZE] = max;
		
		SIZE--;
		
		int pi = 1;
		int ci = 1 * 2;
		while(ci <= SIZE) {
			
			if(ci + 1 <= SIZE && arr[ci + 1] > arr[ci])
				ci = ci + 1;
			
			if(arr[pi] > arr[ci])
				break;
			
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			
			pi = ci;
			ci = pi * 2;
		}
		return  max;		
	}
	
	public void createHeap(int arr[]) {
		for(int i = 1 ; i < arr.length ; i++)
			addHeap(arr);
	}
		
	public void deleteHeap(int arr[]) {
		for(int i = 1 ; i < arr.length ; i++)
			delHeap(arr);
	}
	
	public void heapSort(int arr[]) {
		
		createHeap(arr);		
		deleteHeap(arr);
	}

}

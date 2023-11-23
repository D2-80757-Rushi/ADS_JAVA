package question3;

public class CompCount {

	public static int linearSearch(int arr[], int key) {
		int comp=0;
		for(int i = 0 ; i < arr.length ; i++) {
			comp++;
			if(key == arr[i]) {
				System.out.println("The No of Comparison in linear search is :"+ comp);
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int arr[], int key) {
		int comp=0;
		int left = 0, right = arr.length-1;
		while(left <= right) {
			int mid = (left + right) / 2;
			comp++;
			if(key == arr[mid]) {
				System.out.println("The No of Comparison in Binary search is :"+ comp);
				return mid;
			}
			else if(key > arr[mid])
				left = mid + 1;else
				right = mid - 1;	}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr= {55,66,77,88,99,55,67};
		int index=linearSearch(arr, 99);
		index=binarySearch(arr, 66);
		

	}

	
}

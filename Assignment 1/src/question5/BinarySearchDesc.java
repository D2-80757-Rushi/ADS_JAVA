package question5;

public class BinarySearchDesc {

	public static int binarySearch(int arr[], int key) {
		int left = 0, right = arr.length-1;
		while(left <= right) {
			int mid = (left + right) / 2;
			if(key == arr[mid])
				return mid;
			else if(key < arr[mid])
				left = mid + 1;	
			else
				right = mid - 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {99,88,65,42,31,20,10};
		int index=binarySearch(arr, 88);
		if(index==-1)
			System.out.println("Not found");
		else 
			System.out.println("Element found at index :"+ index);
		}
	}
	


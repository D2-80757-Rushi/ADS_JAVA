package question9;

public class SelectionSortCompare {

	public static int selectionSort(int arr[]) {
		int comp=0;
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				comp++;
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return comp;
	}
	public static void main(String[] args) {
		int arr[] = {10, 20, 15, 3, 4, 4, 1};
		int count=selectionSort(arr);
		System.out.println("The No of Comparisons is :" +count);
	}

}

package question2;

public class Tester {

	public static void main(String[] args) {
		
		int[] arr= {55,66,77,88,99,55,67};
		int index=LinearSearch.LinearSearchLast(arr,55);
				if(index != -1)
					System.out.println("Key is found at index " + index);
				else
					System.out.println("Key is not found");
				
	}
}

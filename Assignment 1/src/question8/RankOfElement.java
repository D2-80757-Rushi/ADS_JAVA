package question8;

public class RankOfElement {

	public static int Rank(int arr[],int key)
	{
		int counter=0;
	for(int i=0;i<arr.length;i++)
	{
		if(key>=arr[i])
			counter++;
	}
	return counter;
	}
	public static void main(String[] args) {
		
		int[] arr= {10, 20, 15, 3, 4, 4, 1};
		int rank=Rank(arr, 15);
		System.out.println("The Rank of element is "+ rank);
		
		
	}

}

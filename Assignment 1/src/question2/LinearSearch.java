package question2;

public class LinearSearch {

	public static int LinearSearchLast(int arr[],int key)
	{
	for(int i=arr.length-1;i>=0;i--)
	{
		if(arr[i]==key)
			return i;
	}
	return -1;
	}
}

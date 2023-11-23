package question6;

public class LinearSearchOccurence {

	public static int LinearSearch(int arr[],int key,int occur)
	{
		int count=0;
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]==key)
		{	count++;
		if(occur==count)
			return i;
		}
	}
	return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,5,2,6,8,5,8,6,5,7,6,7,3,5,9,1,3,4,3,7,6,8,1,1,5,4};
		int index=LinearSearch(arr, 5, 4);
		if(index==-1)
			System.out.println("Not found");
		else 
			System.out.println("Element found at index :"+ index);
		}
	}



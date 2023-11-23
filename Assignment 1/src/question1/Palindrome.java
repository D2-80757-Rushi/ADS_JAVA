package question1;

public class Palindrome {

	public static  boolean isPalindromeIterative(String str) {
	    int left = 0;
	    int right = str.length() - 1;

	    while (left < right) {
	        if (str.charAt(left) != str.charAt(right)) {
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;
	}

	public static boolean isPalindromeRecursive(String str) {
	    return isPalindromeRecursiveHelper(str, 0, str.length() - 1);
	}

	private static boolean isPalindromeRecursiveHelper(String str, int left, int right) {
	    if (left >= right) {
	        return true;
	    }

	    return (str.charAt(left) == str.charAt(right)) && isPalindromeRecursiveHelper(str, left + 1, right - 1);
	}

	public static boolean isPalindromeStringBuilder(String str) {
	    String reversed = new StringBuilder(str).reverse().toString();
	    return str.equals(reversed);
	}

	public static void main(String[] args) {
		String str1="madam";
		String str2="abcd";
		String str3="reviver";
		
		//boolean x=isPalindromeIterative(str1);
		/*Time Complexity-Will iterate on string Length=O(n)
		 Space Complexity-3 variables are created always so constant=O(1);
		 */
		
		boolean x=isPalindromeRecursive(str2);
		/*Time Complexity-Will recursion call on string Length=O(n)
		 Space Complexity-Multiple FAR will be created of string length=O(n);
		 */
	
		//boolean x=isPalindromeStringBuilder(str3);
		/*Time Complexity-Will depend on string Length=O(n)
		 Space Complexity-1 String will be created to store reversed string =O(n);
		 */
	
		
		if(x==true)
			System.out.println("It is a Palindrome");
		else
			System.out.println("Not a Palindrome");
		

	}
}

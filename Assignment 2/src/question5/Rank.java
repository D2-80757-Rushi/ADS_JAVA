package question5;

import java.util.Scanner;

public class Rank {
	
	public static int priority(char opr) {
		switch(opr) {
		case '$': return 10;
		case '/': return 9;
		case '*': return 9;
		case '%': return 9;
		case '+': return 8;
		case '-': return 8;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Operator");
		String s1=sc.next();
		System.out.println("Enter 2nd Operator");
		String s2=sc.next();
		char ele1=s1.charAt(0);
		char ele2=s2.charAt(0);
		System.out.println("Priority of 1st operator :" + priority(ele1));
		System.out.println("Priority of 1st operator :" + priority(ele2));
		if(priority(ele1)>priority(ele2))
		System.out.println("The Priority of "+ ele1+" is higher");
		else
			System.out.println("The Priority of "+ ele2+" is higher");
		
	}
}

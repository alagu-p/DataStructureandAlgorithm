package recursion;

import java.util.Scanner;

public class Factorial {
	
	/*
	 * Recursion is a process of function, calling itself
	 * 
	 * factorial(3)=3*2*1
	 * 
	 * factorial(3)=3* factorial(2)
	 *  factorial2)=2* factorial(1)
	 *  factorial(1)=1* factorial(1)
	 * 
	 */
	
	/*
	 * def factorial(n):
	 * 		if n==0:
	 * 			return 1;
	 * 		else:
	 * 			return n*factorial(n-1)
	 */
	private static int factorialFinder(int num) {
		if(num==0)
			return 1;
		else
		{
//			System.out.println(""+num+" : "+factorialFinder(num-1));
			return num*factorialFinder(num-1);
		}
		 
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		//Way -1
		System.out.println("Factorial : "+factorialFinder(num));
	
		//way -2
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial : "+fact);
		sc.close();		
	}

}

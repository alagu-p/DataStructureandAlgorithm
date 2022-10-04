package numbers;

import java.util.Scanner;

public class DuckNumber {
	
	/* 
	 *  Duck number is number zero inside it.
	 *  1444054 ==> Duck number
	 *  
	 *  12345 ==> Not a duck number
	 *  
	 */

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number=sc.nextInt();
		boolean isDuck=false;
		while(number !=0)
		{
			int digit=number % 10;
			number /=10;
			if(digit==0)
				isDuck=true;
		}
		if(isDuck)
			System.out.println("Duck Number");
		else
			System.out.println(" Not a duck Number");
		
		sc.close();
	}

}

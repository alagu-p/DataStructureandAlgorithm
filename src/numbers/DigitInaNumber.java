package numbers;

import java.util.Scanner;

public class DigitInaNumber {
	
	
	/*
	 *  for Example
	 *  
	 *  input
	 *  12345
	 *  out put
	 *  54321
	 */

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int number=sc.nextInt();
		
		while(number !=0)
		{
			int digit= number % 10;
			System.out.print(digit +" ");
			number=number/10;
			 
		}
		
		
		sc.close();
	

	}

}

package numbers;

import java.util.Scanner;

public class NivenNumber {
	
	/*
	 * 0
	 * Niven Number:
	 * 10 12 18 20 21
	 * 
	 * 1+0=1 10%1=0
	 * 1+2=3  12%3=
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number=sc.nextInt();
		int temp=number;
		int sum=0;
		while(number!=0)
		{
			int digit=number%10;
			sum=sum+digit;
			number /=10;
		}
		if(temp%sum==0)
		{
			System.out.println("Niven Number...");
		}
		else {
			System.out.println("Not Niven Number.....");
		}
		sc.close();
		
		
		

	}

}

package numbers;

import java.util.Scanner;

public class PerfactNumberChecker {
/*
 *  6
 *  6%i==> 1+2+3=6
 *  1+2+4+7+14=28
 *  
 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int number=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=(number/2);i++)
		{
			if(number%i==0)
				sum+=i;
				
		}
		if(sum==number)
			System.out.println("Perfact Number...");
		else
			System.out.println("Not Perfact Number....");
		sc.close();
		

	}

}

package numbers;

import java.util.Scanner;

public class SpecialTwoDigitNumber {
	/*
	 * Special Number
	 * 
	 * 29 ,59
	 * 2+9=11 ,2*9=18==> 11+18=29;
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number two Digit : ");
		int number=sc.nextInt();
		int sum=0,msum=1,total,temp=number;
		
		while(number!=0)
		{
			int digit=number%10;
			sum=digit+sum;
			msum=msum*digit;
			number /=10;
		}
		total=sum+msum;
		if(total==temp)
			System.out.println("Special Number ...");
		else
			System.out.println("Not a Special Number.....");
		
		sc.close();

	}

}

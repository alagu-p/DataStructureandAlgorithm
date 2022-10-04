package numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number=sc.nextInt();
		int  sum=0 ,copyNumber=number;
		
		while(number !=0)
		{
			int digit=number %10;
			sum =(sum*10)+digit;
			number /=10;
		}
		if(sum==copyNumber)
			System.out.println("Palindrome..");
		else
			System.out.println("Not Palindrome..");
		sc.close();
	}

}

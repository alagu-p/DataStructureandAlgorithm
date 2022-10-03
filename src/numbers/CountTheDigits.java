package numbers;

import java.util.Scanner;

public class CountTheDigits {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number=sc.nextInt();
		int count=0;
		
		while(number !=0)
		{
			number /=10;
			count++;
		}
		System.out.println("Count the Digit is : "+ count);
		
		sc.close();
	}

}

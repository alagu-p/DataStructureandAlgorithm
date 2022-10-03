package numbers;

import java.util.Scanner;

public class SumOfDigits {
	
	/*
	 *  input
	 *  12345
	 *  output
	 *  1+2+3+4+5=15
	 */

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int number=scanner.nextInt();
		int sum=0;
		
		while(number !=0)
		{
			int digit=number % 10;
			sum +=digit;
			number=number/10;
			
		}
		System.out.println("Sum Of digits : "+sum);
		scanner.close();
		
	}

}

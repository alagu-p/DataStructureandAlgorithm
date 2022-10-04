package numbers;

import java.util.Scanner;

public class SumOfPrimeDigits {
	
	/*
	 *  input
	 *  6789
	 *  out put
	 *  7 only prime number digits
	 *
	 */

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int number=scanner.nextInt();
		int sum=0;
		
		while(number !=0)
		{
			int digit=number % 10;
			if(digit==2 || digit==3 ||digit==5 ||digit==7)
			{
				sum +=digit;
			}
			number /=10;
		}
		System.out.println("Sum of Prime Number Digits :"+sum);
		scanner.close();
		
		
		

	}

}



// test git commit
// test git commit
// test git commit
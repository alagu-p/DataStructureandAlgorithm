package numbers;

import java.util.Scanner;

public class FibonacciSeriesRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			System.out.print(fibonacci(i)+" ");
		}
		sc.close();
		

	}

	private static int fibonacci(int i) {
		if(i==0 || i==1)
			return i;
		else
			return fibonacci(i-1)+fibonacci(i-2);
	}

}

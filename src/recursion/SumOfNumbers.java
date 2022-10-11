package recursion;

import java.util.Scanner;

public class SumOfNumbers {
	public static int sum(int n)
	{
		if(n<=1)
			return n;
	
	else {
		return n+sum(n-1);
	}
	}

	public static void main(String[] args) {
	
		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in) ;
		int num=sc.nextInt();
		sum(num);
		sc.close();
	}

}

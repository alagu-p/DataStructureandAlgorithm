package numbers;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number=sc.nextInt();
		int sum=0;
		
		while(number !=0)
		{
			int digit=number % 10;
			
			sum =(sum*10)+digit;
			number /=10;
			
		}
		System.out.println("Reverse Number : "+sum);
		sc.close();
	}

}

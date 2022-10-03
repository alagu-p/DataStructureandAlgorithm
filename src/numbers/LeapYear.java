package numbers;

import java.util.Scanner;

public class LeapYear {
	
	
	/*
	 * Given a year
	 * 
	 * year %4==0 and year % 100 !=0
	 * 
	 * leap 
	 * 
	 * or not a leap year
	 */

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Year : ");
		int year=sc.nextInt();
		
		if(year % 4==0 && year %100 !=0)
			System.out.println("Leap Year.");
		else
			System.out.println("Not a leap year");
		sc.close();
		

	}

}

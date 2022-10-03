package numbers;

import java.util.Scanner;

/*				Even or Odd
 * 		Given a Number number
 * 
 * 			number%2 equals 0
 * 				Even 
 * 				Odd
 */

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		int number=sc.nextInt();
		
		if(number<=0)
			System.out.println("Invalide Number.");
		else {
		if(number % 2==0)
			System.out.println(number+" Even Number");
		else
			System.out.println(number+ "   Odd Number");
		}
		
		sc.close(); 
		
	}

}

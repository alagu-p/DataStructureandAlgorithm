package numbers;

import java.util.Scanner;

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

package numbers;

import java.util.Scanner;

public class CreditScore {
	
	
	/*
	 *  400 to 600 ==> Silver Card
	 *  600 to 800 ==> Gold Card
	 *  800 to 850 ==> Platinum Card
	 *  
	 */

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Credit Score: ");
		int creditScore=sc.nextInt();
		
		if(creditScore >=400 && creditScore <=850)
		{
			if(creditScore>=400 && creditScore <=600)
				System.out.println("Silver Card");
			else if(creditScore >600 && creditScore <=800)
				System.out.println("Gold Card");
			else
				System.out.println("Platinum Card");
			
		}
		else
		{
			System.out.println("Invalid Credit Score...");
		}
		
		sc.close();
		
	}

}

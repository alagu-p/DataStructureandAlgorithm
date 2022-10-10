package strings;

import java.util.Scanner;

public class ConsecutiveDuplicateFinder {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		
		String input=sc.nextLine();
		boolean found=false;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==input.charAt(i+1))
			{
				found=true;
				break;
			}
			
		}
		System.out.println("Consicutive charcter : "+found);
		sc.close();
				
	}

}

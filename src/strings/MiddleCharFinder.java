package strings;

import java.util.Scanner;

public class MiddleCharFinder {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		
		String input=sc.nextLine();
		int len=input.length();
		
		if(len % 2==0)
			System.out.println(input.substring(len/2-1,len/2+1));
		else
			System.out.println(input.substring(len/2,len/2+1));
		sc.close();
	}

}

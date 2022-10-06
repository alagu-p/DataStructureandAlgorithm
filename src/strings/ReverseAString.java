package strings;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Text : ");
		String text=sc.nextLine();
		//Method-1
		stringreverse1(text);
		//Method -2 inbuild function
		System.out.println("\n"+new StringBuffer(text).reverse() );
		sc.close();

	}

	private static void stringreverse1(String text) {
		for(int i=text.length()-1;i>=0;i--)
			System.out.print(text.charAt(i));
			
		
	}

}

package strings;

import java.util.Scanner;

public class CheckIfStringEndsWithaString {
	
	/*
	 * Powerful
	 * 01234567 length-8
	 * ful
	 * 012 		lenght-3
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Word : ");
		String word=sc.nextLine();
		System.out.println("Enter the end String : ");
		String end=sc.nextLine();
		//Method -1
		endWithString(word,end);
		//Method -2
		int start=word.length()-end.length();
		System.out.println(start);
		int count=0;
		for(int i=start;i<word.length();i++)
		{
			for(int j=0;j<end.length();j++)
			{
				if(word.charAt(i)==end.charAt(j))
				{
					System.out.println(word.charAt(i));
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		if(count==end.length())
			System.out.println("Yes end with : "+end);
		else
			System.out.println("Not end with : "+end);
		
		sc.close();
		
	}

	private static void endWithString(String word, String end) {
		int count=0;
		for(int i=word.length()-1,j=end.length()-1;j>=0;i--,j--)
		{
			if(word.charAt(i)==end.charAt(j))
			{
				count++;
			}
		}
		if(count==end.length())
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}

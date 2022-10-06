package strings;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Text : ");
		String text=sc.nextLine();
		//Method -1
		countWord(text);
		//method -2
		System.out.println("count : "+text.split(" ").length);
		//Method -3 solve
		text+=" ";
		int count=0;
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)==' ')
				count++;
		}
		System.out.println("Total word count : "+count);
		sc.close();
		
	}

	private static void countWord(String text) {
		int count = 0;
		for(int i=0;i<text.length();i++)
		{
			if(Character.isWhitespace(text.charAt(i)))
				count++;
		}
		System.out.println("Total word count 1 : "+(count+1));
		
	}

}
